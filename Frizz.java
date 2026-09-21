import java.util.Scanner;

public class Frizz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 30 ; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }


        
        
        
    }

}