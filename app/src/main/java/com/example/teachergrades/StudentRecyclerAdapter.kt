package com.example.teachergrades

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.teachergrades.model.StudentInfo
import kotlinx.android.synthetic.main.layout_raw_list_item.view.*

class StudentRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items:List<StudentInfo> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TableViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_raw_list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is TableViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(rawList : List<StudentInfo>){
        items = rawList
    }

    class TableViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        val cellName = itemView.name
        val cellGrage = itemView.grade

        fun bind(tableRaw : StudentInfo){
            cellName.setText(tableRaw.name)
            cellGrage.setText(tableRaw.grade)
        }
    }

}