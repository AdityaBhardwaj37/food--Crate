package food.order.delivery.online.offers.deals.coupons.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DataFactory {

    val URL_ALL_APPS = BASE_URL + "1x50W8k0Yq_wcO4EZKVbxA0DC0qqLcx0nxbOPvsREbpY/values/Sheet1!A2:E/"
    val URL_CAROUSEL_IMAGES = BASE_URL + "1Vd_yCaox6qx14CZtM3H-N2dUnGXYSCleTpGZPCb2qRA/values/Sheet1!A2:E/"
    val URL_TRENDING_DATA = BASE_URL + "1GNLz_mZREGuxEuKGEG_x9BtRgyl4jgX20xozEoLrL1g/values/Sheet1!A2:E/"
    val URL_DEALS_DATA = BASE_URL + "1PWqbWIil-YoQ5DNmPvRtUeUAkbXGiiYtgFtaWUMjvyc/values/Sheet1!A2:F/"
    val URL_CHINESE = BASE_URL + "18lgCNyZbjE0NxDzJ7M7uUFT5auE1TJAVYHyukQH7WVY/values/Sheet1!A2:E/"
    val URL_THALI = BASE_URL + "1-7iUmKXou4Btdf8ni3AFy1XzpGElxx4wZYaWhsYcRzs/values/Sheet1!A2:E/"
    val URL_DESSERT = BASE_URL + "1LNibcHywN3cjWUJb2kfDgy5JmaRPwWYr_B-IZJ8YZVo/values/Sheet1!A2:E/"
    val URL_NON_VEG = BASE_URL + "1ajFvTcFpSIZNZcB9PZUgcWosCB23z4oUbavr_5UJ1zY/values/Sheet1!A2:E/"
    val URL_SOUTH_INDIAN = BASE_URL + "1NTfFyMAvndalSJRQOkjnxiHINku3nRSbBJUY1DrELjs/values/Sheet1!A2:E/"
    val URL_FAST_FOOD = BASE_URL + "1cfRTDZ1m0NMDnredrrT0KizvWxNvZXWy55HNpWRRp-o/values/Sheet1!A2:E/"
    val URL_BAKERY = BASE_URL + "1_Ac7gycRIkNDY9ye6n-hgRgW_Lo4Dj2kTQ-u1LJGWIY/values/Sheet1!A2:E/"
    val URL_ITALIAN = BASE_URL + "1iOOoVLR7Osw6bkvJNnjhIN580RgrbytmiTo852IyY6k/values/Sheet1!A2:E/"
    val URL_BEVERAGES = BASE_URL + "1QnIHnqV_Ag7I5dlgwgVaqpm9DCR64jXfCvZ44QxztV8/values/Sheet1!A2:E/"
    val URL_VEGETARIAN = BASE_URL + "1Hc57g2ndDUpeV8I1yecwU42VIUIg0jvgAQhJwIES9XI/values/Sheet1!A2:E/"
    val URL_SEAFOOD = BASE_URL + "1nqjBqmpY_yxyHy4leZVuFZGkEZtgV2twbfAMberPaAI/values/Sheet1!A2:E/"
    val URL_NORTH_INDIAN = BASE_URL + "1KN5lepRvE3H5nO7wZ5SJmkIrUGii6-Nd2OLPk22Z-E4/values/Sheet1!A2:E/"
    val URL_MEXICAN = BASE_URL + "1usrl_RWgReSBbwR8hXS2KZ9UJ9VTsmIkBvZibv4QgCs/values/Sheet1!A2:E/"
    val URL_THAI = BASE_URL + "1sqmDx8Mgw8uddYRu8qnzu8dsPetAmJeghkwKLNVIGW0/values/Sheet1!A2:E/"
    val URL_USEFUL_APP = BASE_URL + "1rJWZ1hzbKKhm9p_2RSGLNHca2ep4GlFp6qG_r0x4w3Y/values/Sheet1!A2:D/"
    val KEY = "AIzaSyDOMN71LUwroDWmIy-nImxWikJ2vWgCz9Y"

    companion object{
        private val BASE_URL = "https://sheets.googleapis.com/v4/spreadsheets/"

        fun create(): DataService? {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(DataService::class.java)
        }
    }
}