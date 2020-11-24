package com.jb.mvvmdesign.ui

import android.graphics.Paint
import android.view.View
import androidx.core.view.GravityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.jb.mvvmdesign.R
import com.jb.mvvmdesign.base.BaseActivity
import com.jb.mvvmdesign.databinding.ActivityMainBinding
import com.jb.mvvmdesign.ui.dashboard.DashBoardViewModel
import kotlinx.android.synthetic.main.drawer_header.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity() : BaseActivity<ActivityMainBinding>() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController
    private lateinit var inflateHeaderView: View


    private val mHomeVM: HomeVM by viewModel()

    override fun mLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun onViewReady() {
        setSupportActionBar(mBinding.toolbar)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        mBinding.navView.setupWithNavController(navController)
        mBinding.navDrawer.setupWithNavController(navController)
        appBarConfiguration = AppBarConfiguration(navController.graph, mBinding.drawerLayout)
        NavigationUI.setupActionBarWithNavController(this, navController, mBinding.drawerLayout)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }

    override fun onResume() {
        super.onResume()
        mBinding.navDrawer.menu.clear()
        if (::inflateHeaderView.isInitialized)
            mBinding.navDrawer.removeHeaderView(inflateHeaderView)
        mBinding.navDrawer.inflateMenu(R.menu.bottom_nav_menu)
        inflateHeaderView = mBinding.navDrawer.inflateHeaderView(R.layout.drawer_header)

        inflateHeaderView.editProfileTextView.paintFlags =
            inflateHeaderView.editProfileTextView.paintFlags or Paint.UNDERLINE_TEXT_FLAG


        inflateHeaderView.closeImageView.setOnClickListener {
            mBinding.drawerLayout.closeDrawer(GravityCompat.START)
        }
//            getProfile()
    }

}