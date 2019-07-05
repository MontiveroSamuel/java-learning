import java.util.Scanner;

public class SeparateCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba un nombre");
        String name = reader.nextLine();
        if (name.length() < 3) {
            System.out.println("No tiene el minimo de letras");
        } else {
            System.out.println("Sus primeras 3 letras son:");
            System.out.println("1. letra: " + name.charAt(0));
            System.out.println("2. letra: " + name.charAt(1));
            System.out.println("3. letra: " + name.charAt(2));

        }
    }
}