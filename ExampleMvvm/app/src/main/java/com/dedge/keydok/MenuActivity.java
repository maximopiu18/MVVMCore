package com.dedge.keydok;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.core.mvvm.login.viewmodel.MainViewModel;


public class MenuActivity extends FragmentActivity {


    TextView tv_access_token,tv_expires_in,tv_id_token,tv_refresh_token,tv_token_type,tv_expires_at;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tv_access_token = (TextView)findViewById(R.id.access_token);
        tv_expires_in = (TextView)findViewById(R.id.expires_in);
        tv_expires_at = (TextView)findViewById(R.id.expires_at);
        tv_id_token = (TextView)findViewById(R.id.access_token);
        tv_refresh_token = (TextView)findViewById(R.id.refresh_token);
        tv_token_type = (TextView)findViewById(R.id.token_type);
        getData();
    }

    public void getData(){

        MainViewModel mainViewModel = new MainViewModel();
         mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
         mainViewModel.newsRepository();
         Log.e("mainViewModel", "valores" + mainViewModel.newsRepository().getValue().getAccess_token());

/*        String a = mainViewModel.getNewsRepository().getValue().getAccess_token();
        Log.e("valor","valor:   " +a);*/
    }

}
