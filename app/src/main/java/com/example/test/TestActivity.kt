package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible

class TestActivity : AppCompatActivity() {
    var gender : Char = 'м'
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }
     fun back(v : View){
         val intent = Intent(this, MainActivity::class.java)
         startActivity(intent)

     }
    fun checkGender(v : View){
        gender = if(v.id == R.id.genderM) 'м' else 'ж'
        println(gender)

    }

}