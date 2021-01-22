package com.tcc2.bke_auth4isp.login;

import android.content.Context;

public interface LoginContracts {

    interface Router{
        void gotoHomeScreenClient();
        void gotoHomeScreenTechican();
        void gotoHomeScreenManager();
    }

    interface Presenter {

    }

    interface Interactor {

    }

    interface  View {

        Context getContext();
    }

}
