import java.util.Scanner;

public class triangulo{
    public static void main(String[] args){
        int angulo1, angulo2, angulo3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los 3 angulos internos: ");
        angulo1 = teclado.nextInt();
        angulo2 = teclado.nextInt();
        angulo3 = teclado.nextInt();


            if (angulo1 == angulo2 && angulo2 == angulo3) {
                System.out.println("Su triangulo es un equilatero");
            }
            else if (angulo1 == angulo2 || angulo1 == angulo3 || angulo2 == angulo3){
                    System.out.println("Es un triangulo Isóceles");
                }

        else {
        System.out.println("Sigue intentando mijo");
    }


        teclado.close();




    }



}