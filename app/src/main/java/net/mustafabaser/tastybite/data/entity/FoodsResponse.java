package net.mustafabaser.tastybite.data.entity;

import java.util.List;

public class FoodsResponse {
    private List<Foods> foodsList;
    private int success;

    public FoodsResponse() {
    }

    public FoodsResponse(List<Foods> foodsList, int success) {
        this.foodsList = foodsList;
        this.success = success;
    }

    public List<Foods> getFoodsList(){
        return foodsList;
    }

    public void setFoodsList(List<Foods> foodsList) {
        this.foodsList = foodsList;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
