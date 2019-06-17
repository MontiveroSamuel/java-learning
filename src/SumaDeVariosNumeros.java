import java.util.Scanner;

public class SumaDeVariosNumeros {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int suma = 0;

        while (true){
            System.out.println("Ingrese numero para sumar, cero(0) finaliza suma:");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            }
            if (read != 0) {
                suma = suma + read;
            }
            System.out.println("La suma va: " + suma);
            }

        System.out.println("La suma total es: " + suma);
        }

}

