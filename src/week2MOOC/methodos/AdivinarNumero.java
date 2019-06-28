import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random r = new Random();
        int numero = r.nextInt(100);
        System.out.println(numero);
    }
}
