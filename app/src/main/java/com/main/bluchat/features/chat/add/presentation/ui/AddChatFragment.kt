package com.main.bluchat.features.chat.add.presentation.ui

import android.os.Bundle
import android.view.View
import com.main.bluchat.core.data.BaseFragment
import com.main.bluchat.databinding.FragmentAddChatBinding
import com.main.bluchat.features.chat.add.presentation.viewmodel.AddChatViewModel

class AddChatFragment : BaseFragment<AddChatViewModel>() {
    override val viewModelClass: Class<AddChatViewModel> = AddChatViewModel::class.java
    override val binding by lazy { FragmentAddChatBinding.inflate(layoutInflater) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addChatToolbar.setNavigationOnClickListener {
            viewModel.navigateToChatsFragment()
        }
    }
}