package com.example.movieann

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieann.models.MovieItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movie_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)




        //связываем RecyclerView с адаптером
        rv_movies_list.layoutManager = LinearLayoutManager(this)
        rv_movies_list.setHasFixedSize(true)

        val movies = getMovieData()

        rv_movies_list.adapter = MovieAdapter(movies)



    }

    private fun getMovieData(): MutableList<MovieItem> {
    val list = mutableListOf<MovieItem>()
        list.add (MovieItem("Harry Potter", "12/06/2010"))
        return list

    }


}




