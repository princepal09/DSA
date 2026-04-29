
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    // dynamic size 
    // primitive data types can't be stored directly 
    public static void main(String args[]) {
        // Java Collection Framework
        // ClassName objectName  = new CLassName();

        // Collection<Integer> list = new ArrayList<>();
        // List<Integer> ls = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Add Element  ===> 
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        // list.clear()
        list.size();

        list.add(1, 9); // O(n)

        System.out.println(list);

        // Get Operations O(1)
        int element = list.get(2);
        System.out.println(element);

        // Remove Element O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at index  O(n)
        list.set(2, 10);
        System.out.println(list);

        // Contains Element O(n)
        System.out.println(list.contains(7)); // return boolean value
        System.out.println(list.contains(2)); // return boolean value

        // iterator 
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        }

        // size functionnn 
        System.out.println(list.size());
        list.isEmpty();

        Collections.sort(list); // for ascending order
        Collections.sort(list, Collections.reverseOrder()); // for descending order

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
