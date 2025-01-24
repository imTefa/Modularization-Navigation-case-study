package com.atef.modularization

import android.content.Context
import android.content.Intent
import com.atef.home.HomeActivity
import com.atef.navigation.HomeNavigation

internal class HomeNavigationImpl : HomeNavigation {
    override fun openHome(context: Context) {
        context.startActivity(Intent(context, HomeActivity::class.java))
    }
}
