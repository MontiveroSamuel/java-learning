import java.util.Scanner;

public class SumaSetMayorMenor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Desde donde sumo?");
        int primerElemento = Integer.parseInt(reader.nextLine());
        System.out.println("Hasta donde sumo?");
        int ultimoElemento = Integer.parseInt(reader.nextLine());
        int sumaElementos = 0;

        while (primerElemento <= ultimoElemento){
           sumaElementos += primerElemento;
            ++ primerElemento;

        }
        System.out.println("La suma es " + sumaElementos);
    }
}
