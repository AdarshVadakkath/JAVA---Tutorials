package Tutorial.ifElse;

import java.util.Scanner;

public class ifElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    if (s.equals("tim")) {
      System.out.println("You typed tim");
    } else if (s.equals("hello")) {
      System.out.println("you typed hello");
    } else {
      System.out.println("You typed something else");
    }
    sc.close();
  }
}
