package coffeemachine;

import java.util.HashMap;

public class Inventory {

    private HashMap<String, Integer> ingrediantsMap;

    Inventory(){
        ingrediantsMap = new HashMap<>();
    }
    public boolean checkIngredientAvailability(String ingredientName, int amount) {
         return ingrediantsMap.containsKey(ingredientName) && ingrediantsMap.get(ingredientName) >= amount);

    }

    public void addIngredient(String name, int amount){
        if(ingrediantsMap.containsKey(name)){
            ingrediantsMap.put(name,ingrediantsMap.get(name)+amount)
        } else{
            ingrediantsMap.put(name, amount);
        }
    }

    public void reduceIngredient(String name, int amount){
        ingrediantsMap.put(name, ingrediantsMap.get(name)-amount);
    }
}
