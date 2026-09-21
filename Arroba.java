import java.util.Scanner;

public class Arroba {
    public static void main(String[] args) {
        // Paso 1: Crear el Scanner para leer la consola
        Scanner teclado = new Scanner(System.in);

        // Paso 2: Solicitar el correo al usuario
        System.out.print("Por favor, ingresa tu correo electrónico: ");
        String correo = teclado.nextLine();

        // Paso 3: Validar si contiene el símbolo "@"
        if (correo.contains("@")) {
            System.out.println("El formato del correo parece válido. ✔️");
        } else {
            System.out.println("Error: El correo electrónico no es válido (le falta el símbolo '@'). ❌");
        }

        // Paso 4: Cerrar el scanner
        teclado.close();
    }
}
