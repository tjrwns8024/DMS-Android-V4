package com.dsm.dms.presentation.ui.fragment.sign.login

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.dsm.dms.presentation.R
import com.dsm.dms.presentation.base.EndPointDataBindingFragment
import com.dsm.dms.presentation.databinding.FragmentLoginBinding
import com.dsm.dms.presentation.viewmodel.sign.login.LoginViewModel
import com.dsm.dms.presentation.viewmodel.sign.login.LoginViewModelFactory
import javax.inject.Inject

class LoginFragment: EndPointDataBindingFragment<FragmentLoginBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_login

    @Inject
    lateinit var factory: LoginViewModelFactory

    override val viewModel
            by lazy { ViewModelProvider(this, factory).get(LoginViewModel::class.java) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
    }

    override fun observeEvent() {
        viewModel.loginSingleLiveEvent
            .observe(this, Observer {
                findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
            })

        viewModel.registerSingleLiveEvent
            .observe(this, Observer {
                findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
            })
    }
}