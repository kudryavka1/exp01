package dao;

import domain.Food;

import java.util.Map;

public class FoodDao2 {
    public Map<String, Food> getAll(){
        return FoodDB.getALL();

    }
    public Food find(String id){
        return FoodDB.getALL().get(id);
    }
}
