package com.main.bluetoothchatway.core.viewmodel

import android.net.Uri
import com.main.bluetoothchatway.core.base.BaseViewModel
import com.main.bluetoothchatway.core.communication.CoreCommunication
import com.main.bluetoothchatway.core.communication.MapCoreCommunication
import com.main.bluetoothchatway.core.communication.ValueCoreCommunication

class CoreViewModel(
    private val coreCommunication: CoreCommunication
) : BaseViewModel(), MapCoreCommunication, ValueCoreCommunication {


}