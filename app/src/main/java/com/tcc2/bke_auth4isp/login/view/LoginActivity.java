package com.tcc2.bke_auth4isp.login.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.login.LoginContracts;
import com.tcc2.bke_auth4isp.login.presenter.LoginPresenter;
import com.tcc2.bke_auth4isp.login.router.LoginRouter;

public class LoginActivity extends AppCompatActivity implements LoginContracts.View {

    LoginContracts.Presenter presenter;
    LoginContracts.Router router;
    private Activity activity;
    EditText username;
    EditText password;
    Button buttonConfirmLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        router = new LoginRouter(getContext());
        presenter = new LoginPresenter(this, router);
        activity = this;
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        buttonConfirmLogin = findViewById(R.id.buttonLogin);
        buttonConfirmLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Clicou:" + username.getText().toString() + password.getText().toString());
                presenter.requestLogin(username.getText().toString(), password.getText().toString());
                //TODO Conferir credenciais e redirecionar para a próxima página.
            }
        });
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    @Override
    public void onLoginError(String message) {
        // @TODO IMPLEMENTAR EXIBIÇÃO DO DIÁLOGO.
    }
}
