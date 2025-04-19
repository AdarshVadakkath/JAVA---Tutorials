package Tutorial.whileLoop;

import java.util.Scanner;

public class happy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number : ");
    int x = sc.nextInt();

    // int count = 0;

    // while (x != 10) {
    // System.out.println("Typed 10...");
    // System.out.println("Type a number : ");
    // x = sc.nextInt();
    // count++;

    // }
    // System.out.println("You typed 10 " + count + " times");

    do {
      System.out.println("Typed 10...");
      System.out.println("Type a number : ");
      x = sc.nextInt();
    } while (x != 10);
    sc.close();
  }
}
