package com.tegarap.fudlups.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.tegarap.fudlups.R
import com.tegarap.fudlups.common.VerticalSpaceItem
import com.tegarap.fudlups.models.Adapter
import com.tegarap.fudlups.models.ListItem
import com.tegarap.fudlups.models.ListItemResponse
import com.tegarap.fudlups.rest.EndPoint
import com.tegarap.fudlups.rest.InterfacePoint
import com.tegarap.fudlups.viewholder.ListItemVH
import kotlinx.android.synthetic.main.fragment_popup_order.*
import kotlinx.android.synthetic.main.fragment_store.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PopupOrder : Fragment() {
    companion object {

        fun getIntent(ctx : Context?) = Intent(ctx, PopupOrder::class.java)

    }

    //private lateinit var listAdapter : Adapter<ListItem, ListItemVH>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popup_order, container, false)

//        val stock = tv_stock2.text.toString()
//
//        if (stock.toInt() <= 1){
//            bt_min.isClickable = false
//            tv_stock2.text = "2"
//        }else{
//            bt_min.isClickable = true
//            val haha = stock.toInt()
//            haha +=1
//        }


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//
//        listAdapter = object : Adapter<ListItem, ListItemVH>(
//            R.layout.item_list,
//            arrayListOf(),
//            ListItemVH::class.java,
//            ListItem::class.java
//        ){
//            override fun bindView(holder: ListItemVH, model: ListItem, position: Int) {
//                holder.bind(model)
//            }
//
//        }
//
//        rv_list_item?.apply {
//            adapter = listAdapter
//            layoutManager = LinearLayoutManager(context)
//            addItemDecoration(VerticalSpaceItem(context, 5f, 2f))
//        }
//
//        EndPoint.client.create(InterfacePoint::class.java).listItem().enqueue(object : Callback<ListItemResponse> {
//            override fun onResponse(call: Call<ListItemResponse>, response: Response<ListItemResponse>) {
//
//                if(response.isSuccessful) listAdapter.updateList(response.body()!!.result)
//
//            }
//
//            override fun onFailure(call: Call<ListItemResponse>, t: Throwable) {
//
//            }
//        })


    }
}
