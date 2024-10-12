package com.nmp.projectnmp

import kotlin.properties.Delegates

object WhatWePlayData {

    var games: Array<Games> = arrayOf(
        Games("Valorant",
            "Valorant is a free-to-play first-person tactical hero shooter developed and published by Riot Games. The game's development started in 2014 and was teased under the codename Project A in October 2019. A closed beta period began with limited access on April 7, 2020, followed by a release on June 2, 2020.", R.drawable.valorant_game),
        Games("Mobile Legends", "Mobile Legends: Bang Bang is a mobile multiplayer online battle arena game developed and published by Chinese developer Moonton, a subsidiary of ByteDance. The game was released in 2016 and grew in popularity, most prominently in Southeast Asia.",
            R.drawable.mobile_legends_game),
        Games("Fortnite", "Fortnite is a third person shooter survival game where the player has to survive against up to 100 other players. The total player count for each battle royale is 100. The player can build forts through collecting materials such as metal, bricks, wood, and collect weapons before fighting other players.", R.drawable.fortnite_game)
    )
}