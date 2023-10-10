package com.example.myapplicationtest2.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: com.example.myapplicationtest2.data.network.model.pokemon.Emerald,
    @SerializedName("firered-leafgreen") val fireredLeafgreen: com.example.myapplicationtest2.data.network.model.pokemon.FireredLeafgreen,
    @SerializedName("ruby-sapphire") val rubySapphire: com.example.myapplicationtest2.data.network.model.pokemon.RubySapphire
)