/*
 * GnuGoBot  Copyright (C) 2018  Andrei Iatsuk <hi@yatsukav.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.iatsuk.bot.gnugobot.db

import net.iatsuk.bot.gnugobot.core.Objects.{GameMoves, User}

trait Storage {

  def playing(user: User): Boolean

  def lastGame(user: User): GameMoves

  def persist(user: User, gameMoves: GameMoves, playing: Boolean): Unit
}
