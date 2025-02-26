package org.example.pub;
import java.util.ArrayList;
import java.util.Vector;
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
        if (boisson.alcoolise) {
            this.boissonAlcoolisee.add(boisson);
        } else {
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
     * @return
     */
    public Object serv(String command) {
        Boisson retourB = null;
        Cocktail retourC = null;

        if (!this.boissonFroide.isEmpty()) {
            for (Boisson boisson : this.boissonFroide) {
                if (boisson.nom.equals(command)) {
                    retourB = boisson;
                    this.boissonFroide.remove(retourB);
                    break;
                }
            }
        } else if (!this.boissonChaude.isEmpty()) {
            for (Boisson boisson : this.boissonChaude) {
                if (boisson.nom.equals(command)) {
                    retourB = boisson;
                    this.boissonChaude.remove(retourB);
                    break;
                }
            }
        } else if (!this.boissonAlcoolisee.isEmpty()) {
            for (Boisson boisson : this.boissonAlcoolisee) {
                if (boisson.nom.equals(command)) {
                    retourB = boisson;
                    this.boissonAlcoolisee.remove(retourB);
                    break;
                }
            }
        } else if (!this.cocktailAvecAlcoole.isEmpty()) {
            for (Cocktail cocktail : this.cocktailAvecAlcoole) {
                if (cocktail.nom.equals(command)) {
                    retourC = cocktail;
                    this.cocktailAvecAlcoole.remove(retourC);
                    break;
                }
            }
        } else if (!this.cocktailSansAlcoole.isEmpty()) {
            for (Cocktail cocktail : this.cocktailSansAlcoole) {
                if (cocktail.nom.equals(command)) {
                    retourC = cocktail;
                    this.cocktailSansAlcoole.remove(retourC);
                    break;
                }
            }


        }
        return null;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()

    public String toString(){
        String retour = new String();
        String eol = System.getProperty("line.separator");
        Enumeration e;

        retour = retour + "Bar : " + eol;

        retour = retour + "\t Sans alcool" + eol;
        e = this.boissonFroide.elements ();
        while (e.hasMoreElements ()) {
            retour = retour + "\t\t" + e.nextElement().toString() + eol;
        }

        retour = retour + "\t Avec alcool" + eol;
        e = this.boissonAlcoolisee.elements();
        while (e.hasMoreElements ()) {
            retour = retour + "\t\t" + e.nextElement().toString() + eol;
        }

        retour = retour + "\t Cocktail sans alcool" + eol;
        e = this.cocktailSansAlcoole.elements();
        while (e.hasMoreElements ()) {
            retour = retour + "\t\t" + e.nextElement().toString() + eol;
        }

        retour = retour + "\t Cocktail avec alcool" + eol;
        e = this.cocktailAvecAlcoole.elements();
        while (e.hasMoreElements ()) {
            retour = retour + "\t\t" + e.nextElement().toString() + eol;
        }

        retour = retour + "\t Boissons chaudes" + eol;
        e = this.boissonChaude.elements();
        while (e.hasMoreElements ()) {
            retour = retour + "\t\t" + e.nextElement().toString() + eol;
        }

        return retour;
    }*/

}