package com.tcc2.bke_auth4isp.call_evaluation.presenter;

import android.content.Context;
import android.widget.Toast;

import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.call_evaluation.CallEvaluationContracts;
import com.tcc2.bke_auth4isp.call_evaluation.interactor.CallEvaluationInteractor;
import com.tcc2.bke_auth4isp.entity.Feedback;
import com.tcc2.bke_auth4isp.entity.Person;

public class CallEvaluationPresenter implements CallEvaluationContracts.Presenter {

    CallEvaluationContracts.Interactor interactor;
    CallEvaluationContracts.View view;
    Context mContext;


    public CallEvaluationPresenter(CallEvaluationContracts.View view, Context mContext) {
        this.mContext = mContext;
        this.view = view;
        this.interactor = new CallEvaluationInteractor(this);
    }

    @Override
    public void saveFeedback(Feedback feedback) {
        interactor.saveNewFeedback(feedback);
    }

    @Override
    public void onError(String localizedMessage) {
        Toast.makeText(mContext, "Erro: " + localizedMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFeedbackReceived(String message) {
        view.onFeedbackCreated(message);
    }

    @Override
    public void fetchTechnicianInformation(Person person) {
        YLog.d("CallEvaluationPresenter", "fetchTechnicianInformation", "Fazendo download das informações do técnico.");
        interactor.downloadTechnicianInformation(person);
    }

    @Override
    public void onTechnicianReceived(Person person) {
        view.showTechnicanInformation(person);
    }

    @Override
    public void onTechnicianReceivedError(String localizedMessage) {
        view.showTechnicanRetrivingError(localizedMessage);
    }
}
