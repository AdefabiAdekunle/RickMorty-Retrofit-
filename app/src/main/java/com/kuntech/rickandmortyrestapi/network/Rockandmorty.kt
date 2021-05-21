package com.kuntech.rickandmortyrestapi.network


import com.google.gson.annotations.SerializedName

data class Rockandmorty(
    val info: Info,
    val results: List<Result>
)