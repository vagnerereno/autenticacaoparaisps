package com.tcc2.bke_auth4isp.confirm_authentication;

import android.content.Context;

import com.tcc2.bke_auth4isp.entity.Client;
import com.tcc2.bke_auth4isp.entity.Technician;

public interface ConfirmAuthenticationContracts {


    interface Router{

    }

    interface Presenter {

    }

    interface Interactor {

    }

    interface  View {

        void downloadTechnicianInformation(Technician technician);

        void downloadClientInformation(Client client);

        Context getContext();
    }
}
