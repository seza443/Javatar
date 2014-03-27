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
public class MagasinBoucheHomme {
    private ArrayList<Composant> listeComposant;
/**
 * Liste de composants
 */
    public enum Composants {

        COMPOSANT1("default"),
        COMPOSANT2("bouche-langue"),
        COMPOSANT3("bouche-fache"),
        COMPOSANT4("bouche-classique");
        
        private final String value;

        private Composants(String s) {
            this.value = s;
        }

        public String getValue() {
            return this.value;
        }
    }
    
    public MagasinBoucheHomme() {
        listeComposant = new ArrayList<>();
        
        for (Composants element : Composants.values()) {
            Composant composant = new Composant("bouche", "homme", element.getValue());
            this.listeComposant.add(composant);
        }
    }


    public ArrayList<Composant> getListeComposant() {
        return listeComposant;
    }
}
