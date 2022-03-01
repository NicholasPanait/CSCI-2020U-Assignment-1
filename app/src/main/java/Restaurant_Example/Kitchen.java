package Restaurant_Example;
/**
 * Takes an input foodName and returns a Food of either 
 * Pizza, Burger, Fries, or Salad depending on the input
 * This stage in the design pattern is calling objects
 * that are implementing the Food interface
 * @param foodName A String containing the name of the food, this is then
 *                 used to create a new food of that type 
 * @returns a class of the interface Food
 */
public class Kitchen {
   public Food getFood(String foodName){	
      if(foodName == "Pizza"){
         return new Pizza();
      } 
      else if(foodName == "Burger"){
         return new Burger();
      } 
      else if(foodName == "Fries"){
         return new Fries();
      }
      else if(foodName == "Salad"){
        return new Salad();
     }
     return null;
   }
}