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
public class MagasinCheveuxHomme{
    private ArrayList<Composant> listeComposant;
/**
 * Liste de composants
 */
    public enum Composants {

        CHEVEUX1("affro-brun"),
        CHEVEUX2("affro-noir"),
        CHEVEUX3("affro-rose"),
        CHEVEUX4("affro-roux"),
        CHEVEUX8("default"),
        CHEVEUX5("classique-noir"),
        CHEVEUX6("classique-rose"),
        CHEVEUX7("classique-roux"),
        CHEVEUX9("meche-brun"),
        CHEVEUX10("meche-noir"),
        CHEVEUX11("meche-rouge"),
        CHEVEUX12("meche-roux"),
        CHEVEUX13("spike-brun"),
        CHEVEUX14("spike-noir"),
        CHEVEUX15("spike-rouge"),
        CHEVEUX16("spike-roux"); //ajouter les types de cheveux ici.
        private final String value;

        private Composants(String s) {
            this.value = s;
        }

        public String getValue() {
            return this.value;
        }
    }
    
    public MagasinCheveuxHomme() {
        listeComposant = new ArrayList<>();
        
        for (Composants element : Composants.values()) {
            Composant composant = new Composant("cheveux", "homme", element.getValue());
            this.listeComposant.add(composant);
        }
    }

    /**
     * @return the listeCheveux
     */
    public ArrayList<Composant> getListeComposant() {
        return listeComposant;
    }
    
    
}
