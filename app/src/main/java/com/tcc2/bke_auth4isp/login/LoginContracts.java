package com.tcc2.bke_auth4isp.login;

import android.content.Context;

import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.entity.User;

public interface LoginContracts {

    interface Router{
        void gotoHomeScreenClient(Person person);
        void gotoHomeScreenTechican(Person person);
        void gotoHomeScreenManager(Person person);
    }

    interface Presenter {
        void requestLogin(String username, String password);

        void authenticateLogin(String password, User user);

        void onLoginSucess(Person person);
        void onLoginError(String message);
    }

    interface Interactor {
        void verifyLogin(String username, String password);

        void downloadProfile(String username, String role);
    }

    interface  View {
       Context getContext();
       void onLoginError(String message);
    }

}
