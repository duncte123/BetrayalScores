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

package me.duncte123.betrayalscore.game

val characters = listOf(
    Character(
        0xF1B20F,
        "Anita Hernandez",
        12,
        "June 11",
        "taxidermy, painting",
        "Animal friends",
        "17",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 2, 3, 4, 4, 5, 6, 7, 8),
                3
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 2, 2, 3, 4, 4, 5, 6, 7),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 4, 4, 5, 5, 6, 7, 8, 8),
                4
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 2, 2, 3, 4, 5, 5, 6, 6),
                3
            ),
        ),
    ),
    Character(
        0xC54A79,
        """Brittani "Beat Box" Bowen""",
        22,
        "December 1",
        "dancing, gardening",
        "Current favourite genre",
        "dungeon synth",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 2, 3, 3, 4, 4, 5, 6, 6),
                3
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 3, 3, 4, 5, 6, 7, 7, 8),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 3, 3, 4, 5, 5, 6, 6, 7),
                3
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 3, 3, 4, 4, 5, 6, 6, 7),
                4
            ),
        ),
    ),
    Character(
        0xFFFFFF,
        "Dan Nguyen, M.D.",
        60,
        "May 6",
        "documentaries, fishing",
        "Blood type",
        "A-",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 2, 3, 3, 4, 5, 6, 7, 7),
                3
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 3, 3, 4, 4, 5, 5, 6, 7),
                3
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 3, 3, 4, 5, 5, 6, 7, 8),
                5
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 2, 3, 4, 4, 5, 6, 7, 8),
                4
            ),
        ),
    ),
    Character(
        0xFFFFFF,
        "Father Warren Leung",
        71,
        "November 17",
        "watercolors, comic books",
        "Boxes of comics in his basement",
        "13",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 2, 3, 4, 4, 5, 5, 6, 6),
                3
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 2, 2, 3, 3, 4, 5, 6, 6),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 3, 3, 4, 5, 5, 6, 7, 8),
                3
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 3, 3, 3, 4, 5, 6, 7, 8),
                5
            ),
        ),
    ),
    Character(
        0xF1B20F,
        "Isa Valencia",
        11,
        "March 30",
        "depressing music, blogging",
        "Poe collections owned",
        "8",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 4, 4, 5, 5, 6, 7, 8, 8),
                4
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 2, 3, 3, 3, 4, 5, 6, 7),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 2, 3, 4, 4, 5, 6, 6, 6),
                3
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 2, 3, 4, 5, 6, 7, 7, 8),
                3
            ),
        ),
    ),
    Character(
        0xD2B349,
        "Jaden Jones",
        11,
        "October 4",
        "mysteries, reading",
        "Cases solved",
        "0",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 3, 4, 4, 4, 5, 6, 7, 8),
                3
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 2, 3, 3, 3, 4, 5, 6, 7),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 3, 3, 4, 5, 5, 6, 6, 7),
                4
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 3, 3, 4, 5, 5, 6, 7, 8),
                3
            ),
        ),
    ),
    Character(
        0xC7433F,
        """Josef "Brosef" Hooper""",
        25,
        "February 25",
        "poetry, soccer", // Yeah, I wanna see how many people complain about this LMAO
        "GPA",
        "2.5",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 2, 2, 3, 4, 5, 6, 7, 8),
                4
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 4, 4, 4, 5, 6, 7, 8, 8),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 2, 2, 3, 3, 5, 5, 6, 6),
                3
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 2, 3, 4, 4, 5, 5, 6, 6),
                3
            ),
        ),
    ),
    Character(
        0x0,
        "",
        12,
        "",
        "",
        "",
        "",
        listOf(
            Statistic(
                StatType.SPEED,
                listOf(0, 2, 3, 4, 4, 5, 6, 7, 8),
                3
            ),
            Statistic(
                StatType.MIGHT,
                listOf(0, 2, 2, 3, 4, 4, 5, 6, 7),
                4
            ),
            Statistic(
                StatType.KNOWLEDGE,
                listOf(0, 4, 4, 5, 5, 6, 7, 8, 8),
                4
            ),
            Statistic(
                StatType.SANITY,
                listOf(0, 2, 2, 3, 4, 5, 5, 6, 6),
                3
            ),
        ),
    ),
)