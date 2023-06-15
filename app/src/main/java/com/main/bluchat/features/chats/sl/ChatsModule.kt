package com.main.bluchat.features.chats.sl

import com.main.bluchat.core.sl.Core
import com.main.bluchat.features.chats.presentation.viewmodel.ChatsViewModel
import com.main.bluchat.core.sl.Module

class ChatsModule(core: Core): Module<ChatsViewModel> {
    override fun viewModel(): ChatsViewModel {
        return ChatsViewModel()
    }
}