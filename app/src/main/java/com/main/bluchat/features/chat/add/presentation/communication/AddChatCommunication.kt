package com.main.bluchat.features.chat.add.presentation.communication

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.main.bluchat.features.chat.common.data.entities.BluetoothDevice
import com.main.bluchat.main.presentation.core.Communication

interface AddChatCommunication : ObserveAddChatCommunication {

    fun mapAvailableBluetoothDevices(devices: List<BluetoothDevice>)

    class Base(
        private val availableBluetoothDevicesCommunication: AvailableBluetoothDevicesCommunication,
    ) : AddChatCommunication {

        override fun mapAvailableBluetoothDevices(devices: List<BluetoothDevice>) {
            availableBluetoothDevicesCommunication.map(devices)
        }

        override fun observeAvailableBluetoothDevices(
            owner: LifecycleOwner,
            observer: Observer<List<BluetoothDevice>>,
        ) = availableBluetoothDevicesCommunication.observe(owner, observer)
    }
}

interface ObserveAddChatCommunication {

    fun observeAvailableBluetoothDevices(
        owner: LifecycleOwner,
        observer: Observer<List<BluetoothDevice>>,
    )
}

interface AvailableBluetoothDevicesCommunication : Communication.Mutable<List<BluetoothDevice>> {
    class Base : Communication.Ui<List<BluetoothDevice>>(), AvailableBluetoothDevicesCommunication
}