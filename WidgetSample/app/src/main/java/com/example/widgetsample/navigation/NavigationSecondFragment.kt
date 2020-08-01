package com.example.widgetsample.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

import com.example.widgetsample.R

/**
 * A simple [Fragment] subclass.
 */
class NavigationSecondFragment : Fragment() {

    // 通常はこの取得方法でいいと思う
    // 今回はnullになるパターンがあるので使わない
//    val navArgs : NavigationSecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            val action = NavigationSecondFragmentDirections.actionNavigationSecondFragmentToNavigationThirdFragment("Secondから値渡し")
            findNavController().navigate(action)
        }
        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().popBackStack()
        }
        arguments?.let {
            val args = NavigationSecondFragmentArgs.fromBundle(it)
            view.findViewById<TextView>(R.id.text).text = args.text
        }
    }
}
