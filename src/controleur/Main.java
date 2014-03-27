/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *Point d'entrée du programme
 * @author Tanguy
 */
public class Main {
    /**
     * Instancie un controleur et appelle la méthode start de celui-ci
     * @param arg 
     */
    public static void main (String arg []) {
        Controleur controleur = new Controleur();
        controleur.start();
    }
}
