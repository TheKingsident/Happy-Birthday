package com.thekingsident.happybirthdayhannah.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thekingsident.happybirthdayhannah.R
import com.thekingsident.happybirthdayhannah.model.LoveDeclaration

class LoveDeclarationAdapter (
        private val context: Context,
        private val dataset: List<LoveDeclaration>
) : RecyclerView.Adapter<LoveDeclarationAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.birthday_wish)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.love_declaratioin_list, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
}
