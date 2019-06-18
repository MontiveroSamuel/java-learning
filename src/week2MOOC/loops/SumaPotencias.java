import java.util.Scanner;

public class SumaPotencias {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese cuantas potencias se sumaran:");
        int potenciaMayor = Integer.parseInt(reader.nextLine());
        int potencia = 0;
        int suma = 0;

        while (potencia <= potenciaMayor){
            suma += (int)Math.pow(2, potencia);
            potencia ++;

        }


        System.out.println("La potencia " + potenciaMayor +" de 2 es: " + suma);

    }
}
