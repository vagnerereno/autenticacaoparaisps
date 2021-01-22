package com.tcc2.bke_auth4isp.homepage_client.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.homepage_client.HomeClientContracts;
import com.tcc2.bke_auth4isp.homepage_client.presenter.HomeClientPresenter;
import com.tcc2.bke_auth4isp.homepage_client.router.HomeClientRouter;

public class ActivityHomeClient extends AppCompatActivity implements HomeClientContracts.View {

    HomeClientContracts.Presenter presenter;
    HomeClientContracts.Router router;
    private Activity activity;
    Button buttonGenerateQRCode;
    Button buttonAuthenticationTechnican;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen_client);
        presenter = new HomeClientPresenter(this);
        router = new HomeClientRouter(getContext());
        activity = this;
        buttonGenerateQRCode = findViewById(R.id.buttonGenerateQRCode);
        buttonAuthenticationTechnican = findViewById(R.id.buttonAuthenticationTechnican);

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
}
