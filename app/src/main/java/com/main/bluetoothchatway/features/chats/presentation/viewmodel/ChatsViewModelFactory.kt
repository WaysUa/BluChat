package com.main.bluetoothchatway.features.chats.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.main.bluetoothchatway.features.chats.domain.ChatsNavigation
import com.main.bluetoothchatway.core.base.BaseViewModelFactory

class ChatsViewModelFactory(
    private val chatsNavigation: ChatsNavigation
) : BaseViewModelFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChatsViewModel(
            chatsNavigation = chatsNavigation
        ) as T
    }
}