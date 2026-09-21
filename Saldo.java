import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 50 ; i++) {
            if (i % 2 == 0) {
                System.out.println("\nEl numero es par: " + i);
            }
            else{
                System.out.println("\nEl numero no es par: " + i);
            }
        }
    }
    }