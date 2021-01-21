package com.tcc2.bke_auth4isp.homepage_technican.router;

import android.content.Context;

import com.tcc2.bke_auth4isp.homepage_technican.HomeTechnicanContracts;


public class HomeTechnicanRouter implements HomeTechnicanContracts.Router {

    Context mContexto;

    public HomeTechnicanRouter(Context mContexto) {
        this.mContexto = mContexto;
    }


    private Context getContext() {
        return mContexto;
    }

}
