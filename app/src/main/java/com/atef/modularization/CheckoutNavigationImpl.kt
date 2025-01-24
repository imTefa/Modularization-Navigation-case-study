package com.atef.modularization

import android.content.Context
import android.content.Intent
import com.atef.checkout.CheckoutActivity
import com.atef.navigation.CheckoutNavigation

internal class CheckoutNavigationImpl : CheckoutNavigation {
    override fun openCheckout(
        context: Context,
        cartId: String,
    ) {
        context.startActivity(
            Intent(context, CheckoutActivity::class.java).apply {
                putExtra("cartId", cartId)
            },
        )
    }
}
