package com.tcc2.bke_auth4isp.homepage_client.router;

import android.content.Context;

import com.tcc2.bke_auth4isp.homepage_client.HomeClientContracts;

public class HomeClientRouter implements HomeClientContracts.Router {

    Context mContexto;

    public HomeClientRouter(Context mContexto) {
        this.mContexto = mContexto;
    }


    private Context getContext() {
        return mContexto;
    }

}
