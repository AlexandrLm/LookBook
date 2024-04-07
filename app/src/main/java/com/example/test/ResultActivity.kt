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

        if(gender == "female"){
            when (whereGoing) {
                "evening" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(vecherzimawomen1(),vecherzimawomen2(),vecherzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(vecherletowomen1(),vecherletowomen2(),vecherletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(vecherocenwomen1(),vecherocenwomen2(),vecherocenwomen3())
                        }
                    }
                }
                "club" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(clubzimawomen1(),clubzimawomen2(),clubzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(clubletowomen1(),clubletowomen2(),clubletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(clubocenwomen1(),clubocenwomen2(),clubocenwomen3())
                        }
                    }
                }
                "rest" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(chilzimawomen1(),chilzimawomen2(),chilzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(chilletowomen1(),chilletowomen2(),chilletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(chilocemwomen1(),chilocenwomen2(),chilocenwomen3())
                        }
                    }
                }
                "theatr" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(teatrzimawomen1(),teatrzimawomen2(),teatrzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(teatrletowomen1(),teatrletowomen2(),teatrletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(teatrocenwomen1(),teatrocenwomen2(),teatrocenwomen3())
                        }
                    }
                }
                "school" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(ychebazimawomen1(),ychebazimawomen2(),ychebazimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(ychebaletoG1(),ychebaletowomen2(),ychebaletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(ychebaocenwomen1(),ychebaocenwomen2(),ychebaocenwomen3())
                        }
                    }
                }
                "city" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(exitincityzimawomen1(),exitincityzimawomen2(),exitincityzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(exitincitywomen1(),exitincitywomen2(),exitincitywomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(exitincityocenwomen1(),exitincityocenwomen2(),exitincityocenwomen3())
                        }
                    }
                }
                "cafe" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(kafezimawomen1(),kafezimawomen2(),kafezimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(kafeletowomen1(),kafeietowomen2(),kafeletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(kafeocenwomen1(),kafeocenwomen2(),kafeocenwomen3())
                        }
                    }
                }
                "resort" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(kyrortzimawomen1(),kyrortzimawomen2(),kyrortzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(kyrortletowomen1(),kyrortletowomen2(),kyrortletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(kyrortocenwomen1(),kyrortocenwomen2(),kyrortocenwomen3())
                        }
                    }
                }
                "restaurant" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(restoranzimawomen1(),restoranzimawomen2(),restoranzimawomen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(restoranletowomen1(),restoranletowomen2(),restoranletowomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(restoranocenwomen1(),restoranocenwomen2(),restoranocenwomen3())
                        }
                    }
                }
            }
        }
        else if(gender == "male"){
            when (whereGoing) {
                "evening" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(vecherzimamen1(),vecherzimamen2(),vecherzimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(vecherletomen1(),vecherletomen2(),vecherletomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(vecherocenmen1(),vecherocenmen2(),vecherocenmen3())
                        }
                    }
                }
                "club" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(clubzimamen1(),clubzimamen2(),clubzimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(clubletomen1(),clubletomen2(),clubletomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(clubocenmen1(),clubocenmen2(),clubocenmen3())
                        }
                    }
                }
                "rest" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(otdxzimamen1(),otdxzimamen2(),otdxzimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(otdxletomen1(),otdxletomen2(),otdxletomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(otdxocenmen1(),otdxocenmen2(),otdxocenmen3())
                        }
                    }
                }
                "theatr" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(teatrzimamen1(),teatrzimamen2(),teatrzimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(teatrletomen1(),teatrletomen2(),teatrletomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(teatrocenmen1(),teatrocenmen2(),teatrocenmen3())
                        }
                    }
                }
                "school" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(ychebazimamen1(),ychebazimamen2(),ychebazimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(ychebaletomen1(),ychebaletomen2(),ychebaletomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(ychebaocenmen1(),ychebaocenmen2(),ychebaocenmen3())
                        }
                    }
                }
                "city" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(incityzimamen1(),incityzimamen2(),incityzimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(incityletomen1(),incityletomen2(),incityletomen3())
                        }
                        "spring" -> {
                            fragments = arrayOf(incityocenmen1(),incityocenmen2(),incityocenmen3())
                        }
                    }
                }
                "cafe" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(kafezimamen1(),kafezimamen2(),kafezimamen3())
                        }

                        "summer" -> {
                            fragments = arrayOf(kafeletomen1(),kafeletomen2(),kafeletomen3())
                        }

                        "spring" -> {
                            fragments = arrayOf(kafeocenmen1(),kafeocenmen2(),kafeocenmen3())
                        }
                    }
                }
                "resort" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(kyrortzimamen1(),kyrortzimamen2(),kyrortzimamen3())
                        }

                        "summer" -> {
                            fragments = arrayOf(kyrortletomen1(),kyrortletomen2(),kyrortletomen3())
                        }

                        "spring" -> {
                            fragments = arrayOf(kyrortocenmen1(),kyrortocenmen2(),kyrortocenmen3())
                        }
                    }
                }
                "restaurant" -> {
                    when (season) {
                        "winter" -> {
                            fragments = arrayOf(restoranzimamen1(),restoranzimamen2(),restoranzimamen3())
                        }
                        "summer" -> {
                            fragments = arrayOf(restoranletomen1(),restoranleto2(),restoranletomen3())
                        }

                        "spring" -> {
                            fragments = arrayOf(restoranocenmen1(),restoranocenmen2(),restoranocenmen3())
                        }
                    }
                }
            }
        }

        adapter = MyAdapter(this)
        adapter.setFragments(fragments)

        viewPager = findViewById(R.id.pager)
        viewPager.adapter = adapter

        viewPager.currentItem = 1
    }
    fun goHome(v : View){
        val intent = Intent(this, TestActivity::class.java)
        finish()
        startActivity(intent)
    }
}