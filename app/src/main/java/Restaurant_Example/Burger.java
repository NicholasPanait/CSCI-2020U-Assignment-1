package Restaurant_Example;
/**
 * This stage of the design pattern is the final stage, where the indivdual class
 * is called, and in this case returns a message detailing that a Burger was ordered
 */
public class Burger implements Food {
   public void order() {
      System.out.println("You have ordered a Burger!");
   }
}