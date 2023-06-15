package com.main.bluchat.features.chats.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.main.bluchat.main.data.Screen
import com.main.bluchat.main.presentation.communication.NavigationCommunication
import com.main.bluchat.main.presentation.core.NavigationStrategy

class ChatsViewModel(
    private val navigationCommunication: NavigationCommunication.Mutable
) : ViewModel() {

    fun navigateToAddChatFragment() {
        navigationCommunication.map(NavigationStrategy.Add(Screen.AddChat))
    }
}