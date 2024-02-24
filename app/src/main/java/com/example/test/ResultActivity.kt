package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class ResultActivity : AppCompatActivity() {
    private lateinit var adapter: MyAdapter
    private lateinit var viewPager : ViewPager2

    private lateinit var fragments : Array<Fragment>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        fragments = arrayOf(FirstFragment(),SecondFragment(),ThirdFragment())

        adapter = MyAdapter(this)
        adapter.setFragments(fragments)

        viewPager = findViewById(R.id.pager)
        viewPager.adapter = adapter

        viewPager.currentItem = 1
    }
    fun goHome(v : View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}