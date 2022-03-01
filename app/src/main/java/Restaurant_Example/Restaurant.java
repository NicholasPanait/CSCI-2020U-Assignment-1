package Restaurant_Example;
/**
 * The main class which utilizes the kitchen class and food super class to
 * order different types of food.  This then returns the type of food
 * to the console with a message detailing the order.
 * This stage of the design pattern is calling the method which returns
 * from one of many classes, of which all share one super class
 */
public class Restaurant {
   public static void main(String[] args) {      
      Kitchen kitchen = new Kitchen();

      Food burger = kitchen.getFood("Burger");
      burger.order();
 
      Food fries = kitchen.getFood("Fries");
      fries.order();
 
      Food pizza = kitchen.getFood("Pizza");
      pizza.order();

      Food salad = kitchen.getFood("Salad");
      salad.order();
   }
}