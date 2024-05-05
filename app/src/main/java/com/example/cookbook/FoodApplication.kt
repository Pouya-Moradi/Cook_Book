package com.example.cookbook

import android.app.Application
import com.example.cookbook.data.FoodDataProvider
import com.example.cookbook.data.FoodRepository
import com.example.cookbook.data.db.CookDataBase

class FoodApplication: Application() {

    lateinit var foodRepository: FoodRepository
    override fun onCreate() {
        super.onCreate()
        val cookDataBase = CookDataBase.getInstance(this)
        foodRepository = FoodRepository(cookDataBase.foodDao())
        if (cookDataBase.foodDao().getAllFoods().isEmpty())
            cookDataBase.foodDao().insertAllFoods(FoodDataProvider.foods)
    }
}