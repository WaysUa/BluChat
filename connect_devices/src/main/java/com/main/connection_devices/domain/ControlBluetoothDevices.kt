package com.main.connection_devices.domain

interface ControlBluetoothDevices {

    fun startDiscovery()

    fun stopDiscovery()

    fun release()
}