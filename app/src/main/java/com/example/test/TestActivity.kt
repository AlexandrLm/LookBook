package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible

class TestActivity : AppCompatActivity() {
    var gender : String = "none"
    var whereGoing : String = "none"
    var season : String = "none"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }
     fun back(v : View){
         val intent = Intent(this, MainActivity::class.java)
         startActivity(intent)
     }
    @SuppressLint("ResourceAsColor")
    fun checkGender(v : View){
        var btnM : View = findViewById(R.id.genderM)
        var btnF : View = findViewById(R.id.genderF)
        if(v.id == R.id.genderM){
            gender = "male"
            btnM.background.setTint(R.color.white)
            btnF.background.setTint(R.color.testButton)
            println(gender)
        }
        else if (v.id == R.id.genderF) {
            gender = "famale"
            btnF.background.setTint(R.color.white)
            btnM.background.setTint(R.color.testButton)
            println(gender)
        }
    }
    fun checkWhereGoing(v : View){
        if(v.id == R.id.theatrBtn){
            whereGoing = "theatr"
            println(whereGoing)
        }
        else if(v.id == R.id.schoolBtn){
            whereGoing = "school"
            println(whereGoing)
        }
        else if(v.id == R.id.cityBtn){
            whereGoing = "city"
            println(whereGoing)
        }
    }

    fun checkSeason(v : View){
        if(v.id == R.id.winterBtn){
            season = "winter"
            println(season)
        }
        else if(v.id == R.id.SummerBtn){
            season = "summer"
            println(season)
        }
        else if(v.id == R.id.springBtn){
            season = "spring"
            println(season)
        }
    }
    fun search(v: View){
        if (gender != "none" && whereGoing != "none" && season != "none"){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        println(gender)
        println(whereGoing)
        println(season)
    }

}