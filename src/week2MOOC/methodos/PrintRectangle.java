import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba Altura del crectangulo:");
        int alturaUsuario = Integer.parseInt(reader.nextLine());
        System.out.println("Escriba Ancho del cuadrado:");
        int anchoUsuario = Integer.parseInt(reader.nextLine());

        printRectangle(alturaUsuario, anchoUsuario);

    }

    public static void printRectangle (int alto, int ancho){
        int altura = 0;
        while (altura < alto){
            altura ++;
            printStars(ancho);
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
