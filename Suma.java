
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        double n1, n2, resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        n1 = teclado.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        n2 = teclado.nextDouble();

        resultado = n1 + n2;

        System.out.println("El total es: " + resultado);
    }
}






