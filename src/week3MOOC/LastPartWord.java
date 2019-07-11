import java.util.Scanner;

public class LastPartWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Esctiba una palabra");
        String word = reader.nextLine();
        System.out.println("De cuanto el corte posterior?");
        int corteTrasero = Integer.parseInt(reader.nextLine());

        System.out.println("resultado: " + word.substring(word.length() - corteTrasero));
    }
}
