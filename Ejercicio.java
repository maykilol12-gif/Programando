import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = teclado.nextDouble();
            suma += numero;
        }

        double promedio = suma / 5.0;
        System.out.print("El promedio de los números es: " + promedio);

        teclado.close();
    }
}
