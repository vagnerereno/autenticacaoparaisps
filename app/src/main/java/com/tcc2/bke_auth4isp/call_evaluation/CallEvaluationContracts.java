package com.tcc2.bke_auth4isp.call_evaluation;

import android.content.Context;

import com.tcc2.bke_auth4isp.entity.Feedback;
import com.tcc2.bke_auth4isp.entity.Person;

public interface CallEvaluationContracts {

    interface Router{

        void gotoStartPointActivity();
    }

    interface Presenter {

        void saveFeedback(Feedback feedback);

        void onError(String localizedMessage);

        void onFeedbackReceived(String message);

        void fetchTechnicianInformation(Person person);

        void onTechnicianReceived(Person person);

        void onTechnicianReceivedError(String localizedMessage);
    }

    interface Interactor {

        void saveNewFeedback(Feedback feedback);

        void downloadTechnicianInformation(Person person);
    }

    interface  View {

        void onFeedbackCreated(String message);

        Context getContext();

        void ShowErrorMessage(String error);

        void showTechnicanInformation(Person person);

        void showTechnicanRetrivingError(String localizedMessage);
    }

}
