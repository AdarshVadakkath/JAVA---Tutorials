package Tutorial.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
  public static void main(String[] args) {
    Map<String, Integer> map = new TreeMap<>();

    map.put("sad", 20);
    map.put("wait", 200);

    System.out.println(map);
    System.out.println(map.get("wait"));
  }
}
