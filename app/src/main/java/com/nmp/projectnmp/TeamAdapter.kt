package com.nmp.projectnmp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nmp.projectnmp.databinding.CardviewTeamBinding

class TeamAdapter(private var teams: Array<Team>): RecyclerView.Adapter<TeamAdapter.TeamViewHolder>(){
    class TeamViewHolder(val binding:
                             CardviewTeamBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val binding = CardviewTeamBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return TeamViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.binding.txtTeamName.text = teams[position].name

        holder.binding.btnMember.setOnClickListener {
            val intent = Intent(holder.itemView.context, TeamMemberActivity::class.java)
            intent.putExtra("teamname", teams[position].name)
            intent.putExtra("gameid", teams[position].game.imageId)
            holder.itemView.context.startActivity(intent)
        }
    }
}