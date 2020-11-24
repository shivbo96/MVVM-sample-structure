package com.jb.mvvmdesign.ui.dashboard

import com.jb.mvvmdesign.R
import com.jb.mvvmdesign.base.BaseFragment
import com.jb.mvvmdesign.databinding.DashBoardFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashBoardFragment : BaseFragment<DashBoardFragmentBinding>() {

    private val mDashBoardViewModel: DashBoardViewModel by viewModel()

    override fun mLayoutRes(): Int {
        return R.layout.dash_board_fragment
    }

    override fun onViewReady() {

    }

}