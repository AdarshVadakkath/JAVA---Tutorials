package Tutorial.treeSets;

import java.util.Set;
import java.util.TreeSet;

public class treeSets {
  public static void main(String[] args) {
    Set<Integer> name = new TreeSet<>();
    name.add(-5);
    name.add(-20);
    name.add(6);
    name.add(8);
    name.add(9);

    int x = name.size();
    System.out.println(x);
    System.out.println(name);
  }
}
