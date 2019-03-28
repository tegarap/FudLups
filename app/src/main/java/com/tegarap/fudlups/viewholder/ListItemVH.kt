package com.tegarap.fudlups.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.tegarap.fudlups.models.ListItem
import kotlinx.android.synthetic.main.item_list.view.*

class ListItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data : ListItem){

        itemView.tv_name?.text = data.name
        itemView.tv_barcode?.text = data.barcode
        itemView.tv_price?.text = data.price

    }


}