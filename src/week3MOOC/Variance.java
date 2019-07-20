import java.util.ArrayList;

public class Variance {
    public static double variance(ArrayList<Integer> lista){

        for (int numero:lista) {
            double potencias = Math.pow((numero + promedio(lista)), 2);

        }
    }
    public static int suma(ArrayList<Integer> list){
        int sum = 0;
        for (int numero:list){
            sum = sum + numero;
        }
        return sum;
    }
    public static double promedio(ArrayList<Integer> list){
        double promedio = suma(list) / (list.size() * 1.0);
        return promedio;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
