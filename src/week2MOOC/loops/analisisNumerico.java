import java.util.Scanner;

public class analisisNumerico {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingese numeros (-1 = break):");
        int numero;
        int suma = 0;
        int elementos = 0;
        double media = 0;
        int pares = 0;
        int impares = 0;

        while (true){
            numero = Integer.parseInt(reader.nextLine());
            if (numero == -1){
                break;

            }else{
                suma += numero;
                elementos ++;
                media = suma / elementos;
                if (numero%2 ==1) {
                    impares ++;
                }else {
                    pares ++;
                }
            }


        }
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("Se sumaron " + elementos + " numeros");
        System.out.println("El promedio de numeros ingresados es: " + media);
        System.out.println("Hay " + pares + " numeros pares");
        System.out.println("Hay " + impares + " numeros impares");
        System.out.println("Gracias vuelva prontos!");

    }
}
