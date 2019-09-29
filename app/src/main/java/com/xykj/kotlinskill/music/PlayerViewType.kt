package com.xykj.kotlinskill.music

sealed class PlayerViewType {

    object GREEN : PlayerViewType()
    object BLUE : PlayerViewType()
    class VIP(val title: String? = null, val message: String? = null) : PlayerViewType()
}

fun getPlayerView(type: PlayerViewType) = when(type){
    PlayerViewType.BLUE -> "jackie"
    PlayerViewType.GREEN -> "linjc"
    is PlayerViewType.VIP -> "ldjf"

}