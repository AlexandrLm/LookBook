package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        //val btnM : View = findViewById(R.id.genderM)
        //val btnF : View = findViewById(R.id.genderF)
        if(v.id == R.id.genderM){
            gender = "male"
            //btnM.background.setTint(R.color.white)
            //btnF.background.setTint(R.color.testButton)
        }
        else if (v.id == R.id.genderF) {
            gender = "famale"
            //btnF.background.setTint(R.color.white)
            //btnM.background.setTint(R.color.testButton)
        }
        println(gender)
    }
    fun checkWhereGoing(v : View){
        //firstFragment
        when (v.id) {
            R.id.eveningBtn -> {
                whereGoing = "evening"
            }
            R.id.clubBtn -> {
                whereGoing = "club"
            }
            R.id.restBtn -> {
                whereGoing = "rest"
            }
            //secondFragment
            R.id.theatrBtn -> {
                whereGoing = "theatr"
            }
            R.id.schoolBtn -> {
                whereGoing = "school"
            }
            R.id.cityBtn -> {
                whereGoing = "city"
            }
            //thirdFragment
            R.id.cafeBtn -> {
                whereGoing = "cafe"
            }
            R.id.resortBtn -> {
                whereGoing = "resort"
            }
            R.id.restaurantBtn -> {
                whereGoing = "restaurant"
            }
        }
        println(whereGoing)
    }
    fun checkSeason(v : View){
        when (v.id) {
            R.id.winterBtn -> {
                season = "winter"
            }
            R.id.SummerBtn -> {
                season = "summer"
            }
            R.id.springBtn -> {
                season = "spring"
            }
        }
        println(season)
    }
    fun search(v : View){
        if (gender == "none" || whereGoing == "none" || season == "none"){
            Toast.makeText(this,"Выберите все значения", Toast.LENGTH_LONG).show()
            //back()
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