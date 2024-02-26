package com.pmdm.lista_de_pelculas
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MoviesAdapter (
    private val moviesList: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.movieTitle)
        val year: TextView = view.findViewById(R.id.movieYear)
        val description: TextView = view.findViewById(R.id.movieDescription)
        val image: ImageView = view.findViewById(R.id.movieImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.title.text = movie.title
        holder.year.text = movie.year.toString()
        holder.description.text = movie.description
        Glide.with(holder.image.context).load(movie.imageUrl).into(holder.image)
    }

    override fun getItemCount() = moviesList.size
}