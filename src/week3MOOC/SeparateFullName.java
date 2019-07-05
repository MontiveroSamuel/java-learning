import java.util.Scanner;

public class SeparateFullName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba un nombre:");
        String nombre = reader.nextLine();
        int numerador = 1;
        int cuentaChar = 0;

        while(cuentaChar < nombre.length()){
            char currenteChar = nombre.charAt(cuentaChar);
            System.out.println(numerador + ". character: " + currenteChar);
            cuentaChar ++;
            numerador ++;

        }
    }
}
