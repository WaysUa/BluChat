package com.main.bluchat.core.sl

import com.main.bluchat.main.presentation.core.DispatchersList
import com.main.bluchat.main.presentation.communication.NavigationCommunication

interface Core : ProvideNavigation {

    fun provideDispatchers(): DispatchersList

    class Base : Core {


        private val navigationCommunication = NavigationCommunication.Base()

        private val dispatchersList by lazy {
            DispatchersList.Base()
        }

        override fun provideDispatchers() = dispatchersList

        override fun provideNavigation() = navigationCommunication
    }
}

interface ProvideNavigation {
    fun provideNavigation(): NavigationCommunication.Mutable
}
