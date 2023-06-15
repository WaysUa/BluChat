package com.main.bluetoothchatway.features.chats.presentation.viewmodel

import androidx.navigation.NavController
import com.main.bluetoothchatway.features.chats.domain.ChatsNavigation
import com.main.bluetoothchatway.core.base.BaseViewModel

class ChatsViewModel(
    private val chatsNavigation: ChatsNavigation
) : BaseViewModel() {

    fun navigateToConnectDevicesFragment(navController: NavController) {
        chatsNavigation.navigateToConnectDevicesFragment(navController)
    }
}