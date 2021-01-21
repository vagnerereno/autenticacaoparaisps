package com.tcc2.bke_auth4isp.confirm_authentication.presenter;


import com.tcc2.bke_auth4isp.confirm_authentication.ConfirmAuthenticationContracts;
import com.tcc2.bke_auth4isp.confirm_authentication.interactor.ConfirmAuthenticationInteractor;

public class ConfirmAuthenticationPresenter implements ConfirmAuthenticationContracts.Presenter {
    ConfirmAuthenticationContracts.Interactor interactor;
    ConfirmAuthenticationContracts.View view;

    public ConfirmAuthenticationPresenter(ConfirmAuthenticationContracts.View view) {
        this.view = view;
        this.interactor = new ConfirmAuthenticationInteractor(this);
    }
}
