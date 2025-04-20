package Tutorial.oops;
// import java.util.Scanner;

public class oops {
  public static void main(String[] args) {

    Dog tim = new Dog("tim", 5);
    tim.speak();

    int x = tim.getAge();
    System.out.println(x); // 5

    Dog tim = new Dog("tim", 5);
    Dog joe = new Dog("joe", 7);
    System.out.println(tim.name); // tim
    System.out.println(joe.name); // joe

  }
  // Scanner sc = new Scanner(System.in);

  // String h = "hello";
  // h.length();

  // tim(sc.nextLine(), sc.nextInt());
  // sc.close();

  // public static void tim(String str, int x) {
  // for (int i = 0; i < x; i++) {
  // System.out.println(str);
  // }
  // }
}
