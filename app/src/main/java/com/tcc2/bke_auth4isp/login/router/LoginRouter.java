package com.tcc2.bke_auth4isp.login.router;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.homepage_client.view.ActivityHomeClient;
import com.tcc2.bke_auth4isp.homepage_manager.view.ActivityHomeManager;
import com.tcc2.bke_auth4isp.homepage_technican.view.ActivityHomeTechnican;
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

    public void gotoHomeScreenClient(Person person){

        Intent i = new Intent(mContexto, ActivityHomeClient.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("PERSON", person);
        i.putExtras(bundle);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContexto.startActivity(i);
    }

    public void gotoHomeScreenTechican(){
        Intent i = new Intent(getContext(), ActivityHomeTechnican.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(i);
    }

    public void gotoHomeScreenManager(){
        Intent i = new Intent(getContext(), ActivityHomeManager.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(i);
    }

}
