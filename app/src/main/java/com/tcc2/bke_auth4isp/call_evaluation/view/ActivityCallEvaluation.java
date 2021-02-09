package com.tcc2.bke_auth4isp.call_evaluation.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.tcc2.bke_auth4isp.R;
import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.call_evaluation.CallEvaluationContracts;
import com.tcc2.bke_auth4isp.call_evaluation.presenter.CallEvaluationPresenter;
import com.tcc2.bke_auth4isp.call_evaluation.router.CallEvaluationRouter;
import com.tcc2.bke_auth4isp.common.ImageUtilities;
import com.tcc2.bke_auth4isp.entity.Technician;

public class ActivityCallEvaluation extends AppCompatActivity implements CallEvaluationContracts.View {

    CallEvaluationContracts.Presenter presenter;
    private Button buttonAvaiableTechnican;
    private TextView technican_name;
    private TextView isp_technican;
    private EditText comments;
    private RatingBar rate_technican_bar;
    CallEvaluationContracts.Router router;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_feedback);
        presenter = new CallEvaluationPresenter(this, getContext());
        router = new CallEvaluationRouter(this, getContext());

        imageView = findViewById(R.id.photo_feedback);
        technican_name = findViewById(R.id.client_name);
        isp_technican = findViewById(R.id.isp_technican);
        rate_technican_bar = (RatingBar) findViewById(R.id.rate_technican);

        comments.getText();
        try {
            buttonAvaiableTechnican = findViewById(R.id.buttonAvaiableTechnican);
            buttonAvaiableTechnican.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // @TODO FALTA CLICAR NESSE BOTÃO E AVALIAR O TÉCNICO.
                }
            });
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }

    @Override
    public void onFeedbackCreated(String message) {
        YLog.d("FeedbackSucessDialog", "onFeedbackCreated", message);
        FeedbackSucessDialog dialogSucess = new FeedbackSucessDialog(this, message);
    }

    @Override
    public void showTechnicanInformation(Technician technician) {
        technican_name.setText(technician.getName());
        isp_technican.setText(technician.getIsp());
        ImageUtilities.downloadWppFast(imageView, getApplicationContext(), technician.getUrl_photo().concat("?type=large"), 130, 150);
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    @Override
    public void showTechnicanRetrivingError(String message) {
        YLog.d("ActivityFeedback", "showProfessionalRetrivingError", message);
        Toast.makeText(this, "Existe um erro no cadastro: " + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ShowErrorMessage(String error) {
        Toast.makeText(this, "Erro ao avaliar profissional: " + error, Toast.LENGTH_SHORT).show();
    }

}
