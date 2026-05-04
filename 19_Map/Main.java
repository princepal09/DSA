
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United Status");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("chi", "China");
        table.putAll(mapping);
        System.out.println(table);
    }
}
