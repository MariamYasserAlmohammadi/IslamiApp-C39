package com.route.week4_islami.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.route.week4_islami.R
import com.route.week4_islami.databinding.ActivityMainBinding
import com.route.week4_islami.ui.home.hadeth.HadethFragment
import com.route.week4_islami.ui.home.quran.QuranFragment
import com.route.week4_islami.ui.home.radio.RadioFragment
import com.route.week4_islami.ui.home.tasbeh.TasbehFragment


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        }

    private fun initViews() {
        binding.contentMain.bottomNav.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.navigation_quran -> {
                        pushFragment(QuranFragment())
                    }

                    R.id.navigation_hadeth -> {
                        pushFragment(HadethFragment())
                    }

                    R.id.navigation_tasbeh -> {
                        pushFragment(TasbehFragment())
                    }

                    R.id.navigation_Radio -> {
                        pushFragment(RadioFragment())
                    }
                }
                // item is selected
                true
            }
        binding.contentMain.bottomNav.selectedItemId =R.id.navigation_quran
    }
    private fun pushFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .commit()
    }

}