package org.fasttrackit;

public class AnimalFood {

    private String foodName;
    private int foodPrice;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public boolean isFoodAvailability() {
        return foodAvailability;
    }

    public void setFoodAvailability(boolean foodAvailability) {
        this.foodAvailability = foodAvailability;
    }

    private int foodQuantity;
    private boolean foodAvailability;

    public AnimalFood(String foodName) {
        this.foodName = foodName;
    }


}
