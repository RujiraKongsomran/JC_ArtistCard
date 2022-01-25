package com.rujirakongsomran.jc_artistcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rujirakongsomran.jc_artistcard.ui.theme.JC_ArtistCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_ArtistCardTheme {
                // A surface container using the 'background' color from the theme
                ArtistCard(onClick = {})
            }
        }
    }
}

@Composable
fun ArtistCard(
    onClick: () -> Unit
) {
    val padding = 16.dp
    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.artist),
                contentDescription = "User Image",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
            Spacer(modifier = Modifier.width(14.dp))
            Column {
                Text(
                    text = "David Mark",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "3 minutes ago",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
        }
        Spacer(modifier = Modifier.size(padding))
        Card(elevation = 4.dp) {
            Image(
                painter = painterResource(id = R.drawable.painting),
                contentDescription = "Content Image",
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun ArtistCardPreview() {
    JC_ArtistCardTheme {
        ArtistCard(onClick = {})
    }
}
