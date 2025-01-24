package com.atef.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.atef.navigation.AuthNavigation
import com.atef.navigation.CheckoutNavigation
import com.atef.ui_common.ModularizationNavigationCaseStudyTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModularizationNavigationCaseStudyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(Modifier.padding(innerPadding)) {
                        Greeting(
                            name = "Home",
                        )
                        Button(onClick = {
                            CheckoutNavigation.getInstance().openCheckout(this@HomeActivity, "cartId")
                        }) {
                            Text("Open Checkout")
                        }
                        Button(onClick = {
                            AuthNavigation.getInstance().openAuth(this@HomeActivity)
                        }) {
                            Text("Open Auth")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ModularizationNavigationCaseStudyTheme {
        Greeting("Android")
    }
}
