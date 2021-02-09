package com.tcc2.bke_auth4isp.manage_users.interactor;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;

public class ManageUsersInteractor implements ManageUsersContracts.Interactor {

    private ManageUsersContracts.Presenter presenter;
    private DatabaseReference mDatabase;

    public ManageUsersInteractor(ManageUsersContracts.Presenter presenter) {
        this.presenter = presenter;
        this.mDatabase = FirebaseDatabase.getInstance().getReference();
    }
}
