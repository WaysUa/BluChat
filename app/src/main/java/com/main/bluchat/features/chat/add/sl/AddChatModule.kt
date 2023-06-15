package com.main.bluchat.features.chat.add.sl

import com.main.bluchat.core.sl.Core
import com.main.bluchat.core.sl.Module
import com.main.bluchat.features.chat.add.presentation.viewmodel.AddChatViewModel

class AddChatModule(private val core: Core) : Module<AddChatViewModel> {
    override fun viewModel(): AddChatViewModel {
        return AddChatViewModel(
            navigationCommunication = core.provideNavigation()
        )
    }
}