package domain;

public class CarItem {
    private Food food;
    private int quantity;
    private double price;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return food.getPrice()*this.quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
