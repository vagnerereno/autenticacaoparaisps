package com.tcc2.bke_auth4isp.manage_users;

import android.content.Context;

public interface ManageUsersContracts {

    interface Router{

        void gotoNewUser();
        void gotoListUsers();

    }

    interface Presenter {

    }

    interface Interactor {

    }

    interface  View {
        Context getContext();
    }
}
