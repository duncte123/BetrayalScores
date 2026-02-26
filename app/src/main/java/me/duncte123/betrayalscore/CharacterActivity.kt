package me.duncte123.betrayalscore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import me.duncte123.betrayalscore.game.Character
import me.duncte123.betrayalscore.game.Statistic
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
fun CharacterPolygonBackground(character: Character, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(Color.Green.copy(alpha = 0.5f)).drawWithCache {
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
                rotate(-90f) {
                    drawPath(characterBorderCompose, color = Color(character.color))
                    drawPath(blackPolygonCompose, color = Color.Black)
                }
            }
        }
            .fillMaxWidth()
            .fillMaxHeight(.5f),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = character.name,
                color = Color.White,
            )
            Text(
                text = "Age: ${character.age}  Birthday: ${character.birthday}",
                color = Color.White,
            )
            Text(
                text = "Hobbies: ${character.hobbies}",
                color = Color.White,
            )
            Text(
                text = "${character.extraHeading}: ${character.extraContent}",
                color = Color.White,
            )
        }
    }
}

@Composable
fun StatisticSlider(stat: Statistic) {
    var sliderPosition by remember { mutableIntStateOf(stat.defaultScoreIndex) }

    val points = stat.scoreMap.map { if (it == 0) "☠\uFE0F" else it.toString() }

    Text(text = "${stat.type}: $sliderPosition")

    Box(
        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
    ) {
        Column(
            modifier = Modifier,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                for ((idx, point) in points.withIndex()) {
                    Text(
                        modifier = Modifier.padding(0.dp).width(20.dp),
                        text = point,
                        textAlign = TextAlign.Center,
                        color = if (idx == 1) Color.Red else if (idx == stat.defaultScoreIndex) Color.Green else Color.Black
                    )
                }
            }

            Slider(
                value = sliderPosition.toFloat(),
                onValueChange = { sliderPosition = it.toInt() },
                steps = 7,
                valueRange = 0f..8.5f,
            )
        }
    }
}

@Composable
fun CharacterDisplay(character: Character, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxHeight()) {
        Row {
            CharacterPolygonBackground(character)
        }

        Row (modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Box(
                modifier = Modifier.fillMaxHeight().fillMaxWidth()
            ) {
                Column {
                    // this is a fucking nasty hack lmao, but at least it seems to consistently give me whole values
                    for (stat in character.statistics) {
//                        Text(color = Color.Black, text = "${stat.type.name} -> default: ${stat.scoreMap[stat.defaultScoreIndex]}")
                        StatisticSlider(stat)
                    }
                }
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