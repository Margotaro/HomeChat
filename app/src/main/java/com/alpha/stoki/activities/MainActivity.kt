package com.alpha.stoki.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.alpha.stoki.core.state.NavigationState
import com.alpha.stoki.core.state.rememberNavState
import com.alpha.stoki.navigation.StokiNavBar
import com.alpha.stoki.navigation.StokiNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    val navState: NavigationState = rememberNavState()
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            StokiNavHost(navState = navState)
                        }
                        StokiNavBar(
                            destinations = navState.topLevelDestinations,
                            onNavigateToDestination = navState::navigateToTopLevelDestination,
                            currentDestination = navState.currentDestination,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                        )
                    }
                }
        }
    }
}
