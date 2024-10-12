package com.nmp.projectnmp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.nmp.projectnmp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.drawerIcon.setOnClickListener {
            if (binding.main.isDrawerOpen(GravityCompat.START)) {
                binding.main.closeDrawer(GravityCompat.START)
            } else {
                binding.main.openDrawer(GravityCompat.START)
            }
        }

        binding.btnwhoweare.setOnClickListener {
            val intent = Intent(this,WhoWeAreActivity::class.java)
            startActivity(intent)
        }

        binding.btnourschedule.setOnClickListener {
            val intent = Intent(this,ScheduleActivity::class.java)
            startActivity(intent)
        }

        binding.btnwhatweplay.setOnClickListener {
            val intent = Intent(this,WhatWePlayActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onBackPressed() {

        if (binding.main.isDrawerOpen(GravityCompat.START)) {
            binding.main.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

}