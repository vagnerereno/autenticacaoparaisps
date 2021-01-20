package com.tcc2.bke_auth4isp.homepage_manager.presenter;

import com.tcc2.bke_auth4isp.homepage_manager.HomeManagerContracts;
import com.tcc2.bke_auth4isp.homepage_manager.interactor.HomeManagerInteractor;

public class HomeManagerPresenter implements HomeManagerContracts.Presenter {
    HomeManagerContracts.Interactor interactor;
    HomeManagerContracts.View view;

    public HomeManagerPresenter(HomeManagerContracts.View view) {
        this.view = view;
        this.interactor = new HomeManagerInteractor(this);
    }
}
