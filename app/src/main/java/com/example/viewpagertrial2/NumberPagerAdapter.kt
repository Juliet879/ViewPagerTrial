package com.example.viewpagertrial2

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class NumberPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val numbers = (1..10).toList()

    override fun getItemCount(): Int = numbers.size

    override fun createFragment(position: Int): Fragment {
        val number = numbers[position]
        return SingleNumberFragment.newInstance(number)
    }
}
