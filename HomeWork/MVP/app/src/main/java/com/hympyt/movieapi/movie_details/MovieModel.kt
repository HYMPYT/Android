package com.hympyt.movieapi.movie_details

import com.hympyt.movieapi.model.Movie
import com.hympyt.movieapi.network.ApiClient
import com.hympyt.movieapi.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieModel : DetailsContract.Model {
    override fun getMovieDetails(
        onFinishedListener: DetailsContract.Model.OnFinishedListener,
        id: Int
    ) {
        val apiService = ApiClient.buildService(ApiService::class.java)
        val call = apiService.getMovieInfo(id)
        call.enqueue(object : Callback<Movie> {
            override fun onFailure(call: Call<Movie>, t: Throwable) {
                onFinishedListener.onFailure(t)
            }

            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                onFinishedListener.onSuccess(response.body()!!)
            }
        })
    }
}

