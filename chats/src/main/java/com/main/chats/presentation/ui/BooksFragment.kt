package com.main.chats.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.main.chats.R
import com.main.chats.databinding.FragmentBooksBinding
import com.main.core.base.BaseFragment

class BooksFragment : BaseFragment() {
    private val binding by lazy { FragmentBooksBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = binding.root
}