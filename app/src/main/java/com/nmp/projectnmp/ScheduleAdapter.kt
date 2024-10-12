package com.nmp.projectnmp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nmp.projectnmp.GamesAdapter.QuestionViewHolder
import com.nmp.projectnmp.databinding.CardviewScheduleBinding
import com.nmp.projectnmp.databinding.CardviewWhatweplayBinding
import java.text.SimpleDateFormat
import java.util.Locale

class ScheduleAdapter(): RecyclerView.Adapter<ScheduleAdapter.QuestionViewHolder>(){
    class QuestionViewHolder(val binding:
                             CardviewScheduleBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = CardviewScheduleBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return WhatWePlayData.games.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val inputFormat = SimpleDateFormat("d-M-yyyy", Locale.getDefault())
        val monthFormat = SimpleDateFormat("MMM", Locale.getDefault())
        val dayFormat = SimpleDateFormat("dd", Locale.getDefault())

        val dateString = ScheduleData.schedule[position].tgl
        val parsedDate = inputFormat.parse(dateString)

        val bulan = monthFormat.format(parsedDate)
        val tanggal = dayFormat.format(parsedDate)

        holder.binding.txtTgl.text = tanggal
        holder.binding.txtBulan.text = bulan.toUpperCase(Locale.getDefault())
        holder.binding.txtNama.text = ScheduleData.schedule[position].name
        holder.binding.txtTeam.text = ScheduleData.schedule[position].team.name

        holder.binding.scheduleCard.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailEvent::class.java)
            intent.putExtra("eventname", ScheduleData.schedule[position].name)
            intent.putExtra("eventteam", ScheduleData.schedule[position].team.name)
            intent.putExtra("eventloc", ScheduleData.schedule[position].location)
            intent.putExtra("eventdate", ScheduleData.schedule[position].tgl)
            intent.putExtra("eventgame", ScheduleData.schedule[position].game.name)
            intent.putExtra("eventdesc", ScheduleData.schedule[position].desc)
            intent.putExtra("eventimg", ScheduleData.schedule[position].img)
            holder.itemView.context.startActivity(intent)
        }
    }
}