package com.example.viewpagertrial2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersAdapter(private val onItemClick: (Int) -> Unit) : RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>() {

    private val numbers = (1..10).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_number, parent, false)
        return NumberViewHolder(view)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = numbers[position]
        holder.bind(number)
        holder.itemView.setOnClickListener {
            onItemClick(number)
        }
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    inner class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewNumber: TextView = itemView.findViewById(R.id.textViewNumber)

        fun bind(number: Int) {
            textViewNumber.text = number.toString()
        }
    }
}
