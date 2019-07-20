import java.util.ArrayList;

public class ArrayListSum {
    public static int suma(ArrayList<Integer> list){
        int sum = 0;
        for (int numero:list){
            sum = sum + numero;
        }
        return sum;
    }
    //El metodo promedio es de un nuevo ejercicio pero aproveche
    //este ejercicio par realizarlo, ya que utilizaba el mismo metodo "suma"
    public static double promedio(ArrayList<Integer> list){
        double promedio = suma(list) / (list.size() * 1.0);
        return promedio;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(3);
        numeros.add(9);
        numeros.add(2);
        numeros.add(5);

        System.out.println("La suma es " + suma(numeros));
        System.out.println("El promedio es " + promedio(numeros));

        numeros.add(17);

        System.out.println("Ahora con 21 mas, es " + suma(numeros));
        System.out.println("El promedio es " + promedio(numeros));
    }
}
