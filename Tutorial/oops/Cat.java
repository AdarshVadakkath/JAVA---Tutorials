package Tutorial.oops;

public class Cat extends Dog {

  private int food;

  public Cat(String name, int age, int food) {
    super(name, age);
    this.food = food;
  }

  public Cat(String name, int age) {
    super(name, age);
    this.food = 50;
  }

  public void speak() {
    System.out.println(
        "I am " + " and I am " + this.getAge() + " years old. I eat " + this.food + " grams of food.");
  }
}
