package com.atef.navigation

import android.content.Context

interface CheckoutNavigation {
    fun openCheckout(
        context: Context,
        cartId: String,
    )

    companion object {
        private var instance: CheckoutNavigation? = null

        fun getInstance(): CheckoutNavigation = instance ?: throw Exception("AuthNavigation is not initialized")

        fun setInstance(checkoutNavigation: CheckoutNavigation) {
            instance = checkoutNavigation
        }
    }
}
