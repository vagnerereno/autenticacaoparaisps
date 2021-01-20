package com.tcc2.bke_auth4isp.call_evaluation;

import android.content.Context;

import com.tcc2.bke_auth4isp.entity.Feedback;
import com.tcc2.bke_auth4isp.entity.Technician;

public interface CallEvaluationContracts {

    interface Router{

        void gotoStartPointActivity();
    }

    interface Presenter {

    }

    interface Interactor {

        void saveNewFeedback(Feedback feedback);
    }

    interface  View {

        void onFeedbackCreated(String message);

        void showTechnicanInformation(Technician technician);

        Context getContext();

        void showTechnicanRetrivingError(String message);

        void ShowErrorMessage(String error);
    }

}
