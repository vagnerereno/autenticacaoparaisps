package com.tcc2.bke_auth4isp.panel_client_home.router;

import android.content.Context;
import android.content.Intent;

import com.tcc2.bke_auth4isp.QRCode.ActivityGenerateQRCode;
import com.tcc2.bke_auth4isp.QRCode.ActivityReadQRCode;
import com.tcc2.bke_auth4isp.panel_client_home.ClientHomeContracts;

public class PanelClientHomeRouter implements ClientHomeContracts.Router {

    Context mContexto;

    public PanelClientHomeRouter(Context mContexto) {
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
}
