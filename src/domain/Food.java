package domain;

public class Food {

    private String id;
    private String foodname;
    private double price;

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodname='" + foodname + '\'' +
                ", price=" + price +
                '}';
    }

    public Food() {
    }

    public Food(String id, String foodname, double price) {
        this.id = id;
        this.foodname = foodname;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
