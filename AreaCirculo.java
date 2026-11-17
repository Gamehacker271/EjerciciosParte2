package EjerciciosParte2;
import java.util.Scanner;

public class AreaCirculo {
    public double radio = 0.0;

    public void solicitarRadioValido() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Escribe el radio del circulo:");
            if (sc.hasNextDouble()) {
                this.radio = sc.nextDouble();
                if (this.radio >= 0) {
                    break; // Validado correctamente
                } else {
                    System.out.println("Error: El radio no puede ser negativo.");
                }
            } else {
                System.out.println("Error: Ingresa un numero valido.");
                sc.next(); // Limpiamos el buffer
            }
        }
    }

    public double calcularArea() {
        // Formula: Area = PI * radio al cuadrado
        return Math.PI * Math.pow(this.radio, 2); 
    }

    public static void main(String[] args) {
        AreaCirculo circulo = new AreaCirculo();
        circulo.solicitarRadioValido();
        System.out.println("El area del circulo es: " + circulo.calcularArea());
    }
}
