package com.example.myapplicationtest2.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplicationtest2.data.network.model.PokedexObject
import com.example.myapplicationtest2.domain.PokemonListRequirement
import com.example.myapplicationtest2.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokedexViewModel: ViewModel() {
    val pokedexObjectLiveData = MutableLiveData<PokedexObject>()
    private val pokemonListRequirement = PokemonListRequirement()

    fun getPokemonList(){
        viewModelScope.launch(Dispatchers.IO) {
            val result: PokedexObject? = pokemonListRequirement(Constants.MAX_POKEMON_NUMBER)
            Log.d("Salida", result?.count.toString())
            CoroutineScope(Dispatchers.Main).launch {
                pokedexObjectLiveData.postValue(result!!)
            }
        }    }
}