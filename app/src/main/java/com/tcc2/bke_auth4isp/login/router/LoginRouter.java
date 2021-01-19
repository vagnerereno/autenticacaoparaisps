package com.tcc2.bke_auth4isp.login.router;

import com.tcc2.bke_auth4isp.calls.CallsContracts;
import com.tcc2.bke_auth4isp.login.LoginContracts;

public class LoginRouter implements CallsContracts.Router{
    public LoginRouter(LoginContracts.View view) {
        this.view = view;
    }
    LoginContracts.View view;
}
