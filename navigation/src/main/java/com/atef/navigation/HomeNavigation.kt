package com.atef.navigation

import android.content.Context

interface HomeNavigation {
    fun openHome(context: Context)

    companion object {
        // try to implement a better lazy initialization using which DI platform or mechanism, this is just an example.
        private var instance: HomeNavigation? = null

        fun getInstance(): HomeNavigation = instance ?: throw Exception("HomeNavigation is not initialized")

        fun setInstance(homeNavigation: HomeNavigation) {
            instance = homeNavigation
        }
    }
}
