package com.rujirakongsomran.kt_medicinealert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TodayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_today, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TodayFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}