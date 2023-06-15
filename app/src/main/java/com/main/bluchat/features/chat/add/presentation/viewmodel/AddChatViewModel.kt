package com.main.bluchat.features.chat.add.presentation.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.main.bluchat.features.chat.add.presentation.communication.AddChatCommunication
import com.main.bluchat.features.chat.add.presentation.communication.ObserveAddChatCommunication
import com.main.bluchat.features.chat.common.data.entities.BluetoothDevice
import com.main.bluchat.main.presentation.communication.NavigationCommunication
import com.main.bluchat.main.presentation.core.NavigationStrategy

class AddChatViewModel(
    private val navigationCommunication: NavigationCommunication.Mutable,
    private val addChatCommunication: AddChatCommunication
) : ViewModel(), ObserveAddChatCommunication {

    fun navigateToChatsFragment() {
        navigationCommunication.map(NavigationStrategy.Back())
    }

    override fun observeAvailableBluetoothDevices(
        owner: LifecycleOwner,
        observer: Observer<List<BluetoothDevice>>,
    ) {
        addChatCommunication.observeAvailableBluetoothDevices(owner, observer)
    }
}