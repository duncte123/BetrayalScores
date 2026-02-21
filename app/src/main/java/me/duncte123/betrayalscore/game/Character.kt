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

data class Character(
    val color: Long,
    val name: String,
    val age: Int,
    val birthday: String, // hehe fuck everything, this makes sense
    val hobbies: String,
    val extraHeading: String,
    val extraContent: String,
    val statistics: List<Statistic>,
)
