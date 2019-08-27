package com.dsm.dms.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.support.DaggerDialogFragment
import dagger.android.support.HasSupportFragmentInjector

abstract class DataBindingDialogFragment<T : ViewDataBinding> : DaggerDialogFragment(), HasSupportFragmentInjector {

    lateinit var rootView: View
    lateinit var binding: T

    abstract val layoutId: Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = this
        rootView = binding.root
        return rootView
    }
}