package com.example.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeplayground.ui.theme.JetpackComposePlaygroundTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    NewsStory()
                }
            }
        }
    }
}

@Composable
fun NewsStory() {
    val image = imageResource(R.drawable.header)
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(
                modifier = Modifier.padding(16.dp)
        ) {
            val imageModifier = Modifier
                    .fillMaxWidth()
                    .preferredHeight(180.dp)
                    .clip(RoundedCornerShape(4.dp))
            Image(modifier = imageModifier, bitmap = image, contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "A day wandering through the sandhills" +
                    "in shark fin cove and a few of the sights" +
                    "I saw", style = typography.h6,maxLines = 2,overflow = TextOverflow.Ellipsis)
            Text("Davenport, California")
            Text("December 2021")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposePlaygroundTheme {
        NewsStory()
    }
}