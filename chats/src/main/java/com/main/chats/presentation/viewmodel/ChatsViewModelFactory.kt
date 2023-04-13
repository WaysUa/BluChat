package com.main.chats.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.main.chats.domain.ChatsNavigation
import com.main.core.base.BaseViewModelFactory

class ChatsViewModelFactory(
    private val chatsNavigation: ChatsNavigation
) : BaseViewModelFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChatsViewModel(
            chatsNavigation = chatsNavigation
        ) as T
    }
}