package com.main.bluchat.features.chats.presentation.ui

import android.os.Bundle
import android.view.View
import com.main.bluchat.core.data.BaseFragment
import com.main.bluchat.databinding.FragmentChatsBinding
import com.main.bluchat.features.chats.presentation.viewmodel.ChatsViewModel

class ChatsFragment : BaseFragment<ChatsViewModel>() {
    override val viewModelClass: Class<ChatsViewModel> = ChatsViewModel::class.java
    override val binding by lazy { FragmentChatsBinding.inflate(layoutInflater) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}