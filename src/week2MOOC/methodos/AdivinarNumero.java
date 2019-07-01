import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random r = new Random();
        int numero = r.nextInt(100);
        int intentos = 0;
        int guess = -1;
        while (guess != numero){
            intentos ++;
            System.out.println("Adivine el numero:");
            guess = Integer.parseInt(reader.nextLine());
            if (guess < numero){
                System.out.println("El numero es mayor! Intentos: " + intentos);
            }else if(guess > numero){
                System.out.println("El numero es menor! Intentos: " + intentos);
            }
        }
        System.out.println("Correcto! Has dado en el clavo!" );
        System.out.println("Te llevo " + intentos + " intentos!");
    }
}
