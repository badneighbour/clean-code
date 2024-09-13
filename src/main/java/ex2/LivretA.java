package ex2;

public class LivretA extends Compte {

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public void appliquerRemuAnnuelle() {
        this.ajouterMontant(this.getSolde() * this.tauxRemuneration);
    }

    public void debiterMontant(double montant) {
        if (this.getSolde() - montant > 0) {
            this.setSolde(this.getSolde() - montant);
        }
    }

}
