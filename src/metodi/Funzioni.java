package metodi;

public class Funzioni {
    public static int aggiuntaAuto (String [] marca, String [] modello, double [] prezzo, String marcaAuto, String modelloAuto, double prezzoAuto, int index) {
        index += 1;
        marca [index] = marcaAuto;
        modello [index] = modelloAuto;
        prezzo [index] = prezzoAuto;
        return index;
    }
}
