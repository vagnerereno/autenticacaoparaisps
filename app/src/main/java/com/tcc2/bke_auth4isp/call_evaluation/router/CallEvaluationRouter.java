package com.tcc2.bke_auth4isp.call_evaluation.router;

import android.content.Context;

import com.tcc2.bke_auth4isp.call_evaluation.CallEvaluationContracts;

public class CallEvaluationRouter implements CallEvaluationContracts.Router {

    CallEvaluationContracts.View view;
    Context mContexto;

    public CallEvaluationRouter(CallEvaluationContracts.View view, Context mContexto) {
        this.view = view;
        this.mContexto = mContexto;
    }

//    @Override
//    public void gotoStartPointActivity() {
//        Intent i = new Intent(mContexto, ActivityStartingPoint.class);
//        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        mContexto.startActivity(i);
//    }


    private Context getContext() {
        return mContexto;
    }

    @Override
    public void gotoStartPointActivity() {

    }
}
