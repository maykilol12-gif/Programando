import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double puntaje;


        System.out.println("Ingrese su nota de 0 a 100: ");
        puntaje = teclado.nextDouble();
        if(puntaje >= 90 ) {
            System.out.println("Su nota es: A");
        }
            else if (puntaje >= 80) {
            System.out.println("Su nota es: carepihca");
        }
            else if (puntaje >= 70) {
            System.out.println("Su nota es: C");
        }

            else  {
            System.out.println("Su nota es: F");
        }
            }

        }









