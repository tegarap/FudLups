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

            dialog.bt_min?.setOnClickListener {
                val number = Integer.parseInt(dialog.tv_stock2.text.toString()) - 1
                if(number < 1){
                    dialog.bt_min.isEnabled = false
                } else if(number >= 1) {
                    dialog.bt_min.isEnabled = true
                }
                dialog.tv_stock2.text = number.toString()
            }
            dialog.bt_plus?.setOnClickListener {
                val number = Integer.parseInt(dialog.tv_stock2.text.toString()) + 1
                dialog.tv_stock2.text = number.toString()
            }

            val number = Integer.parseInt(dialog.tv_stock2.text.toString())
            if (number < 1) {
                dialog.bt_keranjang.setVisibility(View.GONE)
                dialog.bt_backtomenu.setVisibility(View.VISIBLE)
            }else if(number >= 1){
                dialog.bt_backtomenu.setVisibility(View.GONE)
                dialog.bt_keranjang.setVisibility(View.VISIBLE)
            }

            dialog.show()
        }


    }


}