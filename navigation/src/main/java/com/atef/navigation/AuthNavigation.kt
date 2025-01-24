package com.atef.navigation

import android.content.Context

interface AuthNavigation {
    fun openAuth(context: Context)

    companion object {
        private var instance: AuthNavigation? = null

        fun getInstance(): AuthNavigation = instance ?: throw Exception("AuthNavigation is not initialized")

        fun setInstance(authNavigation: AuthNavigation) {
            instance = authNavigation
        }
    }
}
