package com.tcc2.bke_auth4isp.manage_users.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;
import com.tcc2.bke_auth4isp.manage_users.presenter.ManageUsersPresenter;
import com.tcc2.bke_auth4isp.manage_users.router.ManageUsersRouter;

public class ActivityManageUsers extends AppCompatActivity implements ManageUsersContracts.View {

    ManageUsersContracts.Presenter presenter;
    ManageUsersContracts.Router router;
    private Activity activity;
    Button buttonNewUser;
    Button buttonViewUser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.before_manage_users);
        activity = this;
        Toolbar toolbar = findViewById(R.id.toolbarMenu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        buttonNewUser = findViewById(R.id.buttonNewUser);
        buttonViewUser = findViewById(R.id.buttonViewUser);
        router = new ManageUsersRouter(getContext());
        presenter = new ManageUsersPresenter(this);

        buttonNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                router.gotoNewUser();
            }
        });
        buttonViewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                router.gotoListUsers();
            }
        }
        );
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
