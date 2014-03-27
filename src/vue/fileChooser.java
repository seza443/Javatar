/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *Cette classe propose des méthodes statiques pour afficher un fileChooser permettant de selectionner un emplacement de sauvegarder ou d'importer un avatar
 * @author Tanguy
 */
public class fileChooser {
    /**
     *Affiche un fileChooser permettant de choisir un chemin de sauvegarde
     * @return the selected folder OU null
     */
    public static String fileChooserEmplacementSauvegarde(String extension) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extension, extension);
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return (chooser.getSelectedFile().getPath()+"."+extension);
        }
        return null;
    }
    
    /**
     * Méthode responsable d'afficher un fileChooser et de rendre le fichier choisit.
     * Le fichier choisit est de type avatar
     * @return the selected file OU null
     */
    public static File fileChooserImporterAvatar() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Avatar format", "avatar");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        }
        return null;
    }
}
