package com.tcc2.bke_auth4isp.homepage_client.presenter;


import com.tcc2.bke_auth4isp.homepage_client.HomeClientContracts;
import com.tcc2.bke_auth4isp.homepage_client.interactor.HomeClientInteractor;

public class HomeClientPresenter implements HomeClientContracts.Presenter {
    HomeClientContracts.Interactor interactor;
    HomeClientContracts.View view;

    public HomeClientPresenter(HomeClientContracts.View view) {
        this.view = view;
        this.interactor = new HomeClientInteractor(this);
    }
}
