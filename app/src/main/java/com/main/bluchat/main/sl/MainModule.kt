package com.main.bluchat.main.sl

import com.main.bluchat.core.sl.Core
import com.main.bluchat.core.sl.Module
import com.main.bluchat.main.presentation.viewmodel.MainViewModel

class MainModule(private val core: Core) : Module<MainViewModel> {

    override fun viewModel() = MainViewModel(
        navigationCommunication = core.provideNavigation()
    )
}