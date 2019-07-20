import java.util.ArrayList;


public class LengthOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> palabras){
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        for (String palabra:palabras){
            lengthList.add(palabra.length());
        }
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
