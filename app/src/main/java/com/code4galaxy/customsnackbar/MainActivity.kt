package com.code4galaxy.customsnackbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.code4galaxy.customsnackbar.ui.theme.CustomSnackBarTheme
import com.code4galaxy.snackbar.ShowSnackBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomSnackBarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowSnackBar(name = "Android", modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
