package metodi;
import java.util.Scanner;

import static metodi.Funzioni.aggiuntaAuto;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String [] marca = new String [100];
        String [] modello = new String [100];
        double [] prezzo = new double [100];
        double prezzoAuto = 0.0;
        String marcaAuto = "";
        String modelloAuto = "";
        int conta = 0;
        int n;
        do{
            System.out.println("1 - aggiunta di una nuova auto");
            System.out.println("2 - visualizzazione di tutte le auto");
            System.out.println("3 - ricerca di un'auto tramite marca e modello");
            System.out.println("4 - cancellazione di un'auto");
            System.out.println("5 - modifica dei dati di un'auto");
            System.out.println("6 - visualizzazione delle auto in ordine crescente");
            System.out.println("7 - visualizzare tutti i modelli che diesel");
            System.out.println("8 - esci");

            System.out.println("Inserisci un numero da 1 - 8: ");
            n = in.nextInt();

            if (n == 1){

                System.out.println("Inserisci il prezzo dell'auto: ");
                prezzoAuto = in.nextDouble();
                System.out.println("Inserisci il modello dell'auto: ");
                modelloAuto = in.next();
                System.out.println("Inserisci la marca dell'auto: ");
                marcaAuto = in.next();

                conta = Funzioni.aggiuntaAuto (marca, modello, prezzo, marcaAuto, modelloAuto, prezzoAuto, conta);

            }
            if (n == 2){

                for (int i = 0; i < conta; i ++){
                    String visuaAuto = Funzioni.visualizzazioneAuto(marca, modello, prezzo, i);
                    System.out.println(visuaAuto);
                }

            }
            if (n == 3){




            }
            if (n == 4){

            }
            if (n == 5){

            }
            if (n == 6){

            }
            if (n == 7){

            }

        }while(n != 8);


    }
}