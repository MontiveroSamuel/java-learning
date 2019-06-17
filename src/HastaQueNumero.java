import java.util.Scanner;

public class HastaQueNumero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;

        System.out.println("Hasta que numero escribimos?");
        int maximo = Integer.parseInt(reader.nextLine());

        while (number <= maximo){
            System.out.println(number);
            number ++;
            if (number > maximo){
                break;
            }

        }
    }
}
