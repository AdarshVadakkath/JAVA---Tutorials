package Tutorial.operators;

public class operators {
  public static void main(String[] args) {
    double x = 5;
    double y = 10;
    double z = 15;
    int x1 = 5;
    int y1 = 10;
    int z1 = 15;
    double sum = x + y + z;
    int product = x1 * y1 * z1;
    int difference = x1 - y1 - z1;
    double quotient = x / y / z;
    double remainder = x % y % z;

    System.out.println(sum);
    System.out.println(product);
    System.out.println(difference);
    System.out.println(quotient);
    System.out.println(remainder);

    double d = Math.pow(x1, y1); // x1^y1
    System.out.println(d);
  }
}
