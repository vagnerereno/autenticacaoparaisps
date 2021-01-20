package com.tcc2.bke_auth4isp.manage_users.presenter;

import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;
import com.tcc2.bke_auth4isp.manage_users.interactor.ManageUsersInteractor;

public class ManageUsersPresenter implements ManageUsersContracts.Presenter {

    ManageUsersContracts.Interactor interactor;
    ManageUsersContracts.View view;

    public ManageUsersPresenter (ManageUsersContracts.View view) {
        this.view = view;
        this.interactor = new ManageUsersInteractor(this);
    }
}
