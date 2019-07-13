import java.util.ArrayList;
import java.util.Scanner;

public class ForEachWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<String>();
        String word;
        do {
            System.out.print("Escriba una palabra:");
            word = reader.nextLine();
            palabras.add(word);

        } while (!word.isEmpty());
        System.out.println("Las palabras que escribiste son:");
        for (String palabra: palabras) {
            System.out.println(palabra);
        }
    }
}
