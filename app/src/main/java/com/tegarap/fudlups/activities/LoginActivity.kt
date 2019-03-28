package com.tegarap.fudlups.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.tegarap.fudlups.R
import com.tegarap.fudlups.models.UserResponse
import com.tegarap.fudlups.rest.EndPoint
import com.tegarap.fudlups.rest.InterfacePoint
import com.tegarap.fudlups.utils.PrefsUtil
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {


    private val prefs by lazy { PrefsUtil(this) }
    private lateinit var iPoint: InterfacePoint
    private lateinit var user: UserResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupToolbar()

        iPoint = EndPoint.client.create(InterfacePoint::class.java)
        btn_login.setOnClickListener {
            login()
        }
    }

    private fun setupToolbar() {
        val actionBar = supportActionBar
        actionBar!!.hide()
    }

    fun login() {
        iPoint.login(et_email.text.toString(), et_password.text.toString()).enqueue(object : Callback<UserResponse> {
            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Snackbar.make(btn_login, "No Response", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }

            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if (response.isSuccessful) {
                    user = response.body()!!
                    prefs.saveUser(user)
                    startActivity(MainActivity.getIntent(this@LoginActivity))
                    finish()
                } else {
                    Snackbar.make(btn_login, "Login Kurang berhasil", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }

            }

        })
    }


}
