package com.rujirakongsomran.kt_medicinealert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BoxFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_box, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            BoxFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}