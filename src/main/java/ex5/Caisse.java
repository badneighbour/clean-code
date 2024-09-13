package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private int poidsMin;
    private int poidsMax;
    private List<Item> items;

    private static final int MAX_PETIT_OBJET = 5;
    private static final int MIN_GRAND_OBJET = 20;

    /**
     * Constructeur
     */
    public Caisse() {
        this.poidsMin = -1;
        this.poidsMax = -1;
    }

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom) {
        this();
        this.nom = nom;
        switch (nom) {
            case "Petits objets": {
                this.poidsMax = MAX_PETIT_OBJET;
            }
                break;
            case "Moyens objets": {
                this.poidsMin = MAX_PETIT_OBJET;
                this.poidsMax = MIN_GRAND_OBJET;
            }
                break;
            case "Grands objets": {
                this.poidsMin = MIN_GRAND_OBJET;
            }
                break;
        }
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut poidsMin
     *
     * @return the poidsMin
     */
    public int getPoidsMin() {
        return poidsMin;
    }

    /**
     * Setter pour l'attribut poidsMin
     *
     * @param poidsMin the poidsMin to set
     */
    public void setPoidsMin(int poidsMin) {
        this.poidsMin = poidsMin;
    }

    /**
     * Getter pour l'attribut poidsMax
     *
     * @return the poidsMax
     */
    public int getPoidsMax() {
        return poidsMax;
    }

    /**
     * Setter pour l'attribut poidsMax
     *
     * @param poidsMax the poidsMax to set
     */
    public void setPoidsMax(int poidsMax) {
        this.poidsMax = poidsMax;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Ajout d'un item si le poids est dans le bon interval
     *
     * @param items the items to set
     */
    public void ajoutItems(Item item) {
        if (((poidsMax == -1) || (item.getPoids() < poidsMax)) &&
                ((poidsMin == -1) || (item.getPoids() >= poidsMin))) {
            this.items.add(item);
        }
    }

    public int taille() {
        return items.size();
    }

}
