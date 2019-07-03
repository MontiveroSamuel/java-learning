public class Average {
    public static double average(int number1, int number2, int number3, int number4) {
        double promedio = sum(number1, number2 , number3, number4) / 4.0;
        return promedio;

    }
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static void main(String[] args) {
        double answer = average(25, 3, 6, 10);
        System.out.println("average: " + answer);
    }
}
