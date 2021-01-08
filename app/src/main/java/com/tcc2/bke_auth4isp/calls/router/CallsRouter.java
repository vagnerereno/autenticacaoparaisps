package com.tcc2.bke_auth4isp.calls.router;

import com.tcc2.bke_auth4isp.calls.CallsContracts;

public class CallsRouter implements CallsContracts.Router{
    public CallsRouter(CallsContracts.View view) {
        this.view = view;
    }

    CallsContracts.View view;
}
