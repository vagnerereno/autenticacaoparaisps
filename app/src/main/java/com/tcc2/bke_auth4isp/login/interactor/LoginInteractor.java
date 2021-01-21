package com.tcc2.bke_auth4isp.login.interactor;

import com.tcc2.bke_auth4isp.login.LoginContracts;

public class LoginInteractor implements LoginContracts.Interactor {

    private LoginContracts.Presenter presenter;

    public LoginInteractor(LoginContracts.Presenter presenter) {
        this.presenter = presenter;
    }

}
