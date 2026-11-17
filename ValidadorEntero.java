package EjerciciosParte2;
import java.util.Scanner;

public class ValidadorEntero {
    
    public int solicitarEntero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        while (true) {
            System.out.println("Escribe un numero entero:");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                break; // Entrada valida, rompemos el bucle
            } else {
                System.out.println("Error: No es un numero entero valido. Intenta de nuevo.");
                sc.next(); // Limpiamos el buffer para evitar un bucle infinito
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        ValidadorEntero validador = new ValidadorEntero();
        int numeroValido = validador.solicitarEntero();
        System.out.println("Numero valido ingresado: " + numeroValido);
    }
}
