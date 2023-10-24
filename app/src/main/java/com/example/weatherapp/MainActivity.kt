package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.ui.theme.WeatherAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MenuPrincipal()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPrincipal(): Unit {
    Column() {
        NavegacaoPesquisaComponente()
        MensagemBemVindoComponente()
        ImagemPreviewComponente()
        PrevisaoDias()
    }

}

@Preview(showBackground = true, widthDp = 380)
@Composable
fun NavegacaoPesquisaComponente(): Unit {
    Row() {
        modifier = Modifier.fillMaxWidth.padding(15,dp)
        horizontalArrangement
        Text(text = "Header");
        Text(text = "Header");
    }

}

@Preview(showBackground = true, widthDp = 380)
@Composable
fun MensagemBemVindoComponente(): Unit {
    Text(text = "Bem-Vindo");
}

@Preview(showBackground = true, widthDp = 380)
@Composable
fun ImagemPreviewComponente(): Unit {
    Text(text = "Imagem");
}

@Preview(showBackground = true, widthDp = 380)
@Composable
fun PrevisaoDias(): Unit {
    Text(text = "Previsão");

}