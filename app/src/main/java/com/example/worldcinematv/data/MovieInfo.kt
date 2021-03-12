package com.example.worldcinematv.data

data class MovieInfo(
    val age: String,
    val description: String,
    val images: List<String>,
    val movieId: String,
    val name: String,
    val poster: String,
    val tags: List<String>
)