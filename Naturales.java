import java.util.Scanner;

public class Naturales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, suma = 0;

        System.out.printf("Ingrese numero n: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.print("\nLa suma de los numeros es: " + suma);

        teclado.close();
    }
}