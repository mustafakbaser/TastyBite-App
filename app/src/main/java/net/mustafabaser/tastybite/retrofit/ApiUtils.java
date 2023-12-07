package net.mustafabaser.tastybite.retrofit;

public class ApiUtils {
    public static final String BASE_URL = "http://kasimadalan.pe.hu/";

    public static FoodsDao getFoodsDao(){
        return RetrofitClient.getClient(BASE_URL).create(FoodsDao.class);
    }
}
