package com.main.bluchat.main.app

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.main.bluchat.core.sl.Core
import com.main.bluchat.core.sl.ProvideViewModel
import com.main.bluchat.core.sl.ViewModelsFactory
import com.main.bluchat.main.sl.DependencyContainer

class BluChat : Application(), ProvideViewModel {
    private lateinit var viewModelsFactory: ViewModelsFactory
    private lateinit var dependencyContainer: DependencyContainer.Base

    override fun onCreate() {
        super.onCreate()
        dependencyContainer = DependencyContainer.Base(core = Core.Base())
        viewModelsFactory = ViewModelsFactory(dependencyContainer)
    }

    override fun <T : ViewModel> provideViewModel(clazz: Class<T>, owner: ViewModelStoreOwner): T {
        return ViewModelProvider(owner, viewModelsFactory)[clazz]
    }
}
