package ex3;

public enum Comportement {

    HERBIVORE("HERBIVORE"),
    CARNIVORE("CARNIVORE");

    private final String text;

    /**
     * @param text
     */
    Comportement(final String text) {
        this.text = text;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
