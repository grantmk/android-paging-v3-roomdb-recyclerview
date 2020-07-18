package com.gkmicro.roomdbpaging
import android.util.Log
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil

class ListAdapter(): PagingDataAdapter<StoredObject, ListViewHolder>(DIFF_CALLBACK) {

    private val LOG_TAG = "listadapter"

    companion object {
        private val DIFF_CALLBACK = object :
            DiffUtil.ItemCallback<StoredObject>() {

            init {
                Log.d("listadapter", "DIFF UTIL created")
            }

            override fun areItemsTheSame(old: StoredObject, new: StoredObject) = old._id == new._id

            override fun areContentsTheSame(old: StoredObject, new: StoredObject) = old == new
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        //Log.d(LOG_TAG, "CREATE viewholder ")
        return ListViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        //Log.d(LOG_TAG, "BIND item at position: $position")
        holder.bindTo(getItem(position))
    }
}