package com.nmp.projectnmp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nmp.projectnmp.AchievementAdapter.AchievementViewHolder
import com.nmp.projectnmp.databinding.CardviewAchievementBinding
import com.nmp.projectnmp.databinding.CardviewTeammemberBinding
import java.util.Locale

class MemberAdapter(private var members: Array<Member>) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {
    class MemberViewHolder(val binding: CardviewTeammemberBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val binding = CardviewTeammemberBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return MemberViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.binding.imgProfile.setImageResource(members[position].imageId)
        holder.binding.txtNama.text = members[position].name
        holder.binding.txtRole.text = members[position].role
    }
}