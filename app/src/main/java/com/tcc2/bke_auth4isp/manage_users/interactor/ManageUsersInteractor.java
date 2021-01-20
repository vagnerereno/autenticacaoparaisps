package com.tcc2.bke_auth4isp.manage_users.interactor;

import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;

public class ManageUsersInteractor implements ManageUsersContracts.Interactor {

    private ManageUsersContracts.Presenter presenter;

    public ManageUsersInteractor(ManageUsersContracts.Presenter presenter) {
        this.presenter = presenter;
    }
}
