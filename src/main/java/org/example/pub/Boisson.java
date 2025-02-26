package org.example.pub;


/**
 * @author Pierre Le Fameux
 *
 */
public class Boisson {
    public String nom;
    public Boolean alcoolise;
    public Float degre;
    public Float volume; // volume de la bouteille, cennette, fut ...
    public Float prix;
    public boolean temperature; //false froid, true chaud
    /**
     * @param nom
     */
    public Boisson(String nom){
        this.nom = nom;
        this.alcoolise = false;
        this.temperature = false;
    }

    /**
     * @param nom
     * @param degre
     */
    public Boisson(String nom, Float degre){
        this.nom = nom;
        this.degre = degre;
        this.alcoolise = true;
    }
    public Boisson(String nom, boolean temperature){
        this.nom = nom;
        this.temperature = temperature;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        String retour = this.nom;
        if(this.alcoolise){
            return retour + " (l'abus d'alcool est dangereux pour la sante)";
        }else{
            return retour;
        }
    }
}
