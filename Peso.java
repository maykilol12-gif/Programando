import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, estatura, imc;
        System.out.println("Ingrese peso: ");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su estatura: ");
        estatura = teclado.nextDouble();
         imc = peso / (estatura * estatura);
         if (imc <=18.5){
             System.out.println("Bajo peso");
         } else if (imc >= 18.5 && imc <= 24.9) {
             System.out.println("Peso normal");

         } else if (imc >= 24.9 && imc <= 29.9) {
             System.out.println("Sobre peso");

         }
else {
             System.out.println("Obesidad");
         }

    }
}

