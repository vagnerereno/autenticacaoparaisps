package com.tcc2.bke_auth4isp.dialogs;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.call_evaluation.view.ActivityCallEvaluation;


/**
 * Created by Vagner on 21/01/2021.
 */

public class ErrorDialog {

    MaterialDialog chargebackDialog;
    TextView text;
    Button btnConfirm;

// @TODO Verificar essa classe inteira.

//    private ActivityCallEvaluation baseActivity;


    public ErrorDialog(final ActivityCallEvaluation baseActivity, String message) {
//        this.baseActivity = baseActivity;
        // @TODO VERIFICAR MaterialDialog.Builder que está dando erro no Builder.
//        chargebackDialog = new MaterialDialog.Builder(this.baseActivity)
//                .customView(R.layout.dialog_error, false)
//                .progressIndeterminateStyle(false)
//                .show();
        YLog.d("FeedbackSucessDialog","Constructor", message);

        btnConfirm = (Button) chargebackDialog.findViewById(R.id.btnMaterialDialogOk);
        text = (TextView) chargebackDialog.findViewById(R.id.textSucessFeedback);
        text.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chargebackDialog.dismiss();
//                baseActivity.router.gotoStartPointActivity();//gotoStartPointActivity();
                YLog.d("Error Dialog","onClick", "Dismiss");

            }
        });
        YLog.d("Error Dialog","Constructor", "End");
    }
}
