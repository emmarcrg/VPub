package org.example.pub;//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions;

public class Boisson_test {
    @Test
    public void testBoisson() {
        Boisson cafe = new Boisson("cafe");
        //assertTrue(True);
        assertFalse(cafe.alcoolise);
    }

    @Test
    public void testBoisson2() {
        Boisson gin=new Boisson("gin", (float)13.0);

        assertTrue(gin.alcoolise);


    }

}
