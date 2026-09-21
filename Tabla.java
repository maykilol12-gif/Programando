import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multiplicacion = 0, numero;
        System.out.printf("Ingrese su numero: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= 50; i++){

            multiplicacion = i * numero;
            System.out.println("la tabla del numero " + multiplicacion);


        }
    }
}