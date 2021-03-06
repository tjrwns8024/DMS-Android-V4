package com.dsm.dms.presentation.viewmodel.main.apply

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ApplyViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
            = modelClass.getConstructor().newInstance()

}