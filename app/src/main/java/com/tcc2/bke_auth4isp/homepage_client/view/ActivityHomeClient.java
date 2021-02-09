package com.tcc2.bke_auth4isp.homepage_client.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.homepage_client.HomeClientContracts;
import com.tcc2.bke_auth4isp.homepage_client.presenter.HomeClientPresenter;
import com.tcc2.bke_auth4isp.homepage_client.router.HomeClientRouter;

public class ActivityHomeClient extends AppCompatActivity implements HomeClientContracts.View {

    HomeClientContracts.Presenter presenter;
    HomeClientContracts.Router router;

    NavController navController;
    AppBarConfiguration appBarConfiguration;
    BottomNavigationView bottomNavigationView;

    private Activity activity;
    Button buttonGenerateQRCode;
    Button buttonAuthenticationTechnican;
    TextView name_client;
    Person person;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        setupFragment();
        person = (Person) getIntent().getSerializableExtra("PERSON");
        presenter = new HomeClientPresenter(this);
        router = new HomeClientRouter(getContext());
        activity = this;
        buttonGenerateQRCode = findViewById(R.id.buttonGenerateQRCode);
        buttonAuthenticationTechnican = findViewById(R.id.buttonAuthenticationTechnican);
    }

    private void setupUI() {
        name_client = findViewById(R.id.client_name);
        name_client.setText(person.getName());

        buttonGenerateQRCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                router.gotoGenerateQRCode();
            }
        });
        buttonAuthenticationTechnican.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 router.gotoReadQRCode();
             }
         }
        );
    }

    private void setupFragment() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,
                R.id.navigation_notifications)
                .build();

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
