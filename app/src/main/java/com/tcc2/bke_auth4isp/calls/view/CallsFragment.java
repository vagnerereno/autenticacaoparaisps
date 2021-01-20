package com.tcc2.bke_auth4isp.calls.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.calls.CallsContracts;
import com.tcc2.bke_auth4isp.calls.router.CallsRouter;
import com.tcc2.bke_auth4isp.entity.Call;
import com.tcc2.bke_auth4isp.entity.Client;
import com.tcc2.bke_auth4isp.entity.ISP;
import com.tcc2.bke_auth4isp.entity.Manager;
import com.tcc2.bke_auth4isp.entity.Technician;

import java.util.ArrayList;
import java.util.Calendar;


public class CallsFragment extends Fragment implements CallsContracts.View {

    AdapterCalls adapter;
    RecyclerView recyclerView;
    ArrayList<Call> myCalls;
    CallsContracts.Router router;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recyclerView = container.findViewById(R.id.recyclerViewCalls);
        router = new CallsRouter(this);
        myCalls = new ArrayList<>();
        adicionarCallTeste2();
        adapter = new AdapterCalls(getContext(), myCalls, router);
        Toast.makeText(getContext(), "TESTEEEEEEEE", Toast.LENGTH_SHORT).show();
        adicionarCallTeste();
        return inflater.inflate(R.layout.calls_fragment, container, false);
    }

    private void adicionarCallTeste2() {
        Client client = new Client("Vagner", 545465, 99708521, 4465465);
        Technician technician = new Technician("Vagner", 545465, 99708521, 4465465, "", "");
        Manager manager = new Manager("Vagner", 545465, 99708521, 4465465);
        ISP isp = new ISP("code 02", "Interneith");
        myCalls.add(new Call(client, technician, manager, isp, Calendar.getInstance().getTime()));
    }

    private void adicionarCallTeste() {
        Client client = new Client("Vagner", 545465, 99708521, 4465465);
        Technician technician = new Technician("Vagner", 545465, 99708521, 4465465, "", "");
        Manager manager = new Manager("Vagner", 545465, 99708521, 4465465);
        ISP isp = new ISP("code 02", "Interneith");
        adapter.addItem(new Call(client, technician, manager, isp, Calendar.getInstance().getTime()));
    }
}