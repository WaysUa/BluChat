package com.main.connection_devices.presentation.communication

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.main.core.communication.Communication
import com.main.core.entities.BluetoothDevice

interface ConnectDevicesCommunication : ObserveConnectDevicesCommunication {

    fun mapScannedDevices(devices: List<BluetoothDevice>)

    fun mapPairedDevices(devices: List<BluetoothDevice>)

    class Base(
        private val scannerDevicesCommunication: ScannerDevicesCommunication,
        private val pairedDevicesCommunication: PairedDevicesCommunication
    ): ConnectDevicesCommunication {

        override fun mapScannedDevices(devices: List<BluetoothDevice>) {
            scannerDevicesCommunication.map(devices)
        }

        override fun mapPairedDevices(devices: List<BluetoothDevice>) {
            pairedDevicesCommunication.map(devices)
        }

        override fun observeScannedDevices(
            owner: LifecycleOwner,
            observer: Observer<List<BluetoothDevice>>
        ) = scannerDevicesCommunication.observe(owner, observer)

        override fun observePairedDevices(
            owner: LifecycleOwner,
            observer: Observer<List<BluetoothDevice>>
        ) = pairedDevicesCommunication.observe(owner, observer)
    }
}

interface ObserveConnectDevicesCommunication {

    fun observeScannedDevices(owner: LifecycleOwner, observer: Observer<List<BluetoothDevice>>)

    fun observePairedDevices(owner: LifecycleOwner, observer: Observer<List<BluetoothDevice>>)
}


interface ScannerDevicesCommunication : Communication.Mutable<List<BluetoothDevice>> {
    class Base: Communication.Ui<List<BluetoothDevice>>(), ScannerDevicesCommunication
}

interface PairedDevicesCommunication : Communication.Mutable<List<BluetoothDevice>> {
    class Base: Communication.Ui<List<BluetoothDevice>>(), ScannerDevicesCommunication
}