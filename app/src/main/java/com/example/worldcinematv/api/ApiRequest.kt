package com.mrz.worldcinema.api

import com.example.worldcinematv.data.EpisodesList
import com.example.worldcinematv.data.MovieInfo
import com.example.worldcinematv.data.MoviesListItem
import com.example.worldcinematv.data.User
import com.mrz.apikotlin.api.Token
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.*

interface ApiRequest {
    @Headers("Authorization: Bearer ktoya")
    @POST("auth/register")
    @FormUrlEncoded
    suspend fun signup(@Field("email") email: String,
                       @Field("password") password: String,
                       @Field("firstName") firstName: String,
                       @Field("lastName") lastName: String):Response<String>

    @POST("auth/login")
    @FormUrlEncoded
    suspend fun signin(@Field("email") email: String, @Field("password") password: String):Response<Token>

    @Headers("Authorization: Bearer 1052827")
    @GET("/user")
    fun getUser(): Observable<User>

    @GET("movies")
    fun getMovies(
        @Query("filter") filter: String): Observable<List<MoviesListItem>>

    @GET("movies/1/episodes")
    fun getEpisodes(): Observable<List<EpisodesList>>

    @GET("movies/{movieId}")
    fun getFilm(
        @Path("movieId") movieId: String): Observable<MovieInfo>
}