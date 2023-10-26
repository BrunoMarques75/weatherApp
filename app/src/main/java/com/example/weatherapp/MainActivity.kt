package com.example.weatherapp

import android.graphics.Rect
import android.os.Bundle
import android.util.LayoutDirection
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
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

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
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
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.White
            )
        )
            {
                val rainbowColorsBrush = remember {
                    Brush.sweepGradient(
                        listOf(
                            Color(0xFF9575CD),
                            Color(0xFFBA68C8),
                            Color(0xFFE57373),
                            Color(0xFFFFB74D),
                            Color(0xFFFFF176),
                            Color(0xFFAED581),
                            Color(0xFF4DD0E1),
                            Color(0xFF9575CD)
                        )
                    )
                }
                val borderWidth = 4.dp
                Image(
                    painter = painterResource(id = R.drawable.cr7),
                    contentDescription = stringResource(id = R.string.lupa_content_description),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                        )
                )
            }
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