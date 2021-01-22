package com.tcc2.bke_auth4isp.homepage_technican.router;

import android.content.Context;
import android.content.Intent;

import com.tcc2.bke_auth4isp.QRCode.ActivityGenerateQRCode;
import com.tcc2.bke_auth4isp.QRCode.ActivityReadQRCode;
import com.tcc2.bke_auth4isp.homepage_technican.HomeTechnicanContracts;


public class HomeTechnicanRouter implements HomeTechnicanContracts.Router {

    Context mContexto;

    public HomeTechnicanRouter(Context mContexto) {
        this.mContexto = mContexto;
    }

    public void gotoGenerateQRCode(){
        Intent i = new Intent(mContexto, ActivityGenerateQRCode.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContexto.startActivity(i);
    }

    public void gotoReadQRCode(){
        Intent i = new Intent(mContexto, ActivityReadQRCode.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContexto.startActivity(i);
    }

    private Context getContext() {
        return mContexto;
    }

}
