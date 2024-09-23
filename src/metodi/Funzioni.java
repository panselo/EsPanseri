package metodi;

public class Funzioni {
    public static int aggiuntaAuto (String [] marca, String [] modello, double [] prezzo, String marcaAuto, String modelloAuto, double prezzoAuto, int index) {

        marca [index] = marcaAuto;
        modello [index] = modelloAuto;
        prezzo [index] = prezzoAuto;
        index += 1;
        return index;
    }

    public static String visualizzazioneAuto (String [] marca, String [] modello, double [] prezzo, int i){
        String auto = marca[i] + " " + modello[i] + " " + prezzo[i];
        return auto;
    }


}
