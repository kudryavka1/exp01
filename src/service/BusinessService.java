package service;

import dao.FoodDao2;
import domain.Cart;
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
    public void buyFood(String id, Cart cart){

        Food food = foodDao2.find(id);

        cart.addFood(food);
    }

    public void deleteFood (String id,Cart cart){
        if (cart == null) {
            //
        }else {
            cart.getFoodMap().remove(id);
        }
    }

}
