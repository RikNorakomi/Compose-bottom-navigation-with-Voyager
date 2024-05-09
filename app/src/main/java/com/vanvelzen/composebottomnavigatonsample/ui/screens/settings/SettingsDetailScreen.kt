package com.vanvelzen.composebottomnavigatonsample.ui.screens.settings

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

class SettingsDetailScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        SettingsDetail(onNavigateBack = {
            navigator?.pop()
        })
    }
}



