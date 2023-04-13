package com.main.chats.presentation.viewmodel

import androidx.navigation.NavController
import com.main.chats.domain.ChatsNavigation
import com.main.core.base.BaseViewModel

class ChatsViewModel(
    private val chatsNavigation: ChatsNavigation
) : BaseViewModel() {

    fun navigateToConnectDevicesFragment(navController: NavController) {
        chatsNavigation.navigateToConnectDevicesFragment(navController)
    }
}