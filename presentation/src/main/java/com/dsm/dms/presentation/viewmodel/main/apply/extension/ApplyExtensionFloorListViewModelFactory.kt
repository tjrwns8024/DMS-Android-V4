package com.dsm.dms.presentation.viewmodel.main.apply.extension

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ApplyExtensionFloorListViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
            = modelClass.getConstructor().newInstance()
}