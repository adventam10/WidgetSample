package com.example.widgetsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.annotation.ColorRes

private const val ARG_RES_ID = "resId"
private const val ARG_SAMPLE_TEXT = "sampleText"

/**
 * A simple [Fragment] subclass.
 * Use the [SampleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SampleFragment : Fragment() {
    private var resId: Int? = null
    private var sampleText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            resId = it.getInt(ARG_RES_ID)
            sampleText = it.getString(ARG_SAMPLE_TEXT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sample, container, false)
        if (resId != null) {
            val layout = view.findViewById<FrameLayout>(R.id.main_layout)
            layout.setBackgroundResource(resId!!)
        }
        if (sampleText != null) {
            val text = view.findViewById<TextView>(R.id.sample_text)
            text.text = sampleText
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(@ColorRes resId: Int, sampleText: String) =
            SampleFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_RES_ID, resId)
                    putString(ARG_SAMPLE_TEXT, sampleText)
                }
            }
    }
}
