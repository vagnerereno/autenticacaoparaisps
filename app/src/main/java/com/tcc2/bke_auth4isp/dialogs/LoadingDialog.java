package com.tcc2.bke_auth4isp.dialogs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.analytic_logs.YLog;

import java.util.Timer;
import java.util.TimerTask;

public class LoadingDialog {

    MaterialDialog loadingDialog;
    TextView titulo;
    TextView conteudo;
    ProgressBar barraDeProgresso;
    Button btnConfirm;
    RelativeLayout defaultHeader;
    RelativeLayout errorHeader;

    private Activity baseActivity;

    public LoadingDialog(Activity baseActivity, String message, boolean autoTimeout) {
        this.baseActivity = baseActivity;
        //@TODO Verificar o MaterialDialog.Builder
//        loadingDialog = new MaterialDialog.Builder(baseActivity)
//                .customView(R.layout.loading_dialog, false)
//                .progressIndeterminateStyle(false)
//                .show();

        btnConfirm = (Button) loadingDialog.findViewById(R.id.btnMaterialDialogOk);
        titulo = (TextView) loadingDialog.findViewById(R.id.title);
        conteudo = (TextView) loadingDialog.findViewById(R.id.content_notification_dialog);
        barraDeProgresso = (ProgressBar) loadingDialog.findViewById(R.id.chargebackProgressBar);

        // Error or loading headers
        defaultHeader = (RelativeLayout) loadingDialog.findViewById(R.id.defaultHeader);
        errorHeader = (RelativeLayout) loadingDialog.findViewById(R.id.errorHeader);


        // Loading...
        titulo.setText("Por favor, aguarde.");
        conteudo.setText(message);
        showProgress(true);
        // Se não tiver nenhuma resposta em 1,5 segundos, fecha automaticamente o dialog
        //(pode ser que nunca tenha uma resposta por estar vazio)
        if (autoTimeout) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    onSuccess();
                }
            }, 1500);
        } else {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    onNetworkDelay();
                }
            }, 3500);
        }
    }

    private void onNetworkDelay() {
        baseActivity.runOnUiThread(new Runnable() {
            public void run() {
                titulo.setText("Conexão Lenta");
                conteudo.setText("Isso está demorando mais do que o normal...");
            }
        });
    }

    public void onSuccess(String title, String content) {
        try {
            titulo.setText(title);
            conteudo.setText(content);
            showProgress(false);
            btnConfirm.setVisibility(View.VISIBLE);
            btnConfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    baseActivity.finish();
                }
            });
        } catch (Exception e) {
            YLog.d("LoadingDialog", "onSucess(title,content)", e.getLocalizedMessage());
        }
    }


    public void showProgress(final boolean show) {
        int shortAnimTime = baseActivity.getResources().getInteger(android.R.integer.config_shortAnimTime);
        barraDeProgresso.setVisibility(show ? View.VISIBLE : View.GONE);
        barraDeProgresso.animate().setDuration(shortAnimTime).alpha(
                show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                barraDeProgresso.setVisibility(show ? View.VISIBLE : View.GONE);
                Log.d("PROGRESS", "STATUS: " + show);
            }
        });
    }

    public void onSuccess() {
        this.loadingDialog.dismiss();
    }
}
