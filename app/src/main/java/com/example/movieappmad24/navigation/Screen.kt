package com.example.movieappmad24.navigation

sealed class Screen (val route: String) {
    data object Home: Screen(route = "homeScreen")
    data object Details: Screen(route = "detailScreen/{movieId}")
    data object Watchlist: Screen(route = "watchlistScreen")
}