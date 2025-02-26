package org.example.pub;

import java.util.Collections;
import java.util.Enumeration;
import java.util.ArrayList;

/**
 * @author Pierre Le Fameux
 *
 */
public class Cocktail {

    private class Ingredient{
        public String ingredient;
        public Double quantite;

        public Ingredient(String ingredient, Double quantite){
            this.ingredient = ingredient;
            this.quantite = quantite;
        }
    }

    public String nom;
    public ArrayList<Ingredient> ingredients;
    public Boolean alcoolise;

    /**
     * Creates a Cocktail with its name
     * @param nom
     */
    public Cocktail(String nom){
        this.nom = nom;
        this.ingredients = new ArrayList<Ingredient>();
        this.alcoolise = false;
    }

    /**
     * add a new element into the Cocktail.
     * @param ingredient
     * @param quantite
     */
    public void add(String ingredient, Double quantite){
        Ingredient ing= new Ingredient(ingredient, quantite);
        this.ingredients.add(ing);
    }

    /**
     * alcoolFree test if the Cocktail is free alcool.
     * @return true if the Cocktail is free alcool
     */
    public Boolean alcoolFree(){
        return this.alcoolise;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        String retour = new String();
        Enumeration e = Collections.enumeration(this.ingredients);
        Ingredient current;
        while (e.hasMoreElements ()) {
            current = (Ingredient)e.nextElement();
            retour += current.ingredient + " " + current.quantite + "%";
        }
        return retour;
    }

}
