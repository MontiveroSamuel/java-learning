import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("Cuantas estrellas?");
            int cuantasStars = Integer.parseInt(reader.nextLine());
            printStars(cuantasStars);
        }

    }
    //Este metodo muestra una linea con la cantidad de estrellas que pida el usuario
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
