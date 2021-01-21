package com.tcc2.bke_auth4isp.login.router;

import android.content.Context;
import android.content.Intent;

import com.tcc2.bke_auth4isp.homepage_client.view.ActivityHomeClient;
import com.tcc2.bke_auth4isp.login.LoginContracts;

public class LoginRouter implements LoginContracts.Router {

    Context mContexto;

    public LoginRouter(Context mContexto) {
        this.mContexto = mContexto;
    }

    LoginContracts.View view;

    private Context getContext() {
        return mContexto;
    }

    public void gotoHomeScreenClient(){
        Intent i = new Intent(mContexto, ActivityHomeClient.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContexto.startActivity(i);
    }
}
