import java.util.Scanner;

public class PrintLeftHalfTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);



    }

    public static void printLeftHalf(int alturaTriangulo){
    //buscar la forma de hacer que los dos metodos se usen en la misma linea
        // para formar la segunda mitad del triangulo

    }
    public static void printWhithespace(int espacios){
        int repeticion = 0;
        String blanco = "";
        while (repeticion < espacios){
            repeticion ++;
            blanco = blanco + " ";
        }
        System.out.println(blanco);
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
