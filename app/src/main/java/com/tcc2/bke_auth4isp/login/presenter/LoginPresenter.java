package com.tcc2.bke_auth4isp.login.presenter;

import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.login.LoginContracts;
import com.tcc2.bke_auth4isp.login.interactor.LoginInteractor;

public class LoginPresenter implements LoginContracts.Presenter {

    LoginContracts.Interactor interactor;
    LoginContracts.View view;

    public LoginPresenter(LoginContracts.View view) {
        this.view = view;
        this.interactor = new LoginInteractor(this);
    }

    @Override
    public void requestLogin(String username, String password) {
        System.out.println("Cliclou Presenter");
        interactor.verifyLogin(username, password);
    }

    @Override
    public void onLoginSucess(Person person) {
        YLog.d("LoginPresenter", "onLoginSucess", "Usuário autenticado com sucesso: "+ person.getUsername() + "");
        view.onLoginSucess(person);
    }

    @Override
    public void onLoginError(String message) {
        YLog.d("LoginPresenter", "onLoginError", message);
        view.onLoginError(message);
    }
}
