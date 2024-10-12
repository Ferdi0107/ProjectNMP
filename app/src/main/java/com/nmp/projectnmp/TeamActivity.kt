package com.nmp.projectnmp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.nmp.projectnmp.databinding.ActivityAchievementBinding
import com.nmp.projectnmp.databinding.ActivityTeamBinding

class TeamActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTeamBinding
    private lateinit var teamAdapter: TeamAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameName = intent.getStringExtra("gamename")
        val gameId = intent.getIntExtra("gameid", 0)
        binding.viewGame.setImageResource(gameId)
        binding.txtGame.setText(gameName)

        val filteredTeam = TeamData.teams.filter { it.game.name == gameName }.toTypedArray()
        teamAdapter = TeamAdapter(filteredTeam)

        binding.recTeam.layoutManager = LinearLayoutManager(this)
        binding.recTeam.setHasFixedSize(true)
        binding.recTeam.adapter = teamAdapter
    }
}