package com.main.bluchat.features.chats.sl

import com.main.bluchat.core.sl.Core
import com.main.bluchat.core.sl.Module
import com.main.bluchat.features.chats.presentation.viewmodel.ChatsViewModel

class ChatsModule(private val core: Core): Module<ChatsViewModel> {
    override fun viewModel(): ChatsViewModel {
        return ChatsViewModel(
            navigationCommunication = core.provideNavigation()
        )
    }
}