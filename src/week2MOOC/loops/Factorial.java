import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba numero a factorizar");
        int numeroFactorial = Integer.parseInt(reader.nextLine());
        int factor = 1;
        int resultado = 1;
        while (factor <= numeroFactorial){
            if (numeroFactorial == 0){
                break;
            }
            resultado *= factor;
            factor ++;

        }
        System.out.println(numeroFactorial +"!" + " = " + resultado);
    }
}
