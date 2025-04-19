package Tutorial.hashMaps;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
  public static void main(String[] args) {
    Map<String, Integer> m = new HashMap<>();
    m.put("tim", 5);
    m.put("bob", 7);

    System.out.println(m.get("tim")); // 5
  }
}
