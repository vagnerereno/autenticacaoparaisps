package com.tcc2.bke_auth4isp.call_evaluation.presenter;

import com.tcc2.bke_auth4isp.call_evaluation.CallEvaluationContracts;
import com.tcc2.bke_auth4isp.call_evaluation.interactor.CallEvaluationInteractor;

public class CallEvaluationPresenter implements CallEvaluationContracts.Presenter {

    CallEvaluationContracts.Interactor interactor;
    CallEvaluationContracts.View view;

    public CallEvaluationPresenter(CallEvaluationContracts.View view) {
        this.view = view;
        this.interactor = new CallEvaluationInteractor(this);
    }
}
