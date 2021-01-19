package com.tcc2.bke_auth4isp.manage_users.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.entity.Client;
import com.tcc2.bke_auth4isp.entity.Technician;
import com.tcc2.bke_auth4isp.manage_users.ManageUsersContracts;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AdapterListUsers extends RecyclerView.Adapter<AdapterListUsers.MyViewHolder>{

    private Context mContext;
    private List<Client> clientList;
    private List<Technician> technicianList;
    private ManageUsersContracts.Router router;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView nameUser;
        public TextView phoneUser;
        public TextView certificationTechnican;
        public ImageView photoView;
        public RatingBar evaluationTechnican;
        public CardView card;



        public MyViewHolder(View view) {
            super(view);
            nameUser = view.findViewById(R.id.txtViewNameTechnican);
            certificationTechnican = view.findViewById(R.id.txtViewCertificationTechnican);
            evaluationTechnican = view.findViewById(R.id.rate_technican);
            phoneUser = view.findViewById(R.id.phoneNewUser);
            photoView = view.findViewById(R.id.photoView);
            card = view.findViewById(R.id.cardViewUser);
        }
    }

    public AdapterListUsers(Context mContext, ArrayList<Client> clientList, ArrayList<Technician> technicianList, ManageUsersContracts.Router router) {
        this.mContext = mContext;
        this.router = router;
        this.clientList = clientList;
        this.technicianList = technicianList;
    }

    @Override
    public AdapterListUsers.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_users, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // @TODO falta fazer esse onBindViewHolder
    }

    public static String unAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }

    @Override
    public int getItemCount() {
        return technicianList.size();
    }

    public Context getmContext() {
        return mContext;
    }

    public void addItem(Technician s) {
        technicianList.add(s);
        notifyDataSetChanged();
    }


}
