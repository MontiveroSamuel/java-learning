import java.util.Scanner;

public class DesdeHastaDonde {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Primer numero");
        int minimo = Integer.parseInt(reader.nextLine());

        System.out.println("Ultimo numero");
        int maximo = Integer.parseInt(reader.nextLine());

        while (minimo <= maximo){
            System.out.println(minimo);
            minimo ++;

            if (minimo > maximo) {
                break;

            }

        }
    }
}
