package org.example.pub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * @author Pierre Le Fameux
 *
 */
public class Bar {
    public ArrayList<Boisson> boissonChaude;
    public ArrayList<Boisson> boissonFroide;
    public ArrayList<Boisson> boissonAlcoolisee;
    public ArrayList<Cocktail> cocktailSansAlcoole;
    public ArrayList<Cocktail> cocktailAvecAlcoole;

    /**
     *
     */
    public Bar() {
        this.boissonChaude = new ArrayList<Boisson>();
        this.boissonFroide = new ArrayList<Boisson>();
        this.boissonAlcoolisee = new ArrayList<Boisson>();
        this.cocktailAvecAlcoole = new ArrayList<Cocktail>();
        this.cocktailSansAlcoole = new ArrayList<Cocktail>();
    }


    /**
     * @param boisson
     */
    public void add(Boisson boisson) {
        if (boisson.alcoolise!=null) {
            this.boissonAlcoolisee.add(boisson);
        } else if (boisson.temperature) {
            this.boissonChaude.add(boisson);
        }
        else {
            this.boissonFroide.add(boisson);
        }
    }

    /**
     * @param cocktail
     */
    public void add(Cocktail cocktail) {
        if (cocktail.alcoolFree()) {
            this.cocktailSansAlcoole.add(cocktail);
        } else {
            this.cocktailAvecAlcoole.add(cocktail);
        }
    }

    /**
     * @param command
     */
    public void serv(String command){
        Boisson retourB=null;
        Cocktail retourC=null;
        Enumeration e = Collections.enumeration(this.boissonFroide);

        while (e.hasMoreElements () && !((retourB=(Boisson)e.nextElement()).nom.equalsIgnoreCase(command))){}
        if(retourB.nom.equalsIgnoreCase(command)){
            this.boissonFroide.remove(retourB);
            return;
        }

        e = Collections.enumeration(this.boissonAlcoolisee);
        while (e.hasMoreElements () && !((retourB=(Boisson)e.nextElement()).nom.equalsIgnoreCase(command))){}
        if(retourB.nom.equalsIgnoreCase(command)){
            this.boissonAlcoolisee.remove(retourB);
            return;
        }

        e = Collections.enumeration(this.boissonChaude);
        while (e.hasMoreElements () && !((retourB=(Boisson)e.nextElement()).nom.equalsIgnoreCase(command))){}
        if(retourB.nom.equalsIgnoreCase(command)){
            this.boissonChaude.remove(retourB);
            return;
        }

        e = Collections.enumeration(this.cocktailSansAlcoole);
        while (e.hasMoreElements () && !((retourC=(Cocktail)e.nextElement()).nom.equalsIgnoreCase(command))){}
        if(retourC.nom.equalsIgnoreCase(command)){
            this.cocktailSansAlcoole.remove(retourC);
            return;
        }

        e = Collections.enumeration(this.cocktailAvecAlcoole);
        while (e.hasMoreElements () && !((retourC=(Cocktail)e.nextElement()).nom.equalsIgnoreCase(command))){}
        if(retourC.nom.equalsIgnoreCase(command)){
            this.cocktailAvecAlcoole.remove(retourC);
        }

    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
    */
    public String toString(){
        String retour;
        Enumeration e = Collections.enumeration(this.boissonFroide);;

        retour = "Bar : ";

        retour += " Sans alcool = " ;

        while (e.hasMoreElements ()) {
            retour += e.nextElement().toString() + ", ";
        }

        retour += " Avec alcool = " ;
        e = Collections.enumeration(this.boissonAlcoolisee);
        while (e.hasMoreElements ()) {
            retour += e.nextElement().toString() + ", ";
        }

        retour += " Cocktail sans alcool = ";
        e = Collections.enumeration(this.cocktailSansAlcoole);
        while (e.hasMoreElements ()) {
            retour +=  e.nextElement().toString() + ", ";
        }

        retour += "Cocktail avec alcool = ";
        e = Collections.enumeration(this.cocktailAvecAlcoole);
        while (e.hasMoreElements ()) {
            retour +=  e.nextElement().toString() + ", ";
        }

        retour +=  " Boissons chaudes = ";
        e = Collections.enumeration(this.boissonChaude);
        while (e.hasMoreElements ()) {
            retour +=  e.nextElement().toString() + ", ";
        }

        return retour;
    }



}