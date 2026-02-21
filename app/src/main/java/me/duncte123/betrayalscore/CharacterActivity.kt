package me.duncte123.betrayalscore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.tooling.preview.Preview
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import me.duncte123.betrayalscore.game.Character
import me.duncte123.betrayalscore.game.characters
import me.duncte123.betrayalscore.ui.theme.BetrayalScoreTheme

class CharacterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val character = characters[intent.getIntExtra("charIdx", 0)]

        enableEdgeToEdge()
        setContent {
            BetrayalScoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CharacterDisplay(character, Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CharacterPolygonBackground(character: Character, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.rotate(-90f).background(Color.Green).drawWithCache {
            val blackPolygon = RoundedPolygon(
                numVertices = 5,
                radius = size.minDimension / 2.25f,
                centerX = size.width / 2,
                centerY = size.height / 2
            )


            val characterBorder = RoundedPolygon(
                numVertices = 5,
                radius = size.minDimension / 2,
                centerX = size.width / 2,
                centerY = size.height / 2
            )

            val blackPolygonCompose = blackPolygon.toPath().asComposePath()
            val characterBorderCompose = characterBorder.toPath().asComposePath()
            onDrawBehind {
                drawPath(characterBorderCompose, color = Color(character.color))
                drawPath(blackPolygonCompose, color = Color.Black)
            }
        }
            .fillMaxWidth()
            .fillMaxHeight(.5f)
    )
}

@Composable
fun CharacterDisplay(character: Character, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxHeight()) {
        Row {
            CharacterPolygonBackground(character)
        }

        Row (modifier = Modifier.fillMaxHeight()
            .fillMaxHeight()) {
            Box(
                modifier = Modifier.fillMaxHeight(.9f)
                    .fillMaxWidth()
                    .background(Color.Red)
            ) {
                Text(color = Color.White, text = character.name)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CharacterDisplayPreview() {
    BetrayalScoreTheme {
        CharacterDisplay(characters[0])
    }
}