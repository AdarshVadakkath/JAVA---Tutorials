package Tutorial.hashSets;

import java.util.HashSet;
import java.util.Set;

public class hashSets {
  public static void main(String[] args) {
    Set<Integer> name = new HashSet<>();
    name.add(5);
    name.add(6);
    name.add(8);
    name.add(9);
    name.remove(9);

    // to clear entire set
    // name.clear();

    int x = name.size();

    boolean hello = name.contains(5);
    System.out.println(name);
    System.out.println(hello);
    System.out.println(x);
  }
}
