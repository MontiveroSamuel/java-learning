public class Least {
    public static int least(int number1, int number2) {
        if (number1 < number2){
            return number1;
        } else if (number2 < number1){
            return number2;
        }else{
            return number1;
        }
    }
    public static void main(String[] args) {
        int answer =  least(3, 7);
        System.out.println("Least: " + answer);
    }
}
