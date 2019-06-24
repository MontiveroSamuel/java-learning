import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Tamaño de lado?");
        int cuantasStars = Integer.parseInt(reader.nextLine());
        printSquare(cuantasStars);

    }
    public static void printSquare(int cantidadColumnas){
        int cantidadFilas = 0;
        while (cantidadFilas < cantidadColumnas){
            cantidadFilas ++;
            printStars(cantidadColumnas);
        }
    }
    public static void printStars(int cuantasStars){
        int repeticiones = 0;
        String starsPrint = "";

        while (repeticiones < cuantasStars) {
            if (cuantasStars == 0) {
                break;
            } else {
                repeticiones++;
                starsPrint = starsPrint + "*";
            }
        }
        System.out.println(starsPrint);
    }
}
