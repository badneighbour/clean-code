package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    public void addItem(Item item) {

        for (Caisse caisse : caisses) {
            caisse.ajoutItems(item);
        }
    }

    public int taille() {
        return caisses.stream().mapToInt(caisse -> caisse.taille()).sum();
    }
}
