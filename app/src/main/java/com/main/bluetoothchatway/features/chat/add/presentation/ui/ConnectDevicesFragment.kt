package com.main.bluetoothchatway.features.chat.add.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.main.bluetoothchatway.core.base.BaseFragment
import com.main.bluetoothchatway.databinding.FragmentConnectDevicesBinding

class ConnectDevicesFragment : BaseFragment() {
    private val binding by lazy { FragmentConnectDevicesBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}