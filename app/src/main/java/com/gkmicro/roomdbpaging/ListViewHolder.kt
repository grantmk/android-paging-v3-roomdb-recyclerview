package com.gkmicro.roomdbpaging

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder (parent : ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)) {

    private val nameView = itemView.findViewById<TextView>(R.id.name)
    var storedObject: StoredObject? = null

    fun bindTo(storedObject: StoredObject?) {
        this.storedObject = storedObject
        nameView.text = storedObject?._id.toString()
    }
}