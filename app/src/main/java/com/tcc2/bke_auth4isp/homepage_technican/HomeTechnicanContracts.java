package com.tcc2.bke_auth4isp.homepage_technican;

import android.content.Context;

public interface HomeTechnicanContracts {

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
