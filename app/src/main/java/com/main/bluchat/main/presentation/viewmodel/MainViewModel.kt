package com.main.bluchat.main.presentation.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.main.bluchat.main.data.Screen
import com.main.bluchat.main.domain.Init
import com.main.bluchat.main.presentation.communication.NavigationCommunication
import com.main.bluchat.main.presentation.core.NavigationStrategy
import com.main.bluchat.main.presentation.core.Communication

class MainViewModel(
    private val navigationCommunication: NavigationCommunication.Mutable
) : ViewModel(), Init, Communication.Observe<NavigationStrategy> {

    override fun init(isFirstRun: Boolean) {
        if (isFirstRun) {
            navigationCommunication.map(NavigationStrategy.Replace(Screen.Chats))
        }
    }

    override fun observe(owner: LifecycleOwner, observer: Observer<NavigationStrategy>) {
        navigationCommunication.observe(owner, observer)
    }
}