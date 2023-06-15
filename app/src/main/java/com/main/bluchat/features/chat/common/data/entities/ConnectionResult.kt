package com.main.bluchat.features.chat.common.data.entities

sealed interface ConnectionResult {
    object ConnectionEstablished: ConnectionResult
    //todo message
    data class TransferSucceeded(val message: String): ConnectionResult
    data class Error(val message: String): ConnectionResult
}