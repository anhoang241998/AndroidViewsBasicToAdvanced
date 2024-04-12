package com.annguyenhoang.androidviewsbasictoadvanced

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.annguyenhoang.androidviewsbasictoadvanced.common.activity_binding.ViewBindingActivity
import com.annguyenhoang.androidviewsbasictoadvanced.databinding.ActivityAppHostBinding

class AppHostActivity : ViewBindingActivity<ActivityAppHostBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityAppHostBinding
        get() = { inflater -> ActivityAppHostBinding.inflate(inflater) }

    override fun initViews() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun initControls() {
        
    }
}