
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main { 

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30); 
        list.add(40);

        System.out.print(list);

        list.set(2, 10);
        list.get(1);

        System.out.println("Size of list is " + list.size());
        System.out.print(list.isEmpty());

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.clear();
        // list.toArray();
        list.contains(40);

    }
}
