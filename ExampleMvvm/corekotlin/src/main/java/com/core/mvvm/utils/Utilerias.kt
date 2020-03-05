package com.core.mvvm.utils

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent


class Utilerias {
    fun openActivity(context: Context, cl: Class<*>?) {
        val intent = Intent(context, cl)
        context.startActivity(intent)
        (context as Activity).finish()
    }

    fun showMessageError(context: Context?) {
        val builder1 = AlertDialog.Builder(context)
        builder1.setTitle("Alerta")
        builder1.setMessage("Problemas de conectividad")
        builder1.setCancelable(true)
        builder1.setPositiveButton("Entendido") { dialog, id -> dialog.cancel() }
        val alert = builder1.create()
        alert.show()
    }
}
