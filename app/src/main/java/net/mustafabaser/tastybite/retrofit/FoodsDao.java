package net.mustafabaser.tastybite.retrofit;

import net.mustafabaser.tastybite.data.entity.CRUDResponse;
import net.mustafabaser.tastybite.data.entity.FoodsResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface FoodsDao {

    /*
    URL Review:
    URL : http://kasimadalan.pe.hu/yemekler/tumYemekleriGetir.php

    Other URLs:
    http://kasimadalan.pe.hu/yemekler/sepettekiYemekleriGetir.php
    http://kasimadalan.pe.hu/yemekler/sepeteYemekEkle.php
    http://kasimadalan.pe.hu/yemekler/sepettenYemekSil.php
    http://kasimadalan.pe.hu/yemekler/resimler/ayran.png

    http://kasimadalan.pe.hu/yemekler -> Base URL
    /yemekler/tumYemekleriGetir.php -> API URL (Webservice URL)
    */

    @GET("yemekler/tumYemekleriGetir.php")
    Call<FoodsResponse> loadFoods();

    @POST("yemekler/sepeteYemekEkle.php")
    @FormUrlEncoded
    Call<CRUDResponse> addFoodToBasket(@Field("yemek_adi") String yemek_adi,
                                       @Field("yemek_resim_adi") String yemek_resim_adi,
                                       @Field("yemek_fiyat") int yemek_fiyat,
                                       @Field("yemek_siparis_adet") int yemek_siparis_adet,
                                       @Field("kullanici_adi") String kullanici_adi);

    /*
    @POST("yemekler/sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    Call<BasketResponse> loadBasket(@Field("kullanici_adi") String kullanici_adi);

    @POST("yemekler/sepettenYemekSil.php")
    @FormUrlEncoded
    Call<CRUDCevap> removeFromBasket(@Field("sepet_yemek_id") String sepet_yemek_id,
                                    @Field("kullanici_adi") String kullanici_adi);
    */
}
