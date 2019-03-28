package com.tegarap.fudlups.rest

import com.tegarap.fudlups.models.ListItemResponse
import com.tegarap.fudlups.models.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface InterfacePoint {

    @GET("testapi")
    fun login(
        @Query("username") username:String,
        @Query("password") password:String
    ): Call<UserResponse>

    @GET("home")
    fun listItem(): Call<ListItemResponse>

}