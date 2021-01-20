package com.tcc2.bke_auth4isp.homepage_manager.interactor;

import com.tcc2.bke_auth4isp.homepage_manager.HomeManagerContracts;

public class HomeManagerInteractor implements HomeManagerContracts.Interactor {

    private HomeManagerContracts.Presenter presenter;

    public HomeManagerInteractor(HomeManagerContracts.Presenter presenter) {
        this.presenter = presenter;
    }

}
