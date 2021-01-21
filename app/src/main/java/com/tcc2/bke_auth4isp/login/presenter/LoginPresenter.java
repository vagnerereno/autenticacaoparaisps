package com.tcc2.bke_auth4isp.login.presenter;

import com.tcc2.bke_auth4isp.login.LoginContracts;
import com.tcc2.bke_auth4isp.login.interactor.LoginInteractor;

public class LoginPresenter implements LoginContracts.Presenter {

    LoginContracts.Interactor interactor;
    LoginContracts.View view;

    public LoginPresenter(LoginContracts.View view) {
        this.view = view;
        this.interactor = new LoginInteractor(this);
    }

}
