package com.tegarap.fudlups.viewholder

import android.app.Dialog
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.tegarap.fudlups.R
import com.tegarap.fudlups.models.ListItem
import kotlinx.android.synthetic.main.item_list.view.*
import kotlinx.android.synthetic.main.popup_pesan.*

class ListItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data : ListItem){

        itemView.tv_name?.text = data.name
        itemView.tv_stock?.text = "Stock : "+data.quantity
        itemView.tv_price?.text = "Rp. "+data.price

        itemView.iv_product?.apply {

            Glide.with(this)
                .load("https://saptorenggo-pakis.com/api/poslite/assets/gambar/"+data.foto)
                .into(this)

        }

        itemView.bt_order?.setOnClickListener {

            val dialog = Dialog(itemView.context)
            dialog.setContentView(R.layout.popup_pesan)
            dialog.tv_namabarang?.text = data.name
            dialog.show()
        }

    }


}