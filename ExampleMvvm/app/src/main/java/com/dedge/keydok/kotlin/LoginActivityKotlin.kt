package com.dedge.keydok.kotlin

import android.content.Intent
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.core.mvvm.login.model.ModelLoginResponse
import com.core.mvvm.login.viewmodel.MainViewModel
import com.dedge.keydok.MenuActivity
import com.dedge.keydok.R
import java.io.UnsupportedEncodingException

/*import com.degde.library.library.login.model.ModelLoginResponse
import com.degde.library.library.login.viewmodels.MainViewModel
import java.io.UnsupportedEncodingException*/


class LoginActivityKotlin : AppCompatActivity() {
    var edUser: EditText? = null
    var edPass: EditText? = null
    var btnIniciarSesion: Button? = null
    var mainVieeModel: MainViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_kt)
        edUser = findViewById<View>(R.id.ed_usuario) as EditText
        edPass = findViewById<View>(R.id.ed_contrasena) as EditText
        btnIniciarSesion = findViewById<View>(R.id.activity_login_btn_iniciar) as Button
        btnIniciarSesion!!.setOnClickListener {
            initRest()
        }
    }

    fun initRest() {
        mainVieeModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        mainVieeModel!!.initRequest()
        mainVieeModel!!.newsRepository()!!.observe(this, object : Observer<ModelLoginResponse?> {
            override fun onChanged(t: ModelLoginResponse?) {
                val intent = Intent(this@LoginActivityKotlin, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }
        })
    }
    fun StringToBase64(myCadena:String ) {
        var data: ByteArray? = null
        var base64 = "vacio"
        try {
            data = myCadena.toByteArray(charset("UTF-8"))
            base64 = Base64.encodeToString(data, Base64.DEFAULT)
        } catch (e: UnsupportedEncodingException) {
            e.printStackTrace()
        }
        Log.e("Base 64 ", "base: $base64")
    }
}
