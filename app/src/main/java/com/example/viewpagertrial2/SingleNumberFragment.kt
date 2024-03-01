package com.example.viewpagertrial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SingleNumberFragment : Fragment() {

    companion object {
        private const val ARG_NUMBER = "number"

        fun newInstance(number: Int): SingleNumberFragment {
            val fragment = SingleNumberFragment()
            val args = Bundle()
            args.putInt(ARG_NUMBER, number)
            fragment.arguments = args
            return fragment
        }
    }

    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            number = it.getInt(ARG_NUMBER)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_single_number, container, false)
        val textViewNumber = view.findViewById<TextView>(R.id.textViewNumber)
        textViewNumber.text = number.toString()
        return view
    }
}