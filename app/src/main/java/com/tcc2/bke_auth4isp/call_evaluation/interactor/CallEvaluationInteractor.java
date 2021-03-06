package com.tcc2.bke_auth4isp.call_evaluation.interactor;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.tcc2.bke_auth4isp.analytic_logs.YLog;
import com.tcc2.bke_auth4isp.call_evaluation.CallEvaluationContracts;
import com.tcc2.bke_auth4isp.common.CommonDatabaseReferences;
import com.tcc2.bke_auth4isp.entity.Feedback;
import com.tcc2.bke_auth4isp.entity.Person;

public class CallEvaluationInteractor implements CallEvaluationContracts.Interactor {

    private CallEvaluationContracts.Presenter presenter;

    public CallEvaluationInteractor(CallEvaluationContracts.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void saveNewFeedback(final Feedback feedback) {
        YLog.d("CallsInteractor", "downloadCalls", "Iniciando download de chamados: " + feedback);
        DatabaseReference databaseReference = CommonDatabaseReferences.getFeedbacksReference(feedback.getUsername_client());
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                YLog.d("CallsInteractor", "downloadCalls", "Iniciou busca por chamados: " + snapshot.getRef());
                try {
                    databaseReference.setValue(feedback);
                    presenter.onFeedbackReceived("Recebemos o seu feedback!");
                } catch (Exception e) {
                    presenter.onError(e.getLocalizedMessage());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                presenter.onError(error.getMessage());
            }
        });
    }

    // @TODO VERIFICAR ISSO
    @Override
    public void downloadTechnicianInformation(Person person) {
//        CommonDatabaseReferences.getTechnicianReference(person.getUsername()).addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                try {
//                    YLog.d("CallEvaluationInteractor", "downloadTechnicianInformation", "Fazendo download das informações do técnico no Firebase.");
//                    if (person.isTechnician()) {
//                        Person person = snapshot.getValue(Person.class);
//                        Log.d("RETRIVED NAME: ", person.getName());
//                        Log.d("RETRIVED NAME: ", person.getUsername());
//                        presenter.onTechnicianReceived(person);
//                    }
//                } catch (Exception e) {
//                    Log.d("ERROR RETRIVED: ", e.getLocalizedMessage());
//                    presenter.onTechnicianReceivedError(e.getLocalizedMessage());
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                Log.d("RETRIVED CATEGORY: ", error.getMessage());
//            }
//        });
//
    }

}
