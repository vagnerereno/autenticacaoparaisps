package com.tcc2.bke_auth4isp.panel_client_home.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.entity.Person;
import com.tcc2.bke_auth4isp.panel_client_home.ClientHomeContracts;
import com.tcc2.bke_auth4isp.panel_client_home.router.PanelClientHomeRouter;


public class HomeFragment extends Fragment {

    Button buttonGenerateQRCode;
    Button buttonAuthenticationTechnican;
    ClientHomeContracts.Presenter presenter;
    ClientHomeContracts.Router router;
    TextView name_client;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        router = new PanelClientHomeRouter(getContext());

//        presenter = new PanelClientHomePresenter(this);
        setupUI(root);
        return root;
    }

    private void setupUI(View container) {
        name_client = container.findViewById(R.id.technician_name);
        Person person = (Person) getActivity().getIntent().getSerializableExtra("PERSON");
        name_client.setText("Olá, " + person.getName());
        buttonGenerateQRCode = container.findViewById(R.id.buttonGenerateQRCode);
        buttonAuthenticationTechnican = container.findViewById(R.id.buttonAuthenticationTechnican);
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

}