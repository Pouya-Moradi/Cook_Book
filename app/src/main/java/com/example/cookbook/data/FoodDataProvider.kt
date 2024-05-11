package com.example.cookbook.data

import com.example.cookbook.data.model.Food
import com.example.cookbook.data.model.FoodCategory

object FoodDataProvider {
    val foodCategories = listOf(
        FoodCategory(1,"غذای ایرانی", "https://chishi.ir/wp-content/uploads/2019/10/ghorme-sabzi.jpg"),
        FoodCategory(2,"غذای فرنگی", "https://chishi.ir/wp-content/uploads/2020/01/bif-esteraganof.jpg"),
        FoodCategory(3,"غذای آسیای شرقی", "https://www.ghafaridiet.com/upload/article/1707428002.jpg"),
    )

    val foods = listOf(
        Food(
            name = "قرمه سبزی",
            foodCategoryId = 1,
            imageUrl = "https://chishi.ir/wp-content/uploads/2019/10/ghorme-sabzi.jpg",
            recipe = "خورش قورمه سبزی یکی از غذاهای سنتی و اصیل ایرانی است که نه تنها در میان ایرانیان بسیار محبوب است بلکه در خارج از ایران هم طرفداران بسیاری دارد. از محبوب ترین انواع خورش قورمه سبزی در مناطق مختلف ایران می توان به خورش قورمه سبزی تهرانی ، خورش قورمه سبزی گیلانی ، خورش قورمه سبزی جنوبی و خورش قورمه سبزی ترکی یا تبریزی اشاره کرد که از نظر مواد کمی با هم متفاوت هستند. برای مشاهده آموزش آشپزی کامل و مرحله به مرحله طرز تهیه خورش قورمه سبزی در ادامه با چی شی همراه باشید." +
            "برای تهیه قورمه سبزی خوشمزه، ابتدا لوبیا قرمز را از شب قبل خیس کنید تا نفخ آن گرفته شود. سپس پیاز را نگینی خرد کرده و با مقداری روغن و ادویه\u200Cها تفت دهید. گوشت را به قطعات مناسب برش داده و به پیاز اضافه کنید تا سرخ شود. پس از آبکش کردن لوبیا، آن را به همراه آب به مخلوط گوشت و پیاز اضافه کرده و اجازه دهید تا بپزند. سبزی خورشتی را سرخ کرده و به خورش اضافه کنید. در نهایت، چاشنی\u200Cها را به همراه لیمو عمانی افزوده و در دقایق پایانی، طعم خورش را با نمک و فلفل تنظیم کنید."
        ),
        Food(
            name = "بیف استروگانف",
            foodCategoryId = 2,
            imageUrl = "https://chishi.ir/wp-content/uploads/2020/01/bif-esteraganof.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "بیف استروگانف",
            foodCategoryId = 2,
            imageUrl = "https://chishi.ir/wp-content/uploads/2020/01/bif-esteraganof.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "بیف استروگانف",
            foodCategoryId = 2,
            imageUrl = "https://chishi.ir/wp-content/uploads/2020/01/bif-esteraganof.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "بیف استروگانف",
            foodCategoryId = 2,
            imageUrl = "https://chishi.ir/wp-content/uploads/2020/01/bif-esteraganof.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "بیف استروگانف",
            foodCategoryId = 2,
            imageUrl = "https://chishi.ir/wp-content/uploads/2020/01/bif-esteraganof.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "سوشی",
            foodCategoryId = 3,
            imageUrl = "https://www.ghafaridiet.com/upload/article/1707428002.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "سوشی",
            foodCategoryId = 3,
            imageUrl = "https://www.ghafaridiet.com/upload/article/1707428002.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "سوشی",
            foodCategoryId = 3,
            imageUrl = "https://www.ghafaridiet.com/upload/article/1707428002.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "سوشی",
            foodCategoryId = 3,
            imageUrl = "https://www.ghafaridiet.com/upload/article/1707428002.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
        Food(
            name = "سوشی",
            foodCategoryId = 3,
            imageUrl = "https://www.ghafaridiet.com/upload/article/1707428002.jpg",
            recipe = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum"
        ),
    )

    
}