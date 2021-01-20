package com.tcc2.bke_auth4isp.call_evaluation.interactor;

import com.tcc2.bke_auth4isp.call_evaluation.CallEvaluationContracts;
import com.tcc2.bke_auth4isp.entity.Feedback;

public class CallEvaluationInteractor implements CallEvaluationContracts.Interactor {

    private CallEvaluationContracts.Presenter presenter;

    public CallEvaluationInteractor(CallEvaluationContracts.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void saveNewFeedback(final Feedback feedback) {

    }

}
