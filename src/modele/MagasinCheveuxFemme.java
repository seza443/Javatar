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
public class MagasinCheveuxFemme {
    private ArrayList<Composant> listeComposant;
/**
 * Liste de composants
 */
    public enum Composants {

        COMPOSANT1("default"),
        COMPOSANT2("cheveux-classique-blond"),
        COMPOSANT3("cheveux-classique-roux"),
        COMPOSANT4("cheveux-classique-rouge"),
        COMPOSANT5("cheveux-classique-noir"),
        COMPOSANT6("capoule-brun"),
        COMPOSANT9("capoule-blond"),
        COMPOSANT7("capoule-roux"),
        COMPOSANT8("capoule-rouge"),
        
        COMPOSANT10("capoule-noir");
        
        
        private final String value;

        private Composants(String s) {
            this.value = s;
        }

        public String getValue() {
            return this.value;
        }
    }
    
    public MagasinCheveuxFemme() {
        listeComposant = new ArrayList<>();
        
        for (Composants element : Composants.values()) {
            Composant composant = new Composant("cheveux", "femme", element.getValue());
            this.listeComposant.add(composant);
        }
    }


    public ArrayList<Composant> getListeComposant() {
        return listeComposant;
    }
}
