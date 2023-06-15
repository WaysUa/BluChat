package com.main.bluetoothchatway.features.chats.domain

import androidx.navigation.NavController
import com.main.bluetoothchatway.core.navigation.DeepLinks

interface ChatsNavigation {

    fun navigateToConnectDevicesFragment(navController: NavController)

    class Base : ChatsNavigation {

        override fun navigateToConnectDevicesFragment(navController: NavController) {
            navController.navigate(DeepLinks.CONNECT_DEVICES_DEEP_LINK)
        }
    }
}