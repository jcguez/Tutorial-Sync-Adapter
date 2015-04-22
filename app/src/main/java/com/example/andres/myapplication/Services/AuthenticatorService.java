package com.example.andres.myapplication.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.example.andres.myapplication.Authenticator.AccountAuthenticator;

/**
 * Created by andres on 18-04-15.
 */
public class AuthenticatorService extends Service {

    private AccountAuthenticator mAuthenticator;
    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new AccountAuthenticator(this);
    }
    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
