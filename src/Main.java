import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Simply, String> map001 = new HashMap<>(); // Object is not required to implement smth!
        map001.put(new Simply(), null);
        map001.put(new Simply(), null);
        map001.put(new Simply(), null); // ok
        map001.put(null, "r"); // ok
        map001.put(null, "r2"); // ok
        //map0.put(1, "q");


        HashMap<Integer, String> map0 = new HashMap<>();
        map0.put(4, null);
        map0.put(5, null); // ok
        map0.put(null, "r"); // ok
        map0.put(null, "r2"); // ok
        map0.put(1, "q");

        map0.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map0.get(9);             // val9

        Map<Integer, String> map2 = new HashMap<Integer, String>() {{
            put(1, "qqq");
        }};

    }
}
