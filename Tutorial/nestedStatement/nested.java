package Tutorial.nestedStatement;

import java.util.Scanner;

public class nested {
  public static void main(String[] args) {
    System.out.println("Input your age: ");
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    int age = Integer.parseInt(s);

    if (age >= 18) {
      System.out.println("You can ride");
    } else if (age >= 15 && age < 18) {
      System.out.println("You can ride with an adult");
    } else {
      System.out.println("You can't ride");
    }

    sc.close();
  }
}
