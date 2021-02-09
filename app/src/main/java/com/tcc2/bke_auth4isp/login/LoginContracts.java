package com.tcc2.bke_auth4isp.login;

import android.content.Context;

import com.tcc2.bke_auth4isp.entity.Person;

public interface LoginContracts {

    interface Router{
        void gotoHomeScreenClient(Person person);
        void gotoHomeScreenTechican();
        void gotoHomeScreenManager();
    }

    interface Presenter {
        void requestLogin(String username, String password);
        void onLoginSucess(Person person);
        void onLoginError(String message);
    }

    interface Interactor {
        void verifyLogin(String username, String password);

    }

    interface  View {
       Context getContext();
       void onLoginSucess(Person person);
       void onLoginError(String message);
    }

}
