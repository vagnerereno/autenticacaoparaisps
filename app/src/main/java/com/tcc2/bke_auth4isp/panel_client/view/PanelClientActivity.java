package com.tcc2.bke_auth4isp.panel_client.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.panel_client_calls.view.CallsFragment;
import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.panel_client.HomeClientContracts;
import com.tcc2.bke_auth4isp.panel_client.presenter.HomeClientPresenter;
import com.tcc2.bke_auth4isp.panel_client.router.HomeClientRouter;
import com.tcc2.bke_auth4isp.panel_client_home.view.HomeFragment;

public class PanelClientActivity extends AppCompatActivity implements HomeClientContracts.View {

    HomeClientContracts.Presenter presenter;
    HomeClientContracts.Router router;
    BottomNavigationView bottomNavigationView;
    private Activity activity;
    Button buttonGenerateQRCode;
    Button buttonAuthenticationTechnican;
    TextView name_client;
    Person person;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        person = (Person) getIntent().getSerializableExtra("PERSON");
        presenter = new HomeClientPresenter(this);
        router = new HomeClientRouter(getContext());
        activity = this;
        buttonGenerateQRCode = findViewById(R.id.buttonGenerateQRCode);
        buttonAuthenticationTechnican = findViewById(R.id.buttonAuthenticationTechnican);
    }

    private void setupUI() {
        name_client = findViewById(R.id.technician_name);
        name_client.setText("Olá, " + person.getName());

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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            YLog.d("PanelClientActivity", "onNavigationItemSelected", "Clicando no item Chamados "+ item.getItemId());

            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.navigation_attendance:
                    selectedFragment = new CallsFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, selectedFragment).commit();

            return true;
        }
    };

}
