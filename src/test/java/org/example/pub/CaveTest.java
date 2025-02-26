package org.example.pub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

class CaveTest {
    Cave maCave=new Cave();
    List<Boisson> rayons = maCave.getRayons();
    Boisson cafe=new Boisson("café");

    @Test
    void testCave(){
        maCave.add(cafe);
        assertTrue(rayons.contains(cafe));
    }

    @Test
    void listeObj (){
        Boisson gin=new Boisson("gin", (float)13.0);
        maCave.add(gin);
        maCave.take("gin");
        assertFalse(rayons.contains(gin));
    }

    @Test
    void listeObjAbsent (){
        Boisson vinRouge=new Boisson("vin rouge", (float)13.0);
        maCave.take("vin rouge");
        assertFalse(rayons.contains(vinRouge));
    }

    @Test
    void string (){
        Boisson gin=new Boisson("gin", (float)13.0);
        maCave.add(cafe);
        maCave.add(gin);
        assertEquals("Cave : café ; gin (l'abus d'alcool est dangereux pour la sante) ; ",maCave.toString());
    }
}
