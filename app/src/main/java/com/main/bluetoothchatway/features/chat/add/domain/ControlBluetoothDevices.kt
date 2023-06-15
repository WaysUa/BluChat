package com.main.bluetoothchatway.features.chat.add.domain

interface ControlBluetoothDevices {

    fun startDiscovery()

    fun stopDiscovery()

    fun release()
}