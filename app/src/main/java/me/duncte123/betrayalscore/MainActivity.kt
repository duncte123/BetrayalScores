/*
 *     Betrayal scores on your phone
 *     Copyright (C) 2026  duncte123
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.duncte123.betrayalscore

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.duncte123.betrayalscore.game.characters
import me.duncte123.betrayalscore.ui.theme.BetrayalScoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BetrayalScoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize().padding(5.dp)) { innerPadding ->
                    CharacterList(this, Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CharacterList(context: Context, modifier: Modifier = Modifier) {
    Column( modifier = modifier ) {
        for ((idx,  character) in characters.withIndex()) {
            Button(
                onClick = {
                    val intent = Intent(context, CharacterActivity::class.java)

                    intent.putExtra("charIdx", idx)

                    context.startActivity(intent)
                }
            ) {
                Text(character.name)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BetrayalScoreTheme {
        Column {
            CharacterList(LocalContext.current)
        }
    }
}