package com.example.artigocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artigocompose.ui.theme.ArtigoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtigoComposeTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                   /* ShowPage(
                        title = stringResource(R.string.title),
                        paragraph1 = stringResource(R.string.paragraph_1),
                        paragraph2 = stringResource(R.string.paragraph_2)
                    )*/

                    /*ShowMainPageQuestion2(
                        text1 = stringResource(R.string.all_tasks_completed),
                        text2 = stringResource(R.string.nice_work)
                    )*/
                    //QuatroQuadrantes()
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun ShowPage(title: String, paragraph1: String, paragraph2 : String, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
        ShowTitle(
            title = title,
            modifier = modifier
        )
        ShowArticleText(
            text = paragraph1 ,
            modifier = modifier
        )
        ShowArticleText(
            text = paragraph2 ,
            modifier = modifier
        )
    }
}

@Composable
fun ShowFirstElementFromQuestion2(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ShowMainPageQuestion2(text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null,
        )

        ShowFirstElementFromQuestion2(text = text1, modifier = modifier)

        ShowSecondElementFromQuestion2(text = text2, modifier = modifier)
    }
}

@Composable
fun ShowSecondElementFromQuestion2(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = 16.sp
    )
}

@Composable
fun ShowTitle(title: String, modifier: Modifier) {
    Text(
        text = title,
        modifier = modifier.padding(16.dp),
        fontSize = 24.sp
    )
}

@Composable
fun ShowArticleText(text: String, modifier: Modifier) {
    Text(
        text = text,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}
@Composable
fun Quadrante(title: String, description: String,backgroundColor: Color, modifier: Modifier = Modifier) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(16.dp)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp, top = 20.dp),
            )

            Text(
                text = description,
                textAlign = TextAlign.Justify,
                modifier = modifier.padding(top = 10.dp)
            )
        }
    }


@Composable
fun QuatroQuadrantes() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)){
            Quadrante(
                title = stringResource(R.string.title_quadrant1),
                description = stringResource(R.string.text_quadrant1),
                backgroundColor = Color(0xFFEADDFF.toInt()),
                modifier = Modifier
                    .weight(1f)
            )

            Quadrante(
                title = stringResource(R.string.title_quadrant2),
                description = stringResource(R.string.text_quadrant2),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier
                    .weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)){
            Quadrante(
                title = stringResource(R.string.tilte_quadrant3),
                description = stringResource(R.string.text_quadrant3),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier
                    .weight(1f)
            )

            Quadrante(
                title = stringResource(R.string.title_quadrant4),
                description = stringResource(R.string.text_quadrant4),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}
