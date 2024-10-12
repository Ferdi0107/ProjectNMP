package com.nmp.projectnmp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nmp.projectnmp.databinding.CardviewWhatweplayBinding

class GamesAdapter() : RecyclerView.Adapter<GamesAdapter.QuestionViewHolder>() {
    class QuestionViewHolder(val binding:
                             CardviewWhatweplayBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = CardviewWhatweplayBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return WhatWePlayData.games.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.binding.imgGame.setImageResource(WhatWePlayData.games[position].imageId)
        holder.binding.txtGame.text = WhatWePlayData.games[position].name
        holder.binding.txtDesc.text = WhatWePlayData.games[position].desc

        holder.binding.btnAchieve.setOnClickListener {
            val intent = Intent(holder.itemView.context, AchievementActivity::class.java)
            intent.putExtra("gameid", WhatWePlayData.games[position].imageId)
            intent.putExtra("gamename", WhatWePlayData.games[position].name)
            holder.itemView.context.startActivity(intent)
        }

        holder.binding.btnTeams.setOnClickListener {
            val intent = Intent(holder.itemView.context, TeamActivity::class.java)
            intent.putExtra("gameid", WhatWePlayData.games[position].imageId)
            intent.putExtra("gamename", WhatWePlayData.games[position].name)
            holder.itemView.context.startActivity(intent)
        }
    }


}
