package com.atef.modularization

import android.content.Context
import android.content.Intent
import com.atef.auth.AuthActivity
import com.atef.navigation.AuthNavigation

class AuthNavigationImpl : AuthNavigation {
    override fun openAuth(context: Context) {
        val intent = Intent(context, AuthActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        context.startActivity(intent)
    }
}
