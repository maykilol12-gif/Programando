import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sumanegativos = 0;

        for (int i = 1; i <=5 ; i++) {
            System.out.printf("Ingrese numero: ");
            int numero = teclado.nextInt();
            if (numero < 0) {
                sumanegativos++;

            }
        }
        System.out.println("El usuario digito : " + sumanegativos + " numeros negativos");
}
}