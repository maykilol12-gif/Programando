import java.util.Scanner;

public class SumaPar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        for (int i = 2; i <= 100; i+=2) {

            if (i % 2 == 0) {
                suma +=i;
                System.out.println("Par detectado (" + i + ") -> Suma acumulada: " + suma);
            } else {
                System.out.println("Impar: " + i);
            }

            System.out.println("\nLa suma total es: "+ suma);

        }

    }
    }


