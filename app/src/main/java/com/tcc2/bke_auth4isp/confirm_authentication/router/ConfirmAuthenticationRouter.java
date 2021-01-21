package com.tcc2.bke_auth4isp.confirm_authentication.router;

import android.content.Context;

import com.tcc2.bke_auth4isp.confirm_authentication.ConfirmAuthenticationContracts;

public class ConfirmAuthenticationRouter implements ConfirmAuthenticationContracts.Router {

    Context mContexto;

    public ConfirmAuthenticationRouter(Context mContexto) {
        this.mContexto = mContexto;
    }


    private Context getContext() {
        return mContexto;
    }

}
