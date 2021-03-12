package com.example.worldcinema.common.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcinematv.R
import com.mrz.worldcinema.constants.Constants
import kotlinx.android.synthetic.main.activity_main_screen.*
import kotlinx.android.synthetic.main.item_tags.view.*
import kotlinx.android.synthetic.main.item_with_text.view.*


class TagsAdapter: RecyclerView.Adapter<TagsAdapter.MyViewHolder>() {

    private var myList = emptyList<String>()

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_tags, parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemView.tvTag.text = myList[position]
        Log.d("testGif", myList.size.toString())

    }

    fun setData(newList: List<String>) {
        myList = newList
        notifyDataSetChanged()
    }

}