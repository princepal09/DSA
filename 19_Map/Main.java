
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        // Deletion 
        table.remove("en");

        table.size();

        // table.clear();
        table.putIfAbsent("in", "india2");

        table.get("chi");

        table.containsKey("us");

        table.containsValue("India");

        table.replace("in", "indonesia");

        Set<String> st = table.keySet();

        Collection<String> st1 = table.values();

        // get all entries from set
// get all entries from map
        Set<Map.Entry<String, String>> entries = table.entrySet();

        for (Map.Entry<String, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " value " + entry.getValue());
        }

    }
}
