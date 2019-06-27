import java.util.Scanner;

public class PrintChristmasTree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba altura del arbol:");
        int arbolUsuario = Integer.parseInt(reader.nextLine());
        printXmasTree(arbolUsuario);
    }

    public static void printXmasTree(int alturaArbol){
        int cantdadBlancos = alturaArbol - 1;
        int cantidadStars = 1;
        while (cantdadBlancos >= 0){
            printWhithespace(cantdadBlancos);
            printStars(cantidadStars);
            cantdadBlancos --;
            cantidadStars += 2;
        }
        printWhithespace(alturaArbol - 2);
        printStars(3);
        printWhithespace(alturaArbol - 2);
        printStars(3);
    }

    public static void printWhithespace(int espacios){
        int repeticion = 0;
        String blanco = "";
        while (repeticion < espacios){
            repeticion ++;
            blanco = blanco + " ";
        }
        System.out.print(blanco);
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
