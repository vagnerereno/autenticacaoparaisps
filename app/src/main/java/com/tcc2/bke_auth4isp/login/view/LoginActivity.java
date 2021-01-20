package com.tcc2.bke_auth4isp.login.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.login.LoginContracts;

public class LoginActivity extends AppCompatActivity implements LoginContracts.View {

    private Activity activity;
    EditText username;
    EditText password;
    Button buttonConfirmLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        activity = this;
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        buttonConfirmLogin = findViewById(R.id.buttonLogin);

        buttonConfirmLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO Conferir credenciais e redirecionar para a próxima página.
            }
        });
    }
    //TODO FAZER método para checar credenciais do usuário.
    public void checkUser(String username, String password) {
    }
}
