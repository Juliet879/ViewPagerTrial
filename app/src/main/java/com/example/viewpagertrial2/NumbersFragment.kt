package com.example.viewpagertrial2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumbersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.numbers_fragment, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val adapter = NumbersAdapter { selectedNumber ->
            val viewPagerFragment = ViewPagerFragment.newInstance(selectedNumber)
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, viewPagerFragment)
                .addToBackStack(null)
                .commit()
        }

        recyclerView.adapter = adapter
        return view
    }
}