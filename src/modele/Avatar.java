/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

/**
 * Avatar stocke les Composants d'un avatar et notifie ses observeurs de tous
 * changements.
 *
 * @author Tanguy
 */
public class Avatar extends Observable implements Serializable {

    private Map<String, Composant> composants;
    private String sexe;

    /**
     *Constructeur par défaut
     * Initialise l'avatar avec le sexe homme et les composants par défauts.
     */
    public Avatar() {
        composants = new Hashtable<>();
        sexe = "homme";
        this.redefinirComposant();
    }

    /**
     *Constructeur recevant un observeur
     * @param o observeur d'avatar
     */
    public Avatar(Observer o) {
        this();
        this.addObserver(o);
        this.modifie();
    }

    /**
     *Constructeur par recopie
     * Utile pour l'importation
     * @param a
     */
    public Avatar(Avatar a) {
        this();
        this.sexe = a.sexe;
        this.redefinirComposant();
        for (Composant composant : a.getComposants().values()) {
            Composant c = new Composant(composant.getType(), composant.getSexe(), composant.getNom());
            this.setComposant(c);
        }
    }

    @Override
    public boolean equals(Object a) {
        if (a != null) {
            if (a.getClass() == Avatar.class) {
                if (this.hashCode() == a.hashCode()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        for (Composant c : composants.values()){
            hash += 73 * hash + Objects.hashCode(c);
        }
        hash += 73 * hash + Objects.hashCode(this.sexe);
        return hash;
    }

    @Override
    public String toString() {
        String retour = sexe + " ";
        for (Composant c : composants.values()) {
            retour += c.toString() + " ";
        }
        return retour;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
        this.redefinirComposant();
        this.modifie();
    }

    /**
     * Méthode notifiant tous les observateurs de l'avatar de la modification de
     * celui-ci. Appelée par les méthodes de modification de l'avatar.
     */
    public void modifie() {
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * Redéfini les composants par défaut selon le sexe de l'avatar Cette
     * méthode est utilisée surtout lors du changement de sexe de l'avatar pour
     * afficher l'avatar par défaut.
     */
    public void redefinirComposant() {
        composants.put("corps", new Composant("corps", getSexe()));
        composants.put("yeux", new Composant("yeux", getSexe()));
        composants.put("nez", new Composant("nez", getSexe()));
        composants.put("bouche", new Composant("bouche", getSexe()));
        composants.put("cheveux", new Composant("cheveux", getSexe()));
        modifie();
    }

    /**
     * @return the composants
     */
    public Map<String, Composant> getComposants() {
        return composants;
    }

    /**
     *
     * @param type type du composant à retourner.
     * @return retourne le composant associé au type voulu.
     */
    public Composant getComposant(String type) {
        return composants.get(type);
    }

    /**
     * Modifie la liste des composants de l'avatar et notifie ses observateurs.
     *
     * @param composant Composant à insérer dans la liste (écrase le composant
     * de même type déjà présent dans la liste).
     */
    public void setComposant(Composant composant) {
        composants.put(composant.getType(), composant);
        modifie();
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Cette méthode permet de recharger les images selon le chemin car lors de
     * l'importation, les images sont ignorées.
     */
    public void redefinirImages() {
        for (Composant composant : getComposants().values()) {
            composant.rechargerImage();
        }
        this.modifie();
    }
}
