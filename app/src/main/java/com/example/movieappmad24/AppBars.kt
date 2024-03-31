package com.example.movieappmad24

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.movieappmad24.navigation.Screen

class AppBars {
    @Composable
    fun SimpleBottomAppBar(navController: NavController) {
        NavigationBar {
            NavigationBarItem(
                label = { Text("Home") },
                selected = true,
                onClick = {navController.navigate(route = Screen.Home.route) },
                icon = {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "to Home"
                    )
                }
            )
            NavigationBarItem(
                label = { Text("Watchlist") },
                selected = false,
                onClick = { navController.navigate(route = Screen.Watchlist.route) },
                icon = {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "to Watchlist"
                    )
                }
            )
        }
    }
}