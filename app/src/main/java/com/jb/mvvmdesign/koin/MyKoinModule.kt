package com.jb.mvvmdesign.koin


import com.jb.mvvmdesign.api.WebServiceRequests
import com.jb.mvvmdesign.ui.HomeVM
import com.jb.mvvmdesign.ui.dashboard.DashBoardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { WebServiceRequests() }

//    factory { (mListener: MyClickListener) -> AdapterPassCode(mListener) }

    viewModel { HomeVM(get()) }
    viewModel { DashBoardViewModel(get()) }


}