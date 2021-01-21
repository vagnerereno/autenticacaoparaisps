package com.tcc2.bke_auth4isp.homepage_technican.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.homepage_technican.HomeTechnicanContracts;
import com.tcc2.bke_auth4isp.homepage_technican.presenter.HomeTechnicanPresenter;
import com.tcc2.bke_auth4isp.homepage_technican.router.HomeTechnicanRouter;

public class ActivityHomeTechnican extends AppCompatActivity implements HomeTechnicanContracts.View {

    HomeTechnicanContracts.Presenter presenter;
    HomeTechnicanContracts.Router router;
    private Activity activity;
    Button buttonGenerateQRCode;
    Button buttonAuthenticationClient;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen_technican);
        presenter = new HomeTechnicanPresenter(this);
        router = new HomeTechnicanRouter(getContext());
        activity = this;
        buttonGenerateQRCode = findViewById(R.id.buttonGenerateQRCode);
        buttonAuthenticationClient = findViewById(R.id.buttonAuthenticationTechnican);

        buttonGenerateQRCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO gerar um QR Code com informações do técnico
            }
        });
        buttonAuthenticationClient.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  // @TODO abrir leitor de QR Code.
              }
          }
        );
    }

    @Override
    public Context getContext() {
        return null;
    }
}
