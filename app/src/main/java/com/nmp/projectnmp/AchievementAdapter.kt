package com.nmp.projectnmp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nmp.projectnmp.databinding.CardviewAchievementBinding

class AchievementAdapter(private var achievements: Array<Achievement>) : RecyclerView.Adapter<AchievementAdapter.AchievementViewHolder>() {

    class AchievementViewHolder(val binding: CardviewAchievementBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
        val binding = CardviewAchievementBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return AchievementViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return achievements.size
    }

    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        val achievement = achievements[position]

        holder.binding.txtTeam.text = "${achievement.game.name} - ${achievement.team.name}"
        holder.binding.txtTgl.text = achievement.year.toString()
        holder.binding.txtNama.text = achievement.name
    }

    fun updateData(newAchievements: Array<Achievement>) {
        achievements = newAchievements
        notifyDataSetChanged()
    }
}
