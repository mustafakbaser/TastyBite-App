package net.mustafabaser.tastybite.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import net.mustafabaser.tastybite.data.entity.Foods;
import net.mustafabaser.tastybite.data.repo.FoodsDaoRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class HomepageViewModel  extends ViewModel {
    public FoodsDaoRepository foodsDaoRepository;
    public MutableLiveData<List<Foods>> foodsList;

    @Inject
    public HomepageViewModel(FoodsDaoRepository foodsDaoRepository){
        this.foodsDaoRepository = foodsDaoRepository;
        loadFoods();
        foodsList = foodsDaoRepository.foodsList;
    }

    public void loadFoods() {
       foodsDaoRepository.loadFoods();
    }


    public void addToBasket(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, String kullanici_adi){
        foodsDaoRepository.addToBasket(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet, kullanici_adi);
    }


    // Search
    public List<Foods> searchFood(List<Foods> foodsList, String searchKeyword){
        List<Foods> searchedList = new ArrayList<>();
        String keyword = searchKeyword.toLowerCase();
        for(Foods food : foodsList){
            if(food.getYemek_adi().toLowerCase().contains(keyword)){
                searchedList.add(food);
            }
        }
        return searchedList;
    }
}
