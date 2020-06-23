package dao;

import domain.Food;

import java.util.LinkedHashMap;
import java.util.Map;

public class FoodDB {
    private static Map<String, Food> map = new LinkedHashMap<>();
    static {
        map.put("101",new Food("101","Apple",5));
        map.put("102",new Food("102","banana",10));
        map.put("103",new Food("103","orange",8));
        map.put("104",new Food("104","peach",15));
        map.put("105",new Food("105","watermelon",20));
        map.put("106",new Food("106","pear",10));

    }
    public static Map<String,Food> getALL(){
        return map;
    }


}
