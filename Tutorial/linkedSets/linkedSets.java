package Tutorial.linkedSets;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedSets {
  public static void main(String[] args) {
    Set<Integer> name = new LinkedHashSet<Integer>();
    name.add(10);
    name.add(0);
    name.add(20);
    name.add(30);

    int x = name.size();
    System.out.println(x);
    System.out.println(name);
  }
}
