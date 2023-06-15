package com.main.bluchat.main.sl

import androidx.lifecycle.ViewModel
import com.main.bluchat.core.sl.Core
import com.main.bluchat.core.sl.Module
import com.main.bluchat.features.chats.presentation.viewmodel.ChatsViewModel
import com.main.bluchat.features.chats.sl.ChatsModule
import com.main.bluchat.main.presentation.MainViewModel

interface DependencyContainer {

    fun <T : ViewModel> module(clazz: Class<T>): Module<*>

    class Error : DependencyContainer {
        override fun <T : ViewModel> module(clazz: Class<T>): Module<*> {
            throw IllegalStateException("no module found for $clazz")
        }
    }

    class Base(
        private val core: Core,
        private val dependencyContainer: DependencyContainer = Error()
    ) : DependencyContainer {

        override fun <T : ViewModel> module(clazz: Class<T>): Module<*> = when (clazz) {
            MainViewModel::class.java -> MainModule(core)
            ChatsViewModel::class.java -> ChatsModule(core)
            else -> dependencyContainer.module(clazz)
        }
    }
}
