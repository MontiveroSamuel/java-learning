import java.util.Scanner;

public class PrintHowMany {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Cuantas veces lo repetimos?");
        int howMany = Integer.parseInt(reader.nextLine());
        int repeticiones = 0;
        while (repeticiones < howMany){
            printText();
            repeticiones ++;
        }
        System.out.println("Listo el pollo!");
    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}
