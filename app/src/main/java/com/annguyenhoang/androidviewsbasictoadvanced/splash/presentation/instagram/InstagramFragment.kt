package com.annguyenhoang.androidviewsbasictoadvanced.splash.presentation.instagram

import android.view.LayoutInflater
import android.view.ViewGroup
import com.annguyenhoang.androidviewsbasictoadvanced.common.fragment_binding.ViewBindingFragment
import com.annguyenhoang.androidviewsbasictoadvanced.databinding.FragmentInstagramBinding

class InstagramFragment : ViewBindingFragment<FragmentInstagramBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentInstagramBinding
        get() = FragmentInstagramBinding::inflate

    override fun initViews() {

    }

}