package com.pmdm.peliculas_con_fragmento

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pmdm.pelculas_con_fragmento.R

/**
 * A simple [Fragment] subclass.
 * Use the [MoviesListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MoviesListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var moviesAdapter: MoviesAdapter
    private var moviesList = mutableListOf<Movie>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.moviesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

            // Inicializar lista de películas
        moviesList = mutableListOf(
            // ejemplos de películas
        )

        moviesAdapter = MoviesAdapter(moviesList, { position ->
            moviesList.removeAt(position)
        })
        recyclerView.adapter = moviesAdapter
    }
}
