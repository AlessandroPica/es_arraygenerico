public class Infisso {
    private String materiale;
    private double altezza;
    private double larghezza;

    public Infisso(String materiale, double altezza, double larghezza) {
        this.materiale = materiale;
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    @Override
    public String toString() {
        return "Infisso [materiale=" + materiale + ", altezza=" + altezza + ", larghezza=" + larghezza + "]";
    }
}