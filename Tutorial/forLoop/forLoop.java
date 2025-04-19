package Tutorial.forLoop;

import java.util.Scanner;

public class forLoop {
  public static void main(String[] args) {

    int arr[] = { 1, 5, 6, 7, 4, 3 };
    String[] names = new String[5];

    for (int x = 0; x <= arr.length; x++) {
      if (arr[x] == 5) {
        System.out.println("Found a 5! at line" + x);
      }
    }

    // int count = 0;
    // for (int element : arr) {
    // System.out.println(element + " " + count);
    // count++;
    // }
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < names.length; i++) {
      System.out.print("input : ");
      String input = sc.nextLine();
      names[i] = input;
    }

    for (String name : names) {
      System.out.println(name);

    }
    sc.close();
  }
}
