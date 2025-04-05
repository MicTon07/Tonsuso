// Sviluppa un metodo statico in grado di calcolare se un numero e' primo. Mostra tutti i numeri primi compresi tra 0 e 200.

class Primo { //file e classe hanno lo stesso nome
    public static void main(String[] args) {
        int numero = 121; //scegliamo un numero
        
        boolean primo = trovaPrimo(numero); //richiamiamo il metodo col numero scelto
        
        if(primo == true){ //se il metodo ha restituito true il numero è primo
            System.out.println("Il numero e' primo");
        }
        else{ //se il metodo ha restituito false il numero non è primo
            System.out.println("Il numero non e' primo");
        }
    }
    
    //usiamo un metodo statico, non ha bisogno di oggetti, in pratica è una funzione
    public static boolean trovaPrimo(int numero){
        boolean primo = true; //partiamo dando come presupposto che numero sia primo
        
        //vogliamo dividere per tutti i numeri compresi tra 2 e numero
        for(int i = 2; i < numero; i++){
            if(numero %i == 0){
                //se troviamo un divisore il numero non è primo
                primo = false;
                break; //non devo controllare gli altri divisori
            }
        }
        return primo; //restituisco il risultato
    }
}
