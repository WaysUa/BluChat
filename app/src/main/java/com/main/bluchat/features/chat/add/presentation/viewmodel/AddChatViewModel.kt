package com.main.bluchat.features.chat.add.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.main.bluchat.main.presentation.communication.NavigationCommunication
import com.main.bluchat.main.presentation.core.NavigationStrategy

class AddChatViewModel(
    private val navigationCommunication: NavigationCommunication.Mutable
) : ViewModel() {

    fun navigateToChatsFragment() {
        navigationCommunication.map(NavigationStrategy.Back())
    }
}