package com.tcc2.bke_auth4isp.homepage_manager.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.homepage_manager.HomeManagerContracts;
import com.tcc2.bke_auth4isp.homepage_manager.presenter.HomeManagerPresenter;
import com.tcc2.bke_auth4isp.homepage_manager.router.HomeManageRouter;

public class ActivityHomeManager extends AppCompatActivity implements HomeManagerContracts.View {

    HomeManagerContracts.Presenter presenter;
    HomeManagerContracts.Router router;
    private Activity activity;
    Button buttonManageUsers;
    Button buttonAuthentication;
    Person person;
    TextView manager_name;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen_manager);
        presenter = new HomeManagerPresenter(this);
        router = new HomeManageRouter(getContext());
        person = (Person) getIntent().getSerializableExtra("PERSON");
        activity = this;
        buttonManageUsers = findViewById(R.id.buttonManageUsers);
        buttonAuthentication = findViewById(R.id.buttonAuthentication);
        manager_name = findViewById(R.id.manager_name);
        manager_name.setText("Olá, " + person.getName());


        buttonManageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                router.gotoManageUsers();
            }
        });
        buttonAuthentication.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  router.gotoReadQRCode();
              }
          }
        );
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
