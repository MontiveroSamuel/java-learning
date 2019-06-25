import java.util.Scanner;

public class PrintRigthHalfTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Intgrese altura triangulo:");
        int alturaTriangulo = Integer.parseInt(reader.nextLine());
        printTriangle(alturaTriangulo);

    }

    public static void printTriangle(int filasTriangulo) {
        int filas = 0;
        int ancho = 1;
        while (filas < filasTriangulo) {
            filas++;
            printStars(ancho);
            ancho++;
        }
    }

    public static void printStars(int cuantasStars) {
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
