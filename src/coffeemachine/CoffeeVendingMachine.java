package coffeemachine;

import java.util.HashMap;
import java.util.Set;

public class CoffeeVendingMachine {

    private Inventory inventory ;
    CoffeeVendingMachine(Inventory inventory){
        this.inventory = inventory;

    }

    public  void makeCoffee(CoffeeType type){
        HashMap<String, Integer> list = getAllIngrediantsRequiredForCoffee(type);
        if(checkAllIngrediantsAvailablity(list)){
            reduceAllIngrediants(list);
            System.out.println("Coffee is ready");

        } else {
            System.out.println("Unable to prepare coffee as ingrediants are not sufficent!!!");
        }

    }

    public  void stir(){
        System.out.println(" Stirring in process!!!");
    }

    public void addExtraIngredient(String name, int amount){
        if(inventory.checkIngredientAvailability(name, amount)){
            inventory.reduceIngredient(name, amount);
            System.out.println("Added Extra Ingredient to Coffee");
        } else {
            System.out.println("Ingrediants not available...");
        }
    }

    private HashMap<String, Integer> getAllIngrediantsRequiredForCoffee(CoffeeType type){
        HashMap<String,Integer> list = new HashMap<>();
        switch (type){
            case LATTE :
                list.put("Milk" , 200);
                list.put("Coffee Powder" , 10);
                break;
            case CAPICUNO:
                list.put("Milk" , 100);
                list.put("Coffee Powder" , 20);
                break;
            case ESPRESSO:
                list.put("Milk" , 50);
                list.put("Coffee Powder", 20);
                break;

        }
        return list;
    }

    private boolean checkAllIngrediantsAvailablity(HashMap<String , Integer> list){

        for(String key : list.keySet()){
            if(!inventory.checkIngredientAvailability(key, list.get(key))){
                return false;
            }
        }
        return true;
    }

    private void reduceAllIngrediants(HashMap<String , Integer> list){
        for(String key : list.keySet()){
            inventory.reduceIngredient(key, list.get(key));
        }
    }


}
