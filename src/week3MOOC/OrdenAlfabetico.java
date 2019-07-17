import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenAlfabetico {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<String>();
        String word;
        while (true){
            System.out.print("Escriba una palabra");
            word = reader.nextLine();
            if (word.equals("")){
                break;
            }
            palabras.add(word);

        }
        System.out.println("Usted escribio las siguientes palabras:");
        Collections.sort(palabras);
        for (String palabra : palabras){
            System.out.println(palabra);
        }
    }
}

