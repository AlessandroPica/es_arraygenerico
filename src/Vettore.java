public class Vettore<T> {
    private T[] elementi;
    private int count;


    public Vettore(int size) {
        this.elementi = (T[]) new Object[size];
        this.count = 0;
    }

    public void aggiungi(T elemento) {
        if (count < elementi.length) {
            elementi[count++] = elemento;
        } else {
            System.out.println("Vettore pieno, impossibile aggiungere l'elemento.");
        }
    }

    public void visualizza() {
        for (int i = 0; i < count; i++) {
            System.out.println(elementi[i]);
        }
    }
}