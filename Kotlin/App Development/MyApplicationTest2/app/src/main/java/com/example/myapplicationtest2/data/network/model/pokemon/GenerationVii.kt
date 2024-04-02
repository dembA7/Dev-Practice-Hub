package com.example.myapplicationtest2.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: com.example.myapplicationtest2.data.network.model.pokemon.Icons,
    @SerializedName("ultra-sun-ultra-moon") val ultraSunUltraMoon: com.example.myapplicationtest2.data.network.model.pokemon.UltraSunUltraMoon
)