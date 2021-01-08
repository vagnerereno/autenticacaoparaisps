package com.tcc2.bke_auth4isp.calls.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.calls.CallsContracts;
import com.tcc2.bke_auth4isp.entity.Call;

import java.text.DateFormat;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class AdapterCalls extends RecyclerView.Adapter<AdapterCalls.MyViewHolder> {
    private Context mContext;
    private List<Call> myCalls;

    private CallsContracts.Router router;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTechnican;
        public TextView certificationTechnican;
        public TextView datatime;
        public ImageView photoView;
        public CardView card;

        public MyViewHolder(View view) {
            super(view);
            nameTechnican = view.findViewById(R.id.txtViewNameTechnican);
            certificationTechnican = view.findViewById(R.id.txtViewCertificationTechnican);
            datatime = view.findViewById(R.id.textViewDataTime);
            photoView = view.findViewById(R.id.photoView);
            card = view.findViewById(R.id.cardViewCall);
        }

    }

    public AdapterCalls(Context mContext, ArrayList<Call> myCalls, CallsContracts.Router router) {
        this.mContext = mContext;
        this.router = router;
        this.myCalls = myCalls;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_call, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Call call = myCalls.get(position);
        String nameTechnican = call.getTechnician().getName();
        boolean certificationTechnican = call.getTechnician().isCertified();
        String certification;
        if (certificationTechnican) {
            certification = "Certificado por " + call.getIsp().getName();
        } else {
            certification = "Não certificado por " + call.getIsp().getName();
        }

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy às hh:mm:ss");
        String datatime = dateFormat.format(call.getDate());



        holder.nameTechnican.setText(nameTechnican);
        holder.certificationTechnican.setText(certification);
        holder.datatime.setText(datatime);

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCalls.get(position);
            }
        });
    }


    public static String unAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }

    @Override
    public int getItemCount() {
        return myCalls.size();
    }

    public Context getmContext() {
        return mContext;
    }

    public void addItem(Call s) {
        myCalls.add(s);
        notifyDataSetChanged();
    }
}