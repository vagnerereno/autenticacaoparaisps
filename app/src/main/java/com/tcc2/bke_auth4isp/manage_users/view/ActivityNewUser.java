package com.tcc2.bke_auth4isp.manage_users.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;
import com.tcc2.bke_auth4isp.manage_users.presenter.ManageUsersPresenter;
import com.tcc2.bke_auth4isp.manage_users.router.ManageUsersRouter;

public class ActivityNewUser extends AppCompatActivity implements ManageUsersContracts.View {

    ManageUsersContracts.Presenter presenter;
    ManageUsersContracts.Router router;
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
        Toolbar toolbar = findViewById(R.id.toolbarMenu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        router = new ManageUsersRouter(getContext());
        presenter = new ManageUsersPresenter(this);
        activity = this;
        initComponents();
    }

    public void initComponents() {
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

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkboxClient:
                if (checked){
                    // @TODO Cadastrar novo usuário do tipo cliente
                }
                break;
            case R.id.checkboxTechnican:
                if (checked){
                    // @TODO Cadastrar novo usuário do tipo técnico
                } else{

                }
                break;
                // @TODO Deve marcar uma opção
        }
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
