import java.util.ArrayList;

public class Variance {
    public static double variance(ArrayList<Integer> lista){
        ArrayList<Double> potencias = new ArrayList<Double>();

        for (int numero:lista) {
            double resta = numero - promedio(lista);
            double potenciaResta = Math.pow(resta, 2);
            potencias.add(potenciaResta);
        }
        double sumatoria = sumaGeneric(potencias);
        System.out.println(sumatoria);
        return sumatoria / (lista.size() - 1);


    }
    
    public static double sumaPot(ArrayList<Double> list) {
        double sum = 0;
        for (double numero : list) {
            sum = sum + numero;
        }
        return sum;
    }
    public static double suma(ArrayList<Integer> list){
        int sum = 0;
        for (int numero:list){
            sum = sum + numero;
        }
        return sum;
    }

    private static <T extends Number> double sumaGeneric(ArrayList<T> numbers){
        double sum = 0;
        // duda ->   list.forEach((num) -> sum += num);
        for (T numero:numbers){
            sum = sum + numero.doubleValue();
         }
        return sum;
    }

    public static double promedio(ArrayList<Integer> list) {
        return sumaGeneric(list) / (((double)list.size()) * 1.0);
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
