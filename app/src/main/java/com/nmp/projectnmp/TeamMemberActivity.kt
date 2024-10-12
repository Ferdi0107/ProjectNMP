package com.nmp.projectnmp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.nmp.projectnmp.databinding.ActivityTeamBinding

class TeamMemberActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTeamBinding
    private lateinit var teamMemberAdapter: MemberAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameId = intent.getIntExtra("gameid", 0)
        val teamName = intent.getStringExtra("teamname")

        binding.viewGame.setImageResource(gameId)
        binding.txtGame.setText(teamName)

        val filteredTeam = TeamData.teams.filter { it.name == teamName }.toTypedArray()
        val filteredMember = filteredTeam[0].members
        teamMemberAdapter = MemberAdapter(filteredMember)

        binding.recTeam.layoutManager = LinearLayoutManager(this)
        binding.recTeam.setHasFixedSize(true)
        binding.recTeam.adapter = teamMemberAdapter
    }
}