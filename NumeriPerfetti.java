import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somma = 0;
        
        System.out.print("Inserisci un numero: ");
        int N = scanner.nextInt();
        
        
        
        
        for (int i = 1; i < N; i++){
            
            if (N % i == 0 && i != N){
                somma += i;
            }

        }
        
        
        if (somma == N){
            System.out.println("Il numero e' perfetto");
        }
        else {
            System.out.println("il numero non e' perfetto");
        }
        

	}
}
