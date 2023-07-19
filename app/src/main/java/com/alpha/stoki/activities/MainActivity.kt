package com.alpha.stoki.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.alpha.stoki.core.AppState
import com.alpha.stoki.core.rememberAppState
import com.alpha.stoki.navigation.StokiNavBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val appState: AppState = rememberAppState()
                    StokiNavBar(
                        destinations = appState.topLevelDestinations,
                        onNavigateToDestination = appState::navigateToTopLevelDestination,
                        currentDestination = appState.currentDestination,
                        modifier = Modifier
                    )
                }
        }
    }
}
