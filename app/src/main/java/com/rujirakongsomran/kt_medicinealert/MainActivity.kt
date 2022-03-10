package com.rujirakongsomran.kt_medicinealert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rujirakongsomran.kt_medicinealert.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bnv.background = null
        binding.bnv.menu.getItem(2).isEnabled = false


    }
}