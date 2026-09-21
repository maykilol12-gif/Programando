import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double calor;
        int temperatura = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Ingrese 10 temperturas de dias : ");
                calor = teclado.nextInt();


                if (calor >= 30){

                    temperatura++;
                }
            }
        System.out.println("Los dias calurosos equivalen a: " + temperatura);
    }
}