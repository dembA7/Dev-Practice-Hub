package com.example.myapplicationtest2.domain

import com.example.myapplicationtest2.data.PokemonRepository
import com.example.myapplicationtest2.data.network.model.PokedexObject

class PokemonListRequirement {
    private val repository = PokemonRepository()

    suspend operator fun invoke(
        limit: Int
    ): PokedexObject? = repository.getPokemonList(limit)
}