import java.util.ArrayList;
import java.util.Collections;

public class ArrayGreatest {
    public static int greatest(ArrayList<Integer> list){
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("El mayor es: " + greatest(list));
    }
}
