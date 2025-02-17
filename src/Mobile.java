public class Mobile {
    private double peso;
    private double prezzo;

    public Mobile(double peso, double prezzo) {
        this.peso = peso;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Mobile [peso=" + peso + ", prezzo=" + prezzo + "]";
    }
}