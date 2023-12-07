package net.mustafabaser.tastybite.data.entity;

import java.util.List;

public class FoodsResponse {
    private List<Foods> foods;
    private int success;

    public FoodsResponse() {
    }

    public FoodsResponse(List<Foods> foods, int success) {
        this.foods = foods;
        this.success = success;
    }

    public List<Foods> getFoods(){
        return foods;
    }

    public void setFoods(List<Foods> foods) {
        this.foods = foods;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
