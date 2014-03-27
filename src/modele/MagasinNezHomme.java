/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *Magasin de composants
 * @author Tanguy
 */
public class MagasinNezHomme {
     private ArrayList<Composant> listeComposant;
/**
 * Liste de composants
 */
    public enum Composants {

        COMPOSANT1("default"),
        COMPOSANT2("nez-rond"),
        COMPOSANT3("nez-gros"),
        COMPOSANT4("nez-trou");
        
        private final String value;

        private Composants(String s) {
            this.value = s;
        }

        public String getValue() {
            return this.value;
        }
    }
    
    public MagasinNezHomme() {
        listeComposant = new ArrayList<>();
        
        for (Composants element : Composants.values()) {
            Composant composant = new Composant("nez", "homme", element.getValue());
            this.listeComposant.add(composant);
        }
    }


    public ArrayList<Composant> getListeComposant() {
        return listeComposant;
    }
}
