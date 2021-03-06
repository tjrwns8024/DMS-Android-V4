package com.dsm.dms.presentation.di.module

import com.dsm.dms.presentation.di.module.main.MainModule
import com.dsm.dms.presentation.di.module.main.MainStaticModule
import com.dsm.dms.presentation.di.module.main.apply.extension.ApplyExtensionFloorDetailModule
import com.dsm.dms.presentation.di.module.main.login.LoginStaticModule
import com.dsm.dms.presentation.di.module.main.register.RegisterModule
import com.dsm.dms.presentation.di.module.main.register.RegisterStaticModule
import com.dsm.dms.presentation.di.scope.FragmentScope
import com.dsm.dms.presentation.ui.fragment.MainFragment
import com.dsm.dms.presentation.ui.fragment.apply.extension.ApplyExtensionFloorDetailFragment
import com.dsm.dms.presentation.ui.fragment.sign.login.LoginFragment
import com.dsm.dms.presentation.ui.fragment.sign.register.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [MainModule::class, MainStaticModule::class])
    abstract fun mainFragment(): MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [LoginStaticModule::class])
    abstract fun loginFragment(): LoginFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [RegisterModule::class, RegisterStaticModule::class])
    abstract fun registerFragment(): RegisterFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ApplyExtensionFloorDetailModule::class])
    abstract fun applyExtensionsFloorDetailFragment(): ApplyExtensionFloorDetailFragment
}