package com.rujirakongsomran.kt_medicinealert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
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
        addFragment(TodayFragment.newInstance())
        binding.bnv.selectedItemId = 0

        binding.bnv.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.miToday -> {
                    replaceFragment(TodayFragment.newInstance())
                    true
                }
                R.id.miBox -> {
                    replaceFragment(BoxFragment.newInstance())
                    true
                }
                R.id.miAlert -> {
                    replaceFragment(AlertFragment.newInstance())
                    true
                }
                R.id.miOther -> {
                    replaceFragment(OtherFragment.newInstance())
                    true
                }
                else -> false
            }

        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainer, fragment)
            .addToBackStack(Fragment::class.simpleName).commit()
    }

    private fun addFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmentContainer, fragment)
            .addToBackStack(Fragment::class.simpleName).commit()
    }

}