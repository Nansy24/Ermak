package com.anasteisiamarionkina.ermak

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkItemAdapter: RecyclerView.Adapter<WorkItemAdapter.WorkItemViewHolder> () {

    val workItemList = arrayOf(
        WorkItem(R.drawable.work_item_1, "303 кв. м.", "286 000 000 руб."),
        WorkItem(R.drawable.work_item_2, "500 кв. м.", "360 000 000 руб."),
        WorkItem(R.drawable.work_item_3, "676 кв. м.", "300 000 000 руб."),
        WorkItem(R.drawable.work_item_4, "693 кв. м.", "435 000 000 руб."),
        WorkItem(R.drawable.work_item_5, "802 кв. м.", "500 000 000 руб."),
        WorkItem(R.drawable.work_item_6, "1350 кв. м.", "530 000 000 руб."),
        WorkItem(R.drawable.work_item_7, "2000 кв. м.", "420 000 000 руб.")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_works, parent, false)
        return WorkItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return workItemList.size
    }

    override fun onBindViewHolder(holder: WorkItemViewHolder, position: Int) {
        holder.bind(workItemList[position])
    }

    class WorkItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageId = itemView.findViewById<ImageView>(R.id.image_view_item)
        val square = itemView.findViewById<TextView>(R.id.text_view_item_square)
        val price = itemView.findViewById<TextView>(R.id.text_view_item_price)

        fun bind(workItem: WorkItem) {
            imageId.setImageResource(workItem.imageId)
            square.text = workItem.square
            price.text = workItem.price
        }
    }
}