package com.kuntech.rickandmortyrestapi

import com.kuntech.rickandmortyrestapi.network.RockAndMortyApi

class RockAndMortyRepository (){
    suspend fun getRickAndMortyInfo()= RockAndMortyApi.retrofitService.getRickAndMortyApi()
}