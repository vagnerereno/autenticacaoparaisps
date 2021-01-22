package com.tcc2.bke_auth4isp.homepage_manager;

import android.content.Context;

public interface HomeManagerContracts {

    interface Router{

        void gotoReadQRCode();
        void gotoManageUsers();

    }

    interface Presenter {

    }

    interface Interactor {

    }

    interface  View {
        Context getContext();
    }
}
