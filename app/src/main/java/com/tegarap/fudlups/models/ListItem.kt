package com.tegarap.fudlups.models

data class ListItem(
    val name: String,
    val price: String,
    val foto: String,
    val barcode: String,
    val quantity: String
)

data class ListItemResponse(
    val result: ArrayList<ListItem>
)
