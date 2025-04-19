package Tutorial.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
  public static void main(String[] args) {
    Map<String, Integer> map = new LinkedHashMap<>();

    map.put("tim", 5);
    map.put("joe", 7);
    map.put("a", 8);
    map.containsKey("tim");
    map.get("tim");

    System.out.println(map); // {tim=5, joe=7, a=8}
    System.out.println(map.get("joe")); // 7
  }

}
