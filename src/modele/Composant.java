/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import javax.imageio.ImageIO;

/**
 * Classe responsable de stocker un composant graphique de l'avatar. Stocke le
 * chemin vers l'image Le nom du composant Le chemin vers son icone Le sexe du
 * composant Son type
 *
 * @author Tanguy
 */
public class Composant implements Serializable {

    private String type;
    private String nom;
    private String chemin;
    private String sexe;
    transient private Image image; //la classe Image n'est pas Serializable et pose problème lors de la sauvegarde.
    private String cheminIcon;

    //CONSTRUCTEUR
    Composant(String type) {
        this(type, "homme", "default");
    }

    Composant(String type, String sexe) {
        this(type, sexe, "default");
    }

    /**
     *
     * @param type type de composant
     * @param sexe sexe du compsant
     * @param nom nom du composant
     */
    public Composant(String type, String sexe, String nom) {
        this.type = type;
        this.sexe = sexe;
        this.nom = nom;
        this.chemin = "build/classes/util/icon/" + sexe + "/" + type + "/" + nom + ".png";
        this.cheminIcon = "build/classes/util/icon/" + sexe + "/" + type + "/" + "mini/" + nom + ".png";
        try {
            image = ImageIO.read(new File(chemin.toString()));
        } catch (IOException e) {
            System.out.println("Erreur lors de l'ouverture de l'image \"" + nom + "\" de type " + type + " et de sexe " + sexe + " à l'emplacement : \"" + chemin + "\"");
        }
    }

    @Override
    public boolean equals (Object c) {
        if (c != null) {
            if (c.getClass() == Composant.class) {
                if (this.hashCode() == c.hashCode()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash += 29 * hash + Objects.hashCode(this.type);
        hash += 29 * hash + Objects.hashCode(this.nom);
        hash += 29 * hash + Objects.hashCode(this.chemin);
        hash += 29 * hash + Objects.hashCode(this.sexe);
        hash += 29 * hash + Objects.hashCode(this.cheminIcon);
        return hash;
    }
    
    @Override
    public String toString() {
        return type + " : " + nom; 
    }
    
    /**
     * Cette méthode permet de recharger l'image selon le chemin car lors de l'importation, les images sont ignorées.
     */
    public void rechargerImage() {
        try {
            image = ImageIO.read(new File(chemin.toString()));
        } catch (IOException e) {
            System.out.println("Erreur lors de l'ouverture de l'image \"" + nom + "\" de type " + type + " et de sexe " + sexe + " à l'emplacement : \"" + chemin + "\"");
        }
    }
    
    //ACCESSEURS
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the chemin
     */
    public String getChemin() {
        return chemin;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @return the cheminIcon
     */
    public String getCheminIcon() {
        return cheminIcon;
    }
}
