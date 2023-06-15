package com.main.bluchat.features.chat.add.domain

import com.main.bluchat.features.chat.common.data.entities.BluetoothDevice
import com.main.bluchat.features.chat.common.data.entities.ConnectionResult
import kotlinx.coroutines.flow.Flow

interface BluetoothController {

    fun startDiscovery()

    fun stopDiscovery()

    fun connectToDevice(device: BluetoothDevice): Flow<ConnectionResult>
}