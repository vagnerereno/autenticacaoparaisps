package com.tcc2.bke_auth4isp.homepage_manager.router;

import android.content.Context;

import com.tcc2.bke_auth4isp.homepage_manager.HomeManagerContracts;

public class HomeManageRouter implements HomeManagerContracts.Router {

    Context mContexto;

    public HomeManageRouter(Context mContexto) {
        this.mContexto = mContexto;
    }


    private Context getContext() {
        return mContexto;
    }

}
