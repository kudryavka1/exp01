package domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    //关键值是food的id，值是food
    private Map<String,CarItem> foodMap = new LinkedHashMap<>();
    //总价
    private double price;

    public void addFood (Food food){
        CarItem carItem = foodMap.get(food.getId());
        if (carItem == null){
            carItem = new CarItem();
            carItem.setFood(food);
            carItem.setQuantity(1);
            foodMap.put(food.getId(),carItem);

        }else {
            carItem.setQuantity(carItem.getQuantity()+1);

        }
    }
    public double getPrice(){
        double totalPrice = 0;
        for (Map.Entry<String,CarItem> me : foodMap.entrySet()) {

            //得到每个购物项
            CarItem carItem = me.getValue();

            //将每个购物项的钱加起来，就是购物车的总价了！
            totalPrice += carItem.getPrice();
        }
        return totalPrice;
    }

    public Map<String,CarItem> getFoodMap (){
        return foodMap;
    }

    public void setFoodMap(Map<String,CarItem> foodMap){
        this.foodMap = foodMap;
    }

    public void setPrice (double price){
        this.price = price;
    }


}
