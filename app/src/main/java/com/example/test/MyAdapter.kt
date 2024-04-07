package com.example.test

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter (fragment: FragmentActivity) : FragmentStateAdapter(fragment){
    private var fragments : Array<Fragment> = arrayOf(FirstFragment(),SecondFragment(),ThirdFragment())
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
    fun setFragments(fragment: Array<Fragment>){
        fragments = fragment
    }
}