package com.tegarap.fudlups.viewholder

import android.app.Dialog
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.tegarap.fudlups.R
import com.tegarap.fudlups.models.ListItem
import kotlinx.android.synthetic.main.fragment_popup_order.*
import kotlinx.android.synthetic.main.item_list.view.*
import kotlinx.android.synthetic.main.fragment_popup_order.*
import kotlinx.android.synthetic.main.fragment_popup_order.view.*

class ListItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data: ListItem) {

        itemView.tv_name?.text = data.name
        itemView.tv_stock?.text = "Stock : " + data.quantity
        itemView.tv_price?.text = "Rp. " + data.price

        itemView.iv_product?.apply {

            Glide.with(this)
                .load("https://saptorenggo-pakis.com/api/poslite/assets/gambar/" + data.foto)
                .into(this)

        }

        itemView.bt_order?.setOnClickListener {

            val dialog = Dialog(itemView.context)
            dialog.setContentView(R.layout.fragment_popup_order)
            dialog.tv_namabarang?.text = data.name

//            val stock = dialog.tv_stock2.text.toString()
//
//            if (stock.toInt() <= 0) {
//                dialog.bt_min.isEnabled = false
//                dialog.tv_stock2.text = "1"
//            } else {
//                dialog.bt_min.isEnabled = true
//                dialog.bt_plus?.setOnClickListener {
//                    val haha = stock.toInt()
//                    haha +=1
//                }
//
//            }

            dialog.show()
        }

    }


}