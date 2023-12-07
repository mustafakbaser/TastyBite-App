package net.mustafabaser.tastybite.data.repo;

import androidx.lifecycle.MutableLiveData;

import net.mustafabaser.tastybite.data.entity.CRUDResponse;
import net.mustafabaser.tastybite.data.entity.Foods;
import net.mustafabaser.tastybite.data.entity.FoodsResponse;
import net.mustafabaser.tastybite.retrofit.FoodsDao;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodsDaoRepository {
    public MutableLiveData<List<Foods>> foodsList = new MutableLiveData<>();
    //public MutableLiveData<List<Cart>> cartList = new MutableLiveData<>();
    private FoodsDao foodsDao;

    public FoodsDaoRepository(FoodsDao foodsDao){
        this.foodsDao = foodsDao;
    }

    public void loadFoods() {
        foodsDao.loadFoods().enqueue(new Callback<FoodsResponse>() {
            @Override
            public void onResponse(Call<FoodsResponse> call, Response<FoodsResponse> response) {
                List<Foods> list = response.body().getFoods();
                foodsList.setValue(list);
            }

            @Override
            public void onFailure(Call<FoodsResponse> call, Throwable t) {
            }
        });
    }


    // Add food to the basket
    public void addToBasket(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, String kullanici_adi){
        foodsDao.addFoodToBasket(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet, kullanici_adi).enqueue(new Callback<CRUDResponse>() {
            @Override
            public void onResponse(Call<CRUDResponse> call, Response<CRUDResponse> response) {

            }
            @Override
            public void onFailure(Call<CRUDResponse> call, Throwable t) {

            }
        });
    }

        // Remove from the basket
/*
        public void removeFromBasket(String sepet_yemek_id, String kullanici_adi) {
            foodsDao.removeFromBasket(sepet_yemek_id, kullanici_adi).enqueue(new Callback<CRUDResponse>(){
                @Override
                public void onResponse(Call<CRUDResponse> call, Response<CRUDResponse> response) {
                    loadBasket(kullanici_adi);
                }

                @Override
                public void onFailure(Call<CRUDResponse> call, Throwable t) {}
            });
        }
        */
}
