package com.example.application1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class AdapterFragmentList(val list: List<String>) : RecyclerView.Adapter<AdapterFragmentList.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView = itemView.findViewById<TextView>(R.id.list_text)
        val nameButtonView = itemView.findViewById<Button>(R.id.list_button)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.element_list,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = list[position]
        holder.nameButtonView.setOnClickListener {
            Toast.makeText(holder.nameButtonView.context,list[position],Toast.LENGTH_SHORT).show() }

    }
}