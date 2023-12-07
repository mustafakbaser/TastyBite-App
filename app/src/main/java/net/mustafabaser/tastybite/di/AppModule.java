package net.mustafabaser.tastybite.di;

import net.mustafabaser.tastybite.data.repo.FoodsDaoRepository;
import net.mustafabaser.tastybite.retrofit.ApiUtils;
import net.mustafabaser.tastybite.retrofit.FoodsDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public FoodsDaoRepository provideFoodsDaoRepository(FoodsDao foodsDao){
        return new FoodsDaoRepository(foodsDao);
    }

    @Provides
    @Singleton
    public FoodsDao provideFoodsDao(){
        return ApiUtils.getFoodsDao();
    }

}
