import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean esMiembro = true;
        double precioTotal;
        double precioFinal;

        System.out.println("Cual es el precio del producto: ");
        precioTotal = teclado.nextDouble();

        if (esMiembro){
            precioFinal = precioTotal * 0.85;
            System.out.println("El valor con el 15% de descuento es: "+ precioFinal);
        }
        else {
            precioFinal = precioTotal;
            System.out.println("Su precio final es: "+ precioFinal);


        }








    }






    }




