package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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

        val arguments = intent.extras

        var gender = "none"
        var whereGoing = "none"
        var season = "none"
        if (arguments != null) {
            gender = arguments.getString("gender").toString()
            whereGoing = arguments.getString("whereGoing").toString()
            season = arguments.getString("season").toString()
        }
        println(gender)
        println(whereGoing)
        println(season)

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