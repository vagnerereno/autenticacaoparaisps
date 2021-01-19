package com.tcc2.bke_auth4isp.manage_users.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;

public class ActivityManageUsers extends AppCompatActivity implements ManageUsersContracts.View {

    private Activity activity;
    Button buttonNewUser;
    Button buttonViewUser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.before_manage_users);
        activity = this;
        buttonNewUser = findViewById(R.id.buttonNewUser);
        buttonViewUser = findViewById(R.id.buttonViewUser);

        buttonNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO abrir ActivityNewUser
            }
        });
        buttonViewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // @TODO abrir lista de usuários AdapterListUsers
            }
        }
        );
    }

}
