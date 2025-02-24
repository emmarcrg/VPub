package pub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaveTest {
    pub.Cave maCave=new pub.Cave();
    pub.Boisson cafe=new pub.Boisson("café");

    @Test
    void testCave(){
        maCave.add(cafe);
        assertTrue(maCave.rayons.contains(cafe));
    }

    @Test
    void listeObj (){
        pub.Boisson gin=new pub.Boisson("gin", (float)13.0);
        maCave.add(gin);
        maCave.take("gin");
        assertTrue( !maCave.rayons.contains(gin));

    }


}
