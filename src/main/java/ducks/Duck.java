import java.lang.String;

public abstract class Duck {

  public abstract void display();

  public abstract String quack();

  public void swim() {
    System.out.println("Duck swam (all ducks float)");
  }
}
