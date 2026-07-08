package clicker_Generator.presentation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import clicker_Generator.game;

public class GeneratorTest extends AbstractHandler {
	public static void main(String[] args) throws Exception {
		// Wichtig bei Standalone-Ausführung: Package + Resource-Factory registrieren

	}

	@Override
        public Object execute(ExecutionEvent event) throws ExecutionException {
                // TODO Auto-generated method stub
               clicker_Generator.Clicker_GeneratorPackage.eINSTANCE.eClass();
// lädt das Metamodell

                ResourceSet resourceSet = new ResourceSetImpl();

resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                    .put("clicker_generator", new XMIResourceFactoryImpl());

                IFile file = (IFile) ((IStructuredSelection)
HandlerUtil.getCurrentSelection(event)).getFirstElement();
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

                Resource resource = resourceSet.getResource(uri, true);

                game game = (game) resource.getContents().get(0);

                String html = new ClickerHtmlGenerator().generate(game);

             // Build path: <project>/output/cookieClicker.html
             IProject project = file.getProject();
             IFolder outputFolder = project.getFolder("output");
             try {
                    if (!outputFolder.exists()) {
                        outputFolder.create(true, true, null);
                    }

                    Path outputPath =
Paths.get(outputFolder.getLocation().toOSString(), "clickerGame.html");
                    Files.write(outputPath,
html.getBytes(StandardCharsets.UTF_8));

                    outputFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
                } catch (CoreException e) {
                    throw new ExecutionException("Failed to write generated HTML output", e);
                } catch (IOException e) {
                    throw new ExecutionException("Failed to write generated HTML file", e);
                }

             System.out.println("Fertig! Öffne output/clickerGame.html im Browser.");
                return null;
        }
}