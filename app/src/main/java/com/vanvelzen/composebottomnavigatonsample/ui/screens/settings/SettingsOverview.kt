package com.vanvelzen.composebottomnavigatonsample.ui.screens.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun SettingsOverview(
    onNavigate: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Settings Overview screen")
        Button(
            onClick = onNavigate
        ) {
            Text(text = "Go to Settings Detail")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SettingsOverviewPreview() {
    SettingsOverview(onNavigate = {})
}