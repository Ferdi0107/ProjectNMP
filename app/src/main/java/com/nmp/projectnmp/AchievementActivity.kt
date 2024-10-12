package com.nmp.projectnmp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nmp.projectnmp.databinding.ActivityAchievementBinding

class AchievementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAchievementBinding
    private lateinit var achievementsAdapter: AchievementAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAchievementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameName = intent.getStringExtra("gamename")
        val gameId = intent.getIntExtra("gameid", 0)
        binding.viewGame.setImageResource(gameId)
        binding.txtGame.setText(gameName)

        val filteredAchievements = AchievementData.achievements.filter { it.game.name == gameName }.toTypedArray()

        achievementsAdapter = AchievementAdapter(filteredAchievements)

        binding.recAchievement.layoutManager = LinearLayoutManager(this)
        binding.recAchievement.setHasFixedSize(true)
        binding.recAchievement.adapter = achievementsAdapter

        val years = arrayOf("All", "2024", "2023", "2022", "2021")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, years)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerYear.adapter = spinnerAdapter

        binding.spinnerYear.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedYear = years[position]

                val filteredByYear = AchievementData.achievements.filter { achievement ->
                    achievement.game.name == gameName && (selectedYear == "All" || achievement.year.toString() == selectedYear)
                }.toTypedArray()

                achievementsAdapter.updateData(filteredByYear)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }
}
