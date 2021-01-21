package com.tcc2.bke_auth4isp.homepage_manager.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.homepage_manager.HomeManagerContracts;
import com.tcc2.bke_auth4isp.homepage_manager.presenter.HomeManagerPresenter;
import com.tcc2.bke_auth4isp.homepage_manager.router.HomeManageRouter;

public class ActivityHomeManager extends AppCompatActivity implements HomeManagerContracts.View {

    HomeManagerContracts.Presenter presenter;
    HomeManagerContracts.Router router;
    private Activity activity;
    Button buttonManageUsers;
    Button buttonAuthentication;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen_manager);
        presenter = new HomeManagerPresenter(this);
        router = new HomeManageRouter(getContext());
        activity = this;
        buttonManageUsers = findViewById(R.id.buttonNewUser);
        buttonAuthentication = findViewById(R.id.buttonViewUser);

        buttonManageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO abrir tela ActivityManageUsers
            }
        });
        buttonAuthentication.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  // @TODO abrir leitor de QR Code.
              }
          }
        );
    }

    @Override
    public Context getContext() {
        return null;
    }
}
