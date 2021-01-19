package com.tcc2.bke_auth4isp.manage_users.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.tcc2.bke_auth4isp.R;

public class ActivityNewUser extends AppCompatActivity {
    private Activity activity;
    Button buttonConfirmRegister;
    EditText name;
    EditText cpf;
    EditText phone;
    EditText username;
    EditText account;
    EditText confirmAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user);
        activity = this;
        buttonConfirmRegister = findViewById(R.id.buttonCreateNewUser);
        name = findViewById(R.id.nameNewUser);
        cpf = findViewById(R.id.cpfNewUser);
        phone = findViewById(R.id.phoneNewUser);
        username = findViewById(R.id.userNewUser);
        account = findViewById(R.id.accountNewUser);
        confirmAccount = findViewById(R.id.repeatAccountNewUser);

        buttonConfirmRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // @TODO salvar os dados de um novo usuário.
            }
        });
    }
}
