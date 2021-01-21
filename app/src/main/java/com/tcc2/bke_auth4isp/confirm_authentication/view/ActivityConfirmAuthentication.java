package com.tcc2.bke_auth4isp.confirm_authentication.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.common.ImageUtilities;
import com.tcc2.bke_auth4isp.confirm_authentication.ConfirmAuthenticationContracts;
import com.tcc2.bke_auth4isp.confirm_authentication.presenter.ConfirmAuthenticationPresenter;
import com.tcc2.bke_auth4isp.confirm_authentication.router.ConfirmAuthenticationRouter;
import com.tcc2.bke_auth4isp.entity.Client;
import com.tcc2.bke_auth4isp.entity.Technician;

public class ActivityConfirmAuthentication extends AppCompatActivity implements ConfirmAuthenticationContracts.View {

    ConfirmAuthenticationContracts.Presenter presenter;
    ConfirmAuthenticationContracts.Router router;
    private Activity activity;
    ImageView photo_feedback;
    RatingBar rate_technican;
    TextView nameConfirmation;
    TextView txtViewIsp;
    Button buttonConfirm;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_authentication);
        presenter = new ConfirmAuthenticationPresenter(this);
        router = new ConfirmAuthenticationRouter(getContext());
        activity = this;
        buttonConfirm = findViewById(R.id.buttonConfirm);
        photo_feedback = findViewById(R.id.photo_feedback);
        rate_technican = findViewById(R.id.rate_technican);
        nameConfirmation = findViewById(R.id.nameConfirmation);
        txtViewIsp = findViewById(R.id.txtViewIsp);

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO confirmar autenticação e registrar atendimento.
            }
        });
    }

    @Override
    public void downloadTechnicianInformation(Technician technician){
        nameConfirmation.setText(technician.getName());
        txtViewIsp.setText(technician.getIsp());
        ImageUtilities.downloadWppFast(photo_feedback, getApplicationContext(), technician.getUrl_photo().concat("?type=large"), 130, 150);

    }

    @Override
    public void downloadClientInformation(Client client){
        nameConfirmation.setText(client.getName());
        txtViewIsp.setText(client.getIsp());
        ImageUtilities.downloadWppFast(photo_feedback, getApplicationContext(), client.getUrl_photo().concat("?type=large"), 130, 150);
    }

    @Override
    public Context getContext() {
        return null;
    }
}
