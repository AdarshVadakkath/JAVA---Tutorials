package Tutorial.input;

import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String scanned = sc.next();
    int x = Integer.parseInt(scanned);
    System.out.println(x);
    sc.close();
  }
}
