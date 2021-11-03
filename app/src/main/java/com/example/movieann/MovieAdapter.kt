package com.example.movieann

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieann.models.MovieItem
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(
        private val movies : List<MovieItem>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

        class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view){
                private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
                fun bindMovie(movie : MovieItem){
                        itemView.movie_title.text = movie.title
                        itemView.movie_release_date.text = movie.release
                        //Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.movie_poster)
                }
        }

        //создаем новый объект ViewHolder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
                return MovieViewHolder(
                        LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
                )
        }

        //возвращаем размер листа
        override fun getItemCount(): Int = movies.size

        //отображаем данные
        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
                holder.bindMovie(movies.get(position))
        }
}