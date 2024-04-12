package com.annguyenhoang.androidviewsbasictoadvanced.components.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.annguyenhoang.androidviewsbasictoadvanced.common.fragment_binding.ViewBindingFragment
import com.annguyenhoang.androidviewsbasictoadvanced.databinding.FragmentComponentsBinding

class ComponentsFragment : ViewBindingFragment<FragmentComponentsBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentComponentsBinding
        get() = FragmentComponentsBinding::inflate

    override fun initControls() {
        super.initControls()
        binding.btnToDetail.setOnClickListener {
            val action = ComponentsFragmentDirections.actionComponentsFragmentToInstagramFragment()
            findNavController().navigate(action)
        }
    }

}