package test;

import org.eclipse.emf.ecore.EObject;
import clicker_Generator.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.nio.file.Files;
import java.nio.file.Path;
import clicker_Generator.Clicker_GeneratorPackage;

public class GeneratorTest {
    public static void main(String[] args) throws Exception {
        // Wichtig bei Standalone-Ausführung: Package + Resource-Factory registrieren
        clicker_Generator.Clicker_GeneratorPackage.eINSTANCE.eClass(); // lädt das Metamodell
        
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("clicker_generator", new XMIResourceFactoryImpl());

        Resource resource = resourceSet.getResource(
            org.eclipse.emf.common.util.URI.createFileURI(
                "testmodels/cookieClicker.clicker_generator"), true);

        game game = (game) resource.getContents().get(0);

        String html = new ClickerHtmlGenerator().generate(game);
        Files.writeString(Path.of("output/cookieClicker.html"), html);

        System.out.println("Fertig! Öffne output/cookieClicker.html im Browser.");
    }
}