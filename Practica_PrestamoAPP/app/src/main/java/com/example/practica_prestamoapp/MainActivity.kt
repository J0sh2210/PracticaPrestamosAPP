package com.example.practica_prestamoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_prestamoapp.View.Homeview
import com.example.practica_prestamoapp.ui.theme.Practica_PrestamoAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_PrestamoAPPTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Homeview()
                }
            }
        }
    }
}