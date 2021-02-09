package com.tcc2.bke_auth4isp.login.interactor;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.common.CommonDatabaseReferences;
import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.login.LoginContracts;

public class LoginInteractor implements LoginContracts.Interactor {

    private LoginContracts.Presenter presenter;

    public LoginInteractor(LoginContracts.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void verifyLogin(String username, String password) {
        CommonDatabaseReferences.getLoginReference(username).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                YLog.d("LoginInteractor", "onDataChange", "Iniciou verificação de login: " + snapshot.getRef());
                try {
                    Person person = snapshot.getValue(Person.class);
                    YLog.d("LoginInteractor", "onDataChange", "Iniciou try verificação do login" + person.getUsername());
                    presenter.onLoginSucess(person);
                } catch (Exception e){
                    presenter.onLoginError(e.getLocalizedMessage());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                presenter.onLoginError(error.getMessage());
            }
        });
    }
}
