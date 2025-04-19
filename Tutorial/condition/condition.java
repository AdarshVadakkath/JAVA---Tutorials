package Tutorial.condition;

public class condition {
  public static void main(String[] args) {
    int x = 2;
    int y = 3;
    int z = 10;

    boolean compare = x < y;
    boolean compare2 = y < z;
    boolean compare3 = x < z;
    boolean compare4 = x > y;
    boolean compare5 = y > z || x > z;
    boolean compare6 = x > z && y > z;
    boolean compare7 = x == y;

    System.out.println(compare);
    System.out.println(compare2);
    System.out.println(compare3);
    System.out.println(compare4);
    System.out.println(compare5);
    System.out.println(compare6);
    System.out.println(compare7);
  }
}
