import java.util.Scanner;

// commenti esercitazione 05/04/2025
// classe Main
public class Main
{
    // metodo main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        // variabili
		int somma = 0;
       
        
        System.out.print("Inserisci un numero: ");
        int N = scanner.nextInt();
        
        
        
        // ciclo for
        for (int i = 1; i < N; i++){
            
            if (N % i == 0 && i != N){
                somma += i;
            }

        }
        
        // condizioni
        if (somma == N){
            System.out.println("Il numero e' perfetto");
        }
        else {
            System.out.println("il numero non e' perfetto");
        }
        

	}
}
