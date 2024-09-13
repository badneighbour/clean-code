package ex3;

import java.util.List;
import java.util.ArrayList;

public class Zoo {

    private String nom;
    private List<Animal> animals;

    public Zoo(String nom) {
        this.nom = nom;
        this.animals = new ArrayList<Animal>();
    }

    /**
     * Ajoute un animal au zoo
     *
     * @param animal
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Ajoute un animal au zoo
     *
     * @param nomAnimal
     * @param typeAnimal
     * @param comportement
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        addAnimal(new Animal(nomAnimal, typeAnimal, Comportement.valueOf(comportement)));
    }

    /**
     * Affiche la liste des animaux avec leurs caractéristiques
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animals) {
            System.out.println(animal.getNom() + " " + animal.getType() + " " + animal.getComportement());
        }
    }

    public int taille() {
        return animals.size();
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
}
