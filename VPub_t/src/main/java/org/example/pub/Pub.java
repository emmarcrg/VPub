package pub;

/**
 * Virtual PUB
 */
public class Pub {


    public pub.Bar bar;
    public pub.Cave cave;

    /**
     *
     */
    public Pub(){
        this.bar = new pub.Bar();
        this.cave = new pub.Cave();
    }

    public void approvisionnerBar(String nom){
        this.bar.add(this.cave.take(nom));
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        /* Creation du pub */
        Pub pub = new Pub();

        pub.Boisson coca = new pub.Boisson("Coca");
        pub.Boisson eau = new pub.Boisson("Eau");
        pub.Boisson sky = new pub.Boisson("Whisky", new Float(40));
        pub.Boisson bierre = new pub.Boisson("Bierre", new Float(8));

        pub.cave.add(coca);
        pub.cave.add(coca);
        pub.cave.add(coca);
        pub.cave.add(sky);
        pub.cave.add(sky);
        pub.cave.add(bierre);
        pub.cave.add(bierre);
        pub.cave.add(eau);

        System.out.println("Cave initiale :");
        System.out.println(pub.cave);

        pub.approvisionnerBar("bierre");
        pub.approvisionnerBar("Whisky");
        pub.approvisionnerBar("Coca");
        pub.approvisionnerBar("eau");

        pub.Cocktail maz = new pub.Cocktail("Mazout");
        maz.add("bierre", new Double(50));
        maz.add("coca", new Double(50));
        pub.bar.add(maz);

        pub.Boisson cafe = new pub.Boisson("cafe");
        pub.bar.boissonChaude.add(cafe);

        System.out.println(pub.cave);
        System.out.println(pub.bar);

        System.out.println("Boisson servie : " + pub.bar.serv("cafe"));
        System.out.println(pub.bar);
    }

}
