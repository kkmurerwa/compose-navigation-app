package com.murerwa.composenavigation.ui.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
        fun passArgument(id: Int): String {
            return this.route.replace("{$DETAIL_ARGUMENT_KEY}", id.toString())
        }

        fun passNameAndId(
            id: Int,
            name: String
        ): String {
            return this.route.replace("{$DETAIL_ARGUMENT_KEY}", "1")
                    .replace("{$DETAIL_ARGUMENT_KEY2}", "test")
        }

    }
}