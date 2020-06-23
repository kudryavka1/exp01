package service;

import dao.FoodDao2;
import domain.Food;

import java.util.Map;

public class BusinessService {
    FoodDao2 foodDao2 = new FoodDao2();

    public Map getALL(){
        return foodDao2.getAll();
    }

    public Food findFood(String id){
        return foodDao2.find(id);
    }
}
