package org.example.pub;

import org.example.pub.Bar;
import org.example.pub.Boisson;
import org.example.pub.Cocktail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Bar_test {

    Bar monBar = new Bar();
    Boisson cafe=new Boisson("cafe");
    Cocktail mojito = new Cocktail ("mojito");
    @Test
    public void testAjoutBoisson() {
        monBar.add(cafe);
        assertTrue(monBar.boissonFroide.contains(cafe));
    }
    @Test
    public void testAjoutcocktail() {
        monBar.add(mojito);
        assertTrue(monBar.cocktailSansAlcoole.contains(mojito));
    }
    @Test
    public void testtoString() {
        monBar.add(mojito);
        monBar.add(cafe);
        System.out.println(monBar.toString());
    }
}
