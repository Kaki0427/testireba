import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public  static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Lasha");
        map.put(2,"Vaxo");
        map.put(3,"Karlo");
        map.put(4,"Kaki");

        map.keySet().forEach(n -> System.out.println(n));
        map.values().forEach(s -> System.out.println(s));

        System.out.println(map.get(3));

    }
}
