package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 */
public class CompteBancaire extends Compte {

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * @param solde
     * @param decouvert
     */
    public CompteBancaire(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (this.getSolde() - montant > decouvert) {
            this.setSolde(this.getSolde() - montant);
        }
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
