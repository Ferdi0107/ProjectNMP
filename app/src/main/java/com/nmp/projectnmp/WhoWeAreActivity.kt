package com.nmp.projectnmp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nmp.projectnmp.databinding.ActivityWhoWeAreBinding

class WhoWeAreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWhoWeAreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWhoWeAreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var like = false;

        binding.drawerIcon.setOnClickListener {
            if (binding.whoWeAre.isDrawerOpen(GravityCompat.START)) {
                binding.whoWeAre.closeDrawer(GravityCompat.START)
            } else {
                binding.whoWeAre.openDrawer(GravityCompat.START)
            }
        }

        binding.btnLike.setOnClickListener {
            if (like==false) {
                binding.textLike.text = "10"
                like=true
                binding.btnLike.setBackgroundResource(R.drawable.button_like_pressed)
                binding.btnLike.setImageResource(R.drawable.icon_like_pressed)
            } else {
                binding.textLike.text = "9"
                like=false
                binding.btnLike.setBackgroundResource(R.drawable.button_like)
                binding.btnLike.setImageResource(R.drawable.baseline_thumb_up_24)
            }
        }
    }
    override fun onBackPressed() {

        if (binding.whoWeAre.isDrawerOpen(GravityCompat.START)) {
            binding.whoWeAre.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}