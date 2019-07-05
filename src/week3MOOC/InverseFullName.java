import java.util.Scanner;

public class InverseFullName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String name = reader.nextLine();
        int contador = name.length() -1;
        while(contador >= 0){
            System.out.print(name.charAt(contador));
            contador --;
        }

    }
}
