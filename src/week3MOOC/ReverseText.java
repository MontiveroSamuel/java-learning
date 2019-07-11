import java.util.Scanner;

public class ReverseText {
    public static String reverse(String text) {
        String result = "";
        int contador = text.length() -1;
        while (contador >= 0){
            result = result + text.charAt(contador);
            contador --;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
