package com.tcc2.bke_auth4isp.panel_client_home.interactor;

import com.tcc2.bke_auth4isp.panel_client_home.ClientHomeContracts;

public class PanelClientHomeInteractor implements ClientHomeContracts.Interactor {
    private ClientHomeContracts.Presenter presenter;

    public PanelClientHomeInteractor(ClientHomeContracts.Presenter presenter) {
        this.presenter = presenter;
    }
}
