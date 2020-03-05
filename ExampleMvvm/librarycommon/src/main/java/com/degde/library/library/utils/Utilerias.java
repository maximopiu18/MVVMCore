package com.degde.library.library.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class Utilerias {
    public void openActivity(Context context, Class cl){
        Intent intent = new Intent(context, cl);
        context.startActivity(intent);
        ((Activity)context).finish();
    }
    public void showMessageError(Context context){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
        builder1.setTitle("Alerta");
        builder1.setMessage("Problemas de conectividad");
        builder1.setCancelable(true);

        builder1.setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder1.create();
        alert.show();
    }
}
