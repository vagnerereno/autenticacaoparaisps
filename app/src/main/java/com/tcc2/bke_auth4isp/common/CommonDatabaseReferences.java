package com.tcc2.bke_auth4isp.common;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CommonDatabaseReferences {

    public static DatabaseReference getBaseRef() {
        return FirebaseDatabase.getInstance().getReference();
    }

    public static DatabaseReference getLoginReference(String username) {
        DatabaseReference reference = getBaseRef().child("ISP").child("INTERNEITH").child("User").child(username);
        return reference;
    }

    public static DatabaseReference getCallsReference(String username) {
        DatabaseReference reference = getBaseRef().child("ISP").child("INTERNEITH").child("Calls").child(username);
        return reference;
    }

    public static DatabaseReference getFeedbacksReference(String username) {
        DatabaseReference reference = getBaseRef().child("ISP").child("INTERNEITH").child("Feedback").child(username);
        return reference;
    }

    public static DatabaseReference getProfileReference(String username, String role) {
        DatabaseReference reference = getBaseRef().child("ISP").child("INTERNEITH").child(role).child(username);
        return reference;
    }

}
