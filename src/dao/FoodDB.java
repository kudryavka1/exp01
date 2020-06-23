package dao;

import domain.Food;

import java.util.LinkedHashMap;
import java.util.Map;

public class FoodDB {
    private static Map<String, Food> map = new LinkedHashMap<>();
    static {
        map.put("1",new Food("1","Apple",5));
        map.put("2",new Food("2","banana",10));
        map.put("3",new Food("3","orange",8));
        map.put("4",new Food("4","peach",15));

    }
    public static Map<String,Food> getALL(){
        return map;
    }


}
