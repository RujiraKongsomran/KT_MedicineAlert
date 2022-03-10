package com.rujirakongsomran.kt_medicinealert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class OtherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            OtherFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}