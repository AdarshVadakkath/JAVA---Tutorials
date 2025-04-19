package Tutorial.arrayList;

import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> name = new ArrayList<>();
    name.add(5);
    name.add(6);
    name.add(8);
    name.add(9);
    name.get(0);
    name.remove(2);
    name.set(1, 20);
    name.clear();
    int x = name.size();
    name.subList(1, 4);
    boolean hello = name.contains(5);
    System.out.println(name);
    System.out.println(hello);
    System.out.println(x);
  }

}
