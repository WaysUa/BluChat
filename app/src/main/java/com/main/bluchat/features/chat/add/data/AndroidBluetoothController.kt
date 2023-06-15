package com.main.bluchat.features.chat.add.data

import android.bluetooth.BluetoothManager
import android.content.Context
import com.main.bluchat.features.chat.add.domain.BluetoothController
import com.main.bluchat.features.chat.common.data.entities.BluetoothDevice
import com.main.bluchat.features.chat.common.data.entities.ConnectionResult
import kotlinx.coroutines.flow.Flow

class AndroidBluetoothController(
    private val context: Context
) : BluetoothController {

    private val bluetoothManager by lazy {
        context.getSystemService(BluetoothManager::class.java)
    }

    private val bluetoothAdapter by lazy {
        bluetoothManager?.adapter
    }

    override fun startDiscovery() {
        TODO("Not yet implemented")
    }

    override fun stopDiscovery() {
        TODO("Not yet implemented")
    }

    override fun connectToDevice(device: BluetoothDevice): Flow<ConnectionResult> {
        TODO("Not yet implemented")
    }
}