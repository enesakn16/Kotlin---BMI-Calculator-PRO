package com.enesakin.vkhesaplama

sealed class Screens(val screen: String) {
    data object Home : Screens("home")
    data object Past : Screens("past")
    data object DiyetListeleri : Screens("diyetlisteleri")
    data object RegisteredProfilContent : Screens("registeredprofilcontent")
    data object Photo : Screens("photo")
    data object Login : Screens("login")
    data object Register : Screens("register")
    data object ProfileLoginTrue : Screens("profilelogintrue")
    data object Fitness : Screens("fitness")
    data object KiloAlma : Screens("kiloalma")
    data object KiloVerme : Screens("kiloverme")
    data object Gut : Screens("gut")
    data object AnneveBebek : Screens("annevebebek")
    data object Meta : Screens("Meta")
    data object Kardiyo : Screens("kardiyo")
    data object Splash: Screens ("splash")
}