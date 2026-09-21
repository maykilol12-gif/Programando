import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, factor = 1;
        System.out.printf("Ingrese el numero del que quiere saber su factorial: ");
        numero1 = teclado.nextInt();
        for (int i = 1; i <= numero1; i++) {
            factor *= i;
        }
        System.out.printf("\nEl factorial del numero es: " + factor);


    }
}