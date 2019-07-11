import java.util.Scanner;

public class WordInsideWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String primera = reader.nextLine();
        System.out.println("Ingrese segunda palabra:");
        String segunda = reader.nextLine();

        if ((primera.contains(segunda))){
            System.out.println("La palabra " + segunda + " esta incluida en '" + primera + "'.");
        }else{
            System.out.println("La palabra '" + segunda + "' no esta incluida en '" + primera + "'.");
        }
    }
}
