package com.example.myapplicationtest2.data

import com.example.myapplicationtest2.data.network.PokemonAPIClient
import com.example.myapplicationtest2.data.network.model.PokedexObject
import com.example.myapplicationtest2.data.network.model.pokemon.Pokemon

class PokemonRepository() {
    private val apiPokemon = PokemonAPIClient.PokemonApiClient()
    suspend fun getPokemonList(limit:Int): PokedexObject? = apiPokemon.getPokemonList(limit)
    suspend fun getPokemonInfo(numberPokemon:Int): Pokemon?  = apiPokemon.getPokemonInfo(numberPokemon)
}