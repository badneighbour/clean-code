package ex2;

/**
 * Représente un compte bancaire de type compte courant ou livret A
 */
public abstract class Compte {

    /**
     * solde : solde du compte
     */
    private double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public Compte() {
        this(0);
    }

    /**
     * Getter for solde
     *
     * @return solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Retire un montant du solde
     *
     * @param montant
     */
    public abstract void debiterMontant(double montant);

}
