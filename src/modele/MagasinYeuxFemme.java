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
public class MagasinYeuxFemme {
    private ArrayList<Composant> listeComposant;
/**
 * Liste de composants
 */
    public enum Composants {

        COMPOSANT1("default"),
        COMPOSANT2("yeux-classique-brun"),
        COMPOSANT3("yeux-classique-vert"),
        COMPOSANT4("yeux-classique-rouge"),
        COMPOSANT5("yeux-ferme-bleu"),
        COMPOSANT6("yeux-ferme-brun"),
        COMPOSANT7("yeux-ferme-vert"),
        COMPOSANT8("yeux-ferme-rouge"),
        COMPOSANT9("yeux-fache-bleu"),
        COMPOSANT10("yeux-fache-brun"),
        COMPOSANT11("yeux-fache-vert"),
        COMPOSANT12("yeux-fache-rouge"),
        COMPOSANT13("yeux-felin"),
        COMPOSANT14("yeux-zombie"),
        COMPOSANT15("yeux-amoureux"),
        COMPOSANT16("yeux-cligne");
        
        private final String value;

        private Composants(String s) {
            this.value = s;
        }

        public String getValue() {
            return this.value;
        }
    }
    
    public MagasinYeuxFemme() {
        listeComposant = new ArrayList<>();
        
        for (Composants element : Composants.values()) {
            Composant composant = new Composant("yeux", "femme", element.getValue());
            this.listeComposant.add(composant);
        }
    }


    public ArrayList<Composant> getListeComposant() {
        return listeComposant;
    }
}
