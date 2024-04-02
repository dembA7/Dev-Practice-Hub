package com.example.myapplicationtest2.data.network.model.pokemon

data class Sprites(
    val back_default: String,
    val back_female: Any,
    val back_shiny: String,
    val back_shiny_female: Any,
    val front_default: String,
    val front_female: Any,
    val front_shiny: String,
    val front_shiny_female: Any,
    val other: com.example.myapplicationtest2.data.network.model.pokemon.Other,
    val versions: com.example.myapplicationtest2.data.network.model.pokemon.Versions
)