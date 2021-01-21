package com.tcc2.bke_auth4isp.confirm_authentication.interactor;

import com.tcc2.bke_auth4isp.confirm_authentication.ConfirmAuthenticationContracts;

public class ConfirmAuthenticationInteractor implements ConfirmAuthenticationContracts.Interactor {

    private ConfirmAuthenticationContracts.Presenter presenter;

    public ConfirmAuthenticationInteractor(ConfirmAuthenticationContracts.Presenter presenter) {
        this.presenter = presenter;
    }

}
