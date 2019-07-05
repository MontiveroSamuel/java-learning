import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un nombre:");
        String name = reader.nextLine();
        System.out.println(name + " esta formado por " + lengthName(name) + " letras!");
        System.out.println("Su primer letra es " + primerLetra(name));
        System.out.println("Su ultima letra es " + ultimaLetra(name));
    }
    public static int lengthName(String nombre){
        int length = nombre.length();
        return length;
    }
    public static char primerLetra(String nombre){
        char firstChar = nombre.charAt(0);
        return firstChar;
    }
    public static char ultimaLetra(String nombre){
        char lastChar = nombre.charAt(nombre.length()-1);
        return lastChar;
    }
}
