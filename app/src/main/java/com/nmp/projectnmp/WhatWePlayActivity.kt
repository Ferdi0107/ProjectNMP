package com.nmp.projectnmp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.nmp.projectnmp.databinding.ActivityMainBinding
import com.nmp.projectnmp.databinding.ActivityWhatWePlayBinding

class WhatWePlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWhatWePlayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWhatWePlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recWhatWePlay.layoutManager = LinearLayoutManager(this)
        binding.recWhatWePlay.setHasFixedSize(true)
        binding.recWhatWePlay.adapter = GamesAdapter()

    }
}