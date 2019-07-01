import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random r = new Random();
        int numero = r.nextInt(100);
        System.out.println("Adivine el numero:");
        int guess = Integer.parseInt(reader.nextLine());
        int intentos = 0;
        while (!(guess == numero)){

            if (guess < numero){
                intentos ++;
                System.out.println("El numero es mayor! Intentos: " + intentos);
                System.out.println("Adivine el numero:");
                guess = Integer.parseInt(reader.nextLine());
            } else{
                intentos ++;
                System.out.println("El numero es menor! Intentos: " + intentos);
                System.out.println("Adivine el numero:");
                guess = Integer.parseInt(reader.nextLine());
            }
        }
        intentos ++;
        System.out.println("Correcto! Has dado en el clavo!" );
        System.out.println("Te llevo " + intentos + " intentos!");
    }
}
