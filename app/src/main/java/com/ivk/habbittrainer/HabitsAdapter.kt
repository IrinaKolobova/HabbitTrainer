package com.ivk.habbittrainer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {

    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)
    
    // Create a new ViewHolder object
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    override fun getItemCount(): Int = habits.size

    // Specifies the contents for the shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        val habit = habits[position]
        holder.card.tv_title.text = habit.title
        holder.card.tv_description.text = habit.description
        holder.card.iv_icon.setImageResource(habit.image)
    }
}