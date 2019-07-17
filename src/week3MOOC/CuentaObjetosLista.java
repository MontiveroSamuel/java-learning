import java.util.ArrayList;

public class CuentaObjetosLista {
    public static int cuentaObjetos (ArrayList<String> list){
        return list.size();
    }
    public static void removeLast (ArrayList<String> list){
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<String>();
        animales.add("gato");
        animales.add("perro");
        animales.add("canario");
        animales.add("leon");
        
        System.out.println(animales);
        System.out.print("La cantidad de elementos de la lista es:");
        System.out.println(cuentaObjetos(animales));
        System.out.println();
        removeLast(animales);

        System.out.println(animales);
    }
}
