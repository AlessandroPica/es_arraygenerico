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

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Mobile) {
            Mobile mobile = (Mobile) obj;
            return this.peso == mobile.peso && this.prezzo == mobile.prezzo;
        }
        return false;
    }
}