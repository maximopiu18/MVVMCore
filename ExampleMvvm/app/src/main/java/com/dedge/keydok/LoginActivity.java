package com.dedge.keydok;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.degde.library.library.login.model.ModelLoginResponse;
import com.degde.library.library.login.viewmodels.MainViewModel;

import java.io.UnsupportedEncodingException;


public class LoginActivity extends FragmentActivity {

    EditText edUser, edPass;
    Button btnIniciarSesion;
    MainViewModel mainVieeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUser=(EditText)findViewById(R.id.ed_usuario);
        edPass =(EditText)findViewById(R.id.ed_contrasena);
        btnIniciarSesion =(Button)findViewById(R.id.activity_login_btn_iniciar);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initRest();
            }
        });
        StringToBase64();
    }

    public void initRest(){

        mainVieeModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainVieeModel.initRequest();
        mainVieeModel.getNewsRepository().observe(this, new Observer<ModelLoginResponse>() {
            @Override
            public void onChanged(ModelLoginResponse modelLoginResponse) {
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void StringToBase64(){
        byte[] data=null;
        String str = "xyzstring";
        String base64="vacio";
        try {
            data = str.getBytes("UTF-8");
            base64 = Base64.encodeToString(data, Base64.DEFAULT);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Log.e("Base 64 ", "base: "+base64);
    }




}
