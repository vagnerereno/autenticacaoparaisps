package com.tcc2.bke_auth4isp.manage_users.router;

import android.content.Context;
import android.content.Intent;

import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;
import com.tcc2.bke_auth4isp.manage_users.view.ActivityNewUser;
import com.tcc2.bke_auth4isp.manage_users.view.AdapterListUsers;

public class ManageUsersRouter implements ManageUsersContracts.Router {

    Context mContexto;

    public ManageUsersRouter(Context mContexto) {
        this.mContexto = mContexto;
    }

    public void gotoNewUser(){
        Intent i = new Intent(mContexto, ActivityNewUser.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContexto.startActivity(i);
    }

    public void gotoListUsers(){
        Intent i = new Intent(mContexto, AdapterListUsers.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContexto.startActivity(i);
    }

   private Context getContext() {
        return mContexto;
    }

}
