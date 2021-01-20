package com.tcc2.bke_auth4isp.manage_users.router;

import android.content.Context;

import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;

public class ManageUsersRouter implements ManageUsersContracts.Router {

    Context mContexto;

    public ManageUsersRouter(Context mContexto) {
        this.mContexto = mContexto;
    }

   private Context getContext() {
        return mContexto;
    }

}
