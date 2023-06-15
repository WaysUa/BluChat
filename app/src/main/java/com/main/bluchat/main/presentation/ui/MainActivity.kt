package com.main.bluchat.main.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStoreOwner
import com.main.bluchat.R
import com.main.bluchat.core.sl.ProvideViewModel
import com.main.bluchat.main.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(), ProvideViewModel {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = provideViewModel(MainViewModel::class.java, this)
        viewModel.observe(this) { strategy ->
            strategy.navigate(supportFragmentManager, R.id.container)
        }
        viewModel.init(savedInstanceState == null)
    }

    override fun <T : ViewModel> provideViewModel(clazz: Class<T>, owner: ViewModelStoreOwner): T {
        return (application as ProvideViewModel).provideViewModel(clazz, owner)
    }
}