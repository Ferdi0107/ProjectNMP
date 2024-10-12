package com.nmp.projectnmp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nmp.projectnmp.databinding.ActivityDetailEventBinding
import com.nmp.projectnmp.databinding.ActivityScheduleBinding

class DetailEvent : AppCompatActivity() {
    private lateinit var binding: ActivityDetailEventBinding
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val eventname = intent.getStringExtra("eventname")
        val eventteam = intent.getStringExtra("eventteam")
        val eventloc = intent.getStringExtra("eventloc")
        val eventdate = intent.getStringExtra("eventdate")
        val eventgame = intent.getStringExtra("eventgame")
        val eventdesc = intent.getStringExtra("eventdesc")
        val eventimg = intent.getIntExtra("eventimg", 0)

        binding.imgEvent.setImageResource(eventimg)
        binding.txtName.setText(eventname)
        binding.txtTeam.text = "${eventgame} - ${eventteam}"
        binding.txtTglLoc.text = "${eventloc} (${eventdate})"
        binding.txtDesc.setText(eventdesc)

        binding.drawerIcon.setOnClickListener {
            if (binding.main.isDrawerOpen(GravityCompat.START)) {
                binding.main.closeDrawer(GravityCompat.START)
            } else {
                binding.main.openDrawer(GravityCompat.START)
            }
        }

        binding.notifyMeButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Notifikasi")
                builder.setMessage("Notification Created")
                builder.setPositiveButton("Ok") { dialog, which ->
                }
                Toast.makeText(applicationContext, "Notification Set For 10.00 AM From Now", Toast.LENGTH_SHORT).show()
                val dialog = builder.create()
                dialog.show()
                binding.notifyMeButton.setBackgroundResource(R.drawable.button_like_pressed)
                binding.notifyMeButton.setTextColor(Color.parseColor("#FFFFFF"))
                binding.notifyMeButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bell_pressed, 0, 0, 0)
            } else {
                Toast.makeText(applicationContext, "Notification Disabled", Toast.LENGTH_SHORT).show()
                binding.notifyMeButton.setBackgroundResource(R.drawable.button_like)
                binding.notifyMeButton.setTextColor(Color.parseColor("#5852EC"))
                binding.notifyMeButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bell_normal, 0, 0, 0)
            }
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