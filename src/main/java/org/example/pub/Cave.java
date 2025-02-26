package org.example.pub;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Collections;
/**
 * @author Pierre Le Fameux
 *
 */
public class Cave {
    public ArrayList<Boisson> rayons;

    /**
     *
     */
    public Cave(){
        this.rayons = new ArrayList<Boisson>();
    }

    /**
     * @param b
     */
    public void add(Boisson b){
        this.rayons.add(b);
    }

    /**
     * @param nom
     * @return
     */
    public Boisson take(String nom){
        Boisson retour = null;
        Enumeration<Boisson> e = Collections.enumeration(this.rayons);
        while (e.hasMoreElements()){
            retour=e.nextElement();
            if (retour.nom.equalsIgnoreCase(nom)) {
                this.rayons.remove(retour);
                return retour;
            }
        }
        return retour;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        String retour;
        Enumeration<Boisson> e = Collections.enumeration(this.rayons);
        retour = "Cave : ";
        while (e.hasMoreElements ()) {
            retour += e.nextElement().toString() + " ; ";
        }
        return retour;
    }
}
