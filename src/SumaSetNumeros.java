import java.util.Scanner;

public class SumaSetNumeros {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Numeros a sumar");
        int numeroElementosTotal = Integer.parseInt(reader.nextLine());
        int elementosSumados = 1;
        int sumaElementos = 0;

        while (elementosSumados <= numeroElementosTotal){
           sumaElementos += elementosSumados;
           elementosSumados ++;

        }
        System.out.println("La suma es " + sumaElementos);
    }
}
