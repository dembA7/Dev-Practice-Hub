package com.example.myapplicationtest2.data.network.model

import com.example.myapplicationtest2.data.network.model.PokemonBase
import com.google.gson.annotations.SerializedName

data class PokedexObject(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<PokemonBase>,
)