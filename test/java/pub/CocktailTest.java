package pub;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CocktailTest{
    pub.Cocktail masoutBlond =new pub.Cocktail("masoutBlond");

    @Test
    void ajouterCocktail(){
        assertEquals(masoutBlond.nom,"masoutBlond");
    }

    @Test
    void rajoutIngredient(){
        //Le toString ne se test pas
        masoutBlond.add("pastis",4.0);
        assertEquals("pastis 4.0%", masoutBlond.toString());
    }

    @Test
    void testAlcoolFree(){
        assertTrue(masoutBlond.alcoolFree());
    }




}
