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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Infisso) {
            Infisso infisso = (Infisso) obj;
            return this.materiale.equals(infisso.materiale) && this.altezza == infisso.altezza && this.larghezza == infisso.larghezza;
        }
        return false;
    }
}