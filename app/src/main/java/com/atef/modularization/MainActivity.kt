package com.atef.modularization

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.atef.navigation.AuthNavigation
import com.atef.navigation.CheckoutNavigation
import com.atef.navigation.HomeNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        initNavigation()
        AuthNavigation.getInstance().openAuth(this)
    }

    private fun initNavigation() {
        val authNavigation = AuthNavigationImpl()
        val homeNavigation = HomeNavigationImpl()
        val checkoutNavigation = CheckoutNavigationImpl()
        AuthNavigation.setInstance(authNavigation)
        HomeNavigation.setInstance(homeNavigation)
        CheckoutNavigation.setInstance(checkoutNavigation)
    }
}
