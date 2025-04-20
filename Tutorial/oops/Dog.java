package Tutorial.oops;

public class Dog {
  public String name;
  public int age;
  protected static int count = 0;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
    Dog.count = Dog.count + 1;
  }

  public void speak() {
    System.out.println("I am " + this.name + "and I am" + this.age + " years old.");

  }

  public int getAge() {
    return this.age;
  }

  public static void display() {
    System.out.println("The number of dogs is " + Dog.count);
  }
}
