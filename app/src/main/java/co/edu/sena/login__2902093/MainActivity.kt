package co.edu.sena.login__2902093


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import co.edu.sena.login__2902093.app.PostOfficeApp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostOfficeApp()
        }
    }
}