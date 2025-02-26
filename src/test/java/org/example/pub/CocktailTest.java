package org.example.pub;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CocktailTest{
    Cocktail masoutBlond =new Cocktail("masoutBlond");

    @Test
    void ajouterCocktail(){
        assertEquals("masoutBlond",masoutBlond.nom);
    }

    @Test
    void rajoutIngredient(){
        //Le toString ne se test pas
        masoutBlond.add("pastis",4.0);
        assertEquals("pastis 4.0%", masoutBlond.toString());
    }

    /*@Test
    void testNotAlcoolFree(){
        //C'est un test pour les boissons avec alcools
        assertTrue(masoutBlond.alcoolFree());
    }*/

    @Test
    void testAlcoolFree(){
        //C'est un test pour les boissons sans alcools
        Cocktail chocolatChaud = new Cocktail("chocolatChaud");
        assertFalse(chocolatChaud.alcoolFree());
    }


}
