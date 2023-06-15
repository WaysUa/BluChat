package com.main.bluchat.main.sl

import androidx.lifecycle.ViewModel
import com.main.bluchat.core.sl.Core
import com.main.bluchat.features.chats.presentation.viewmodel.ChatsViewModel
import com.main.bluchat.features.chats.sl.ChatsModule
import com.main.bluchat.main.presentation.MainViewModel
import com.main.bluchat.core.sl.Module

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
            ChatsViewModel::class.java -> ChatsModule(core)
            MainViewModel::class.java -> MainModule(core)
            else -> dependencyContainer.module(clazz)
        }
    }
}
