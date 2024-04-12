package com.annguyenhoang.androidviewsbasictoadvanced

import android.view.LayoutInflater
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.annguyenhoang.androidviewsbasictoadvanced.common.activity_binding.ViewBindingActivity
import com.annguyenhoang.androidviewsbasictoadvanced.databinding.ActivityAppHostBinding

class AppHostActivity : ViewBindingActivity<ActivityAppHostBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityAppHostBinding
        get() = { inflater -> ActivityAppHostBinding.inflate(inflater) }
    private lateinit var navController: NavController

    override fun initViews() {
        setUpSystemPadding()
        setupNavController()
    }

    private fun setupNavController() {
        val navHostContainerId = binding.navHostFragmentContainer.id
        val navHostFragment = supportFragmentManager.findFragmentById(navHostContainerId) as NavHostFragment
        navController = navHostFragment.navController
    }

    private fun setUpSystemPadding() {
        val mainId = binding.main.id
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(mainId)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}