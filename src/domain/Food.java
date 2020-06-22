package domain;

public class Food {

    private int id;
    private String foodname;
    private int price;

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

    public Food(int id, String foodname, int price) {
        this.id = id;
        this.foodname = foodname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
