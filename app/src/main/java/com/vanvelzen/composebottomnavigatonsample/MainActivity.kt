package com.vanvelzen.composebottomnavigatonsample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.vanvelzen.composebottomnavigatonsample.ui.tabs.HomeTab
import com.vanvelzen.composebottomnavigatonsample.ui.tabs.SettingsTab
import com.vanvelzen.composebottomnavigatonsample.ui.tabs.TabNavigationItem
import com.vanvelzen.composebottomnavigatonsample.ui.theme.ComposeBottomNavigatonSampleTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBottomNavigatonSampleTheme {
                TabNavigator(HomeTab) {
                    Scaffold(
                        content = {
                            CurrentTab()
                        },
                        bottomBar = {
                            BottomNavigation {
                                TabNavigationItem(HomeTab)
                                TabNavigationItem(SettingsTab)
                            }
                        }
                    )
                }
            }
        }
    }
}