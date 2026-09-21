import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int b = 0, vol = 0, a = 0;
        System.out.printf("Ingrese su edad: ");
        b = teclado.nextInt();
        System.out.printf("Ingrese en cuantos años quiere saber su edad: ");
        vol = teclado.nextInt();
        a = b + vol;


        System.out.println("Su edad es: " + a);
        teclado.close();


    }


}