
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();  // Ordering not preserve
        Set<Integer> st1 = new HashSet<>();  // Ordering not preserve

        // HashSet<Integer> st = new HashSet<>();

        // Set<Integer> st = new LinkedHashSet<>(); =======>>>>>>>> Ordering Preserveeeeeeeeeeee
        // Set<Integer> st = new TreeSet<>();  =============>>>>>>> No Duplicates, Sorted automatically 


        st.add(10);
        // st.add(10); Duplicates are not allowed
        st.add(20);
        st.add(30);

        st1.add(30);
        st1.add(40);
        st1.add(50);

        st.retainAll(st1);
        System.out.println(st);



    }
}
