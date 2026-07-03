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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import clicker_Generator.game;

public class GeneratorTest extends AbstractHandler{
    public static void main(String[] args) throws Exception {
        // Wichtig bei Standalone-Ausführung: Package + Resource-Factory registrieren
 
    }

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
	       clicker_Generator.Clicker_GeneratorPackage.eINSTANCE.eClass(); // lädt das Metamodell
	        
	        ResourceSet resourceSet = new ResourceSetImpl();
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
	            .put("clicker_generator", new XMIResourceFactoryImpl());

	        IFile file = (IFile) ((IStructuredSelection) HandlerUtil.getCurrentSelection(event)).getFirstElement();
	        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

	        Resource resource = resourceSet.getResource(uri, true);

	        game game = (game) resource.getContents().get(0);

	        String html = new ClickerHtmlGenerator().generate(game);

	        System.out.println(html);

	        System.out.println("Fertig! Öffne output/cookieClicker.html im Browser.");
		return null;
	}
}