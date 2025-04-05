// Tonsuso Michael, 4A inf, 08/10/2024
package com.mycompany.project1;
import java.util.Scanner;


public class Concorso {

    public static void main(String[] args) {
        
        // dichiarazione variabili
        int punteggio, punteggioMax = 30, punteggioMin = 18;
        int candidati = 0, candPromossi = 0, candVotoMax = 0;
        float mediaPunteggio = 0;
        
        
        // scanner
        Scanner scInput = new Scanner(System.in);
        
        
        while(true){
            
            System.out.println("Inserisci il punteggio : ");
            punteggio = scInput.nextInt();
            
            // se il punteggio è  uguale a 0 usciamo dal ciclo
            if (punteggio == 0){
                break;
            }
            
            else if (punteggio == punteggioMax){
                candidati++;
                candPromossi++;
                candVotoMax++;
                mediaPunteggio += punteggio;
            }
            else if (punteggio >= punteggioMin){
                candidati++;
                candPromossi++;
                mediaPunteggio += punteggio;
            }
            else if (punteggio > punteggioMax){
                System.out.println("Il punteggio non puo essere maggiore di 30");
            }
            else if (punteggio < punteggioMin){
                System.out.println("Il punteggio non puo essere minore di 18");
            }
  
        }
        
        
        System.out.println("Candidati : " + candidati);
        System.out.println("Candidati promossi : " + candPromossi);
        System.out.println("Candidati voto max : " + candVotoMax);
        
        // calcoliamo la media del punteggio
        mediaPunteggio = mediaPunteggio / candidati;
        System.out.println("Media punteggio : " + mediaPunteggio);
        
    }


   
}
