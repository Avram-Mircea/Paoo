import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(8);
        lista.add(1);
        lista.add(0);
        lista.add(7);
        lista.add(3);
        lista.add(6);
        lista.add(9);
        lista.add(2);
        lista.add(4);

        System.out.println("Lista nesortata: " + lista);
        Collections.sort(lista);
        System.out.print("Lista sortata: " + lista);
    }
}