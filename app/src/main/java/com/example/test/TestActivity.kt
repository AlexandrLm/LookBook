package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class TestActivity : AppCompatActivity() {
    private var gender : String = "none"
    private var whereGoing : String = "none"
    private var season : String = "none"
    private val firstFragment : FirstFragment = FirstFragment()
    private val secondFragment : SecondFragment = SecondFragment()
    private val thirdFragment : ThirdFragment = ThirdFragment()
    private var curFragment : Int = 1

    private val fragments : Array<Fragment> = arrayOf(firstFragment, secondFragment, thirdFragment)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        setNewFragment(fragments[curFragment])
    }
    @SuppressLint("CommitTransaction")
    fun setNewFragment(fragment : Fragment){
        val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frame_Layout, fragment)
        ft.commit()
    }
    fun prevNextBtn(v : View){
        if(v.id == R.id.prevFragmentBtn && curFragment != 0){
            curFragment--
            setNewFragment(fragments[curFragment])
        }
        else if(v.id == R.id.nextFragmentBtn && curFragment != 2){
            curFragment++
            setNewFragment(fragments[curFragment])
        }
    }
     fun back(){
         val intent = Intent(this, MainActivity::class.java)
         startActivity(intent)
     }
    @SuppressLint("ResourceAsColor")
    fun checkGender(v : View){
        if(v.id == R.id.genderM){
            gender = "male"
            v.isActivated = true
            findViewById<Button>(R.id.genderF).isActivated = false
        }
        else if (v.id == R.id.genderF) {
            gender = "female"
            v.isActivated = true
            findViewById<Button>(R.id.genderM).isActivated = false
        }
        println(gender)
    }
    fun checkWhereGoing(v : View){

        //firstFragment
        when (v.id) {
            R.id.eveningBtn -> {
                whereGoing = "evening"
                v.isActivated = true
                findViewById<Button>(R.id.clubBtn).isActivated = false
                findViewById<Button>(R.id.restBtn).isActivated = false
            }
            R.id.clubBtn -> {
                whereGoing = "club"
                v.isActivated = true
                findViewById<Button>(R.id.eveningBtn).isActivated = false
                findViewById<Button>(R.id.restBtn).isActivated = false
            }
            R.id.restBtn -> {
                whereGoing = "rest"
                v.isActivated = true
                findViewById<Button>(R.id.clubBtn).isActivated = false
                findViewById<Button>(R.id.eveningBtn).isActivated = false
            }
            //secondFragment
            R.id.theatrBtn -> {
                whereGoing = "theatr"
                v.isActivated = true
                findViewById<Button>(R.id.schoolBtn).isActivated = false
                findViewById<Button>(R.id.cityBtn).isActivated = false
            }
            R.id.schoolBtn -> {
                whereGoing = "school"
                v.isActivated = true
                findViewById<Button>(R.id.theatrBtn).isActivated = false
                findViewById<Button>(R.id.cityBtn).isActivated = false
            }
            R.id.cityBtn -> {
                whereGoing = "city"
                v.isActivated = true
                findViewById<Button>(R.id.theatrBtn).isActivated = false
                findViewById<Button>(R.id.schoolBtn).isActivated = false
            }
            //thirdFragment
            R.id.cafeBtn -> {
                whereGoing = "cafe"
                v.isActivated = true
                findViewById<Button>(R.id.resortBtn).isActivated = false
                findViewById<Button>(R.id.restaurantBtn).isActivated = false
            }
            R.id.resortBtn -> {
                whereGoing = "resort"
                v.isActivated = true
                findViewById<Button>(R.id.cafeBtn).isActivated = false
                findViewById<Button>(R.id.restaurantBtn).isActivated = false
            }
            R.id.restaurantBtn -> {
                whereGoing = "restaurant"
                v.isActivated = true
                findViewById<Button>(R.id.cafeBtn).isActivated = false
                findViewById<Button>(R.id.resortBtn).isActivated = false
            }
        }
        println(whereGoing)
    }
    fun checkSeason(v : View){
        when (v.id) {
            R.id.winterBtn -> {
                season = "winter"
                v.isActivated = true
                findViewById<Button>(R.id.SummerBtn).isActivated = false
                findViewById<Button>(R.id.springBtn).isActivated = false
            }
            R.id.SummerBtn -> {
                season = "summer"
                v.isActivated = true
                findViewById<Button>(R.id.winterBtn).isActivated = false
                findViewById<Button>(R.id.springBtn).isActivated = false
            }
            R.id.springBtn -> {
                season = "spring"
                v.isActivated = true
                findViewById<Button>(R.id.winterBtn).isActivated = false
                findViewById<Button>(R.id.SummerBtn).isActivated = false
            }
        }
        println(season)
    }
    fun search(v : View){
        if (gender == "none" || whereGoing == "none" || season == "none"){
            Toast.makeText(this,"Выберите все значения", Toast.LENGTH_LONG).show()
            println(gender)
            println(whereGoing)
            println(season)
            return
        }

        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("gender",gender)
        intent.putExtra("whereGoing",whereGoing)
        intent.putExtra("season",season)
        startActivity(intent)
    }
}