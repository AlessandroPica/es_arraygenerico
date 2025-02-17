public class Main {
    public static void main(String[] args) {
        Vettore<Mobile> vettoreMobili = new Vettore<>(10);
        Vettore<Infisso> vettoreInfissi = new Vettore<>(10);

        Mobile mobile1 = new Mobile(10.5, 150.0);
        Mobile mobile2 = new Mobile(20.0, 300.0);
        vettoreMobili.aggiungi(mobile1);
        vettoreMobili.aggiungi(mobile2);

        Infisso infisso1 = new Infisso("Legno", 2.0, 1.0);
        Infisso infisso2 = new Infisso("Alluminio", 2.5, 1.2);
        vettoreInfissi.aggiungi(infisso1);
        vettoreInfissi.aggiungi(infisso2);

        System.out.println("Mobili:");
        vettoreMobili.visualizza();

        System.out.println("Infissi:");
        vettoreInfissi.visualizza();


        System.out.println(vettoreInfissi.ricerca(infisso2));
    }
}