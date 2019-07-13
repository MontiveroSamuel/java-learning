import java.util.ArrayList;
import java.util.Scanner;

public class ForRepeatedWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<String>();
        String word;
        while(true) {
            System.out.print("Escriba una palabra:");
            word = reader.nextLine();
            if (palabras.contains(word)) {
                break;
            }
            palabras.add(word);
        }
        System.out.println("La palabra " + word + " esta repetida.");

    }
}
