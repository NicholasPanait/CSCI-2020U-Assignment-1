package Restaurant_Example;

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