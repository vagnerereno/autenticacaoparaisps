package com.tcc2.bke_auth4isp.panel_client_home.presenter;

import com.tcc2.bke_auth4isp.panel_client_home.ClientHomeContracts;
import com.tcc2.bke_auth4isp.panel_client_home.interactor.PanelClientHomeInteractor;

public class PanelClientHomePresenter implements ClientHomeContracts.Presenter {

    ClientHomeContracts.Interactor interactor;
    ClientHomeContracts.View view;

    public PanelClientHomePresenter(ClientHomeContracts.View view) {
        this.view = view;
        this.interactor = new PanelClientHomeInteractor(this);
    }
}
