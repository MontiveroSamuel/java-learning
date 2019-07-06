import java.util.Scanner;

public class FirstPartWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba un texto:");
        String texto = reader.nextLine();
        System.out.println("En donde lo cortamo?");
        int corte = Integer.parseInt(reader.nextLine());

        System.out.println("Corte izquierdo: " + texto.substring(0, corte));

    }
}
