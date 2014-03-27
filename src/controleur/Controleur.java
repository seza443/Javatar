/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import modele.Avatar;
import modele.Composant;
import modele.Export;
import modele.MagasinBoucheFemme;
import modele.MagasinBoucheHomme;
import modele.MagasinCheveuxFemme;
import modele.MagasinCheveuxHomme;
import modele.MagasinNezFemme;
import modele.MagasinNezHomme;
import modele.MagasinYeuxFemme;
import modele.MagasinYeuxHomme;
import vue.FenetrePrincipale;
import vue.fileChooser;

/**
 * Classe responsable de gérer les échanges entre la vue et les classes métier.
 *
 * @author Tanguy
 */
public class Controleur {

    FenetrePrincipale frame;
    Avatar avatar;
    MagasinCheveuxHomme magasinCheveuxHomme;
    MagasinYeuxHomme magasinYeuxHomme;
    MagasinNezHomme magasinNezHomme;
    MagasinBoucheHomme magasinBoucheHomme;
    MagasinCheveuxFemme magasinCheveuxFemme;
    MagasinYeuxFemme magasinYeuxFemme;
    MagasinNezFemme magasinNezFemme;
    MagasinBoucheFemme magasinBoucheFemme;

    Controleur() {
        frame = new FenetrePrincipale(this);
        avatar = new Avatar(frame.getAvatarPreview());
        magasinCheveuxHomme = new MagasinCheveuxHomme();
        magasinYeuxHomme = new MagasinYeuxHomme();
        magasinNezHomme = new MagasinNezHomme();
        magasinBoucheHomme = new MagasinBoucheHomme();
        magasinBoucheFemme = new MagasinBoucheFemme();
        magasinCheveuxFemme = new MagasinCheveuxFemme();
        magasinNezFemme = new MagasinNezFemme();
        magasinYeuxFemme = new MagasinYeuxFemme();

        frame.ajouterMagasinCheveux(magasinCheveuxHomme);
        frame.ajouterMagasinYeux(magasinYeuxHomme);
        frame.ajouterMagasinNez(magasinNezHomme);
        frame.ajouterMagasinBouche(magasinBoucheHomme);
    }

    /**
     * Méthode affichant l'interface graphique
     */
    public void start() {
        this.panneauEdition(false);
        frame.setVisible(true);
    }

    /**
     * Defini si le panneau d'édition est visible ou pas. Si true -> accueil
     * devient invisible et edition visible Si false -> edition devient
     * invisible et acuceil visible
     *
     * @param visible true pour afficher le panneau edition false pour le
     * masquer
     */
    public void panneauEdition(boolean visible) {
//        if (visible) {
//            frame.panneauAccueil(!visible);
//            frame.panneauEdition(visible);
//        } else {
//            frame.panneauEdition(visible);
//            frame.panneauAccueil(!visible);
//        }
        frame.panneauAccueil(!visible);
        frame.panneauEdition(visible);
    }

    /**
     * Méthode appelée lors de la fermeture de la fenetre principale. Demande
     * une confirmation à l'utilisateur.
     */
    public void quitter() {
        int option = JOptionPane.showConfirmDialog(null, "Etes-vous certain de vouloir quitter ?\nTous changements non enregistrés seront perdus", "Quitter ?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    /**
     * Méthode appelée au clic sur le bouton de sexe homme Cette methode
     * recharge les palettes de composants pour le nouveau sexe. Modifie le sexe
     * de l'avatar
     */
    public void hommeButton() {
        avatar.setSexe("homme");
        chargerMagasinHomme();
    }

    /**
     * Méthode appelée au clic sur le bouton de sexe feme Cette methode recharge
     * les palettes de composants pour le nouveau sexe. Modifie le sexe de
     * l'avatar
     */
    public void femmeButton() {
        avatar.setSexe("femme");
        chargerMagasinFemme();
    }

    private void chargerMagasinHomme() {
        frame.viderPalettes();
        frame.ajouterMagasinCheveux(magasinCheveuxHomme);
        frame.ajouterMagasinYeux(magasinYeuxHomme);
        frame.ajouterMagasinNez(magasinNezHomme);
        frame.ajouterMagasinBouche(magasinBoucheHomme);
        frame.redessinerPalettes();
    }

    private void chargerMagasinFemme() {
        frame.viderPalettes();
        frame.ajouterMagasinCheveux(magasinCheveuxFemme);
        frame.ajouterMagasinYeux(magasinYeuxFemme);
        frame.ajouterMagasinNez(magasinNezFemme);
        frame.ajouterMagasinBouche(magasinBoucheFemme);
        frame.redessinerPalettes();
    }

    /**
     * Méthode de création d'un nouvel avatar Défini un avatar masculin par
     * défaut. Recharge la liste des observateurs de l'objets Avatar.
     */
    public void nouvelAvatar() {
        this.hommeButton();
        avatar.deleteObservers();
        avatar = new Avatar(frame.getAvatarPreview());
    }

    /**
     * Méthode appelée lors de la modification de n'importe quel composant de
     * l'avatar. Cette méthode actualise la liste des composants de l'avatar.
     *
     * @param composant le composant à modifier
     */
    public void modiferComposant(Composant composant) {
        avatar.setComposant(composant);
    }

    /**
     * Méthode appelée lors du clic sur le bouton importation. Cette méthode
     * fait appel à la vue pour afficher un fileChooser qui retourne un fichier
     * qui est alors importé et stocké dans la variable avatar.
     */
    public void importer() {
        ObjectInputStream in = null;
        try {
            File avatarChoose = fileChooser.fileChooserImporterAvatar();
            in = new ObjectInputStream(new FileInputStream(avatarChoose.getPath()));
            avatar = new Avatar((Avatar) in.readObject());
            avatar.deleteObservers();
            avatar.addObserver(frame.getAvatarPreview());

            //this.rechargerImagesAvatar();
            avatar.modifie();
            this.panneauEdition(true);
            if (avatar.getSexe().equals("femme")) {
                this.chargerMagasinFemme();
            } else {
                this.chargerMagasinHomme();
            }

        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'importation", "Erreur import", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la fermeture du flux", "Erreur flux", JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException ex) {
            }
        }
    }

    /**
     * Méthode exportant le panel avatar en image
     */
    public void exporter() {
        Export.exporter(frame.getAvatarPreview(), fileChooser.fileChooserEmplacementSauvegarde("png"));
    }

    /**
     * Méthode appelée lors du clic sur le bouton de sauvegarde. Cette méthode
     * demande un nom de fichier à l'utilisateur et un emplacement de sauvegarde
     * puis sauvegarde le ficher.
     */
    public void sauver() {
        ObjectOutputStream out = null;
        //String nomFichier = "avatar";
        //JOptionPane.showInputDialog(null, nomFichier, "Sauver sous", JOptionPane.PLAIN_MESSAGE); 
        try {
            File fichier = new File(fileChooser.fileChooserEmplacementSauvegarde("avatar"));
            out = new ObjectOutputStream(new FileOutputStream(fichier.getPath()));
            out.writeObject(avatar);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la sauvegarde", "Erreur sauvegarde", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la fermeture du flux", "Erreur flux", JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException ex) {
            }
        }
    }

    /**
     * Cette méthode permet de recharger l'image d'un composant à partir de son
     * chemin
     */
    private void rechargerImagesAvatar() {
        avatar.redefinirImages();
    }
}
