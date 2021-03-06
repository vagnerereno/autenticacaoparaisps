package com.tcc2.bke_auth4isp.panel_client_home;

import android.content.Context;

public interface ClientHomeContracts {

    interface Router{
        void gotoGenerateQRCode();
        void gotoReadQRCode();
    }

    interface Presenter {
    }

    interface Interactor {
    }

    interface  View {
        Context getContext();
    }
}
