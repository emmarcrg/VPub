package org.example.pub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BarTest {

    Bar monBar = new Bar();
    Boisson icecafe=new Boisson("Icecafe",false);
    Cocktail mojito = new Cocktail ("mojito");

    Boisson cafe=new Boisson("cafe",true);
    Cocktail viriginMojito = new Cocktail ("ViriginMojito");

    Boisson biere=new Boisson("biere", 40.0F);



    @Test
    public void testAjoutBoisson() {
        monBar.add(icecafe);
        assertTrue(monBar.boissonFroide.contains(icecafe));
    }

    @Test
    public void testAjoutBoisson2() {
        monBar.add(cafe);
        assertTrue(monBar.boissonChaude.contains(cafe));
    }

    @Test
    public void testAjoutBoisson3() {
        monBar.add(biere);
        assertTrue(monBar.boissonAlcoolisee.contains(biere));
    }


    @Test
    public void testAjoutcocktail() {
        monBar.add(viriginMojito);
        assertTrue(monBar.cocktailSansAlcoole.contains(viriginMojito));
    }

    @Test
    //plante mais c'est normal car il faux refactoré le cockail
    public void testAjoutcocktail2() {
        monBar.add(mojito);
        assertTrue(monBar.cocktailAvecAlcoole.contains(mojito));
    }

    @Test
    public void testserv() {
        monBar.add(icecafe);
        monBar.add(mojito);
        monBar.add(viriginMojito);
        monBar.add(biere);
        monBar.add(cafe);
        monBar.serv("icecafe");
        assertFalse(monBar.boissonFroide.contains(icecafe));
    }

    @Test
    public void testtoString() {
        monBar.add(mojito);
        monBar.add(cafe);
        System.out.println(monBar.toString());
    }
}
