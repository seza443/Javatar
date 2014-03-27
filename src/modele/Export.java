/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tanguy
 */
public class Export {

    public static void exporter(JPanel panelAvatar, String file) {
        BufferedImage buffer = new BufferedImage(panelAvatar.getWidth(), panelAvatar.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = buffer.createGraphics();
        panelAvatar.paint(g);
        try {
            ImageIO.write(buffer, "png", new File(file));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'exportation", "Erreur exportation", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
        }
    }
}
