package ex3;

public class Animal {

    private String type;
    private String nom;
    private Comportement comportement;

    public Animal(String type, String nom, Comportement comportement) {
        this.comportement = comportement;
        this.type = type;
        this.nom = nom;
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param nom the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for comportement
     *
     * @return the comportement
     */
    public Comportement getComportement() {
        return comportement;
    }

    /**
     * Setter
     *
     * @param comportement the comportement to set
     */
    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }
}
