package com.project.is.sportlink.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.project.is.sportlink.R;

/**
 * Created by luciogrimaldi on 22/12/16.
 */

public class LoginActivity extends AppCompatActivity {

    boolean IS_UTENTE;
    boolean IS_GESTORE;
    TextView titleAppNameTextView;
    EditText eMailEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        titleAppNameTextView = (TextView) findViewById(R.id.titleAppName);
        eMailEditText = (EditText) findViewById(R.id.editTextEmail);
        passwordEditText = (EditText) findViewById(R.id.ediTextPassword);

        //Set custom font
        Typeface RobotoThinFont = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        titleAppNameTextView.setTypeface(RobotoThinFont);
        eMailEditText.setTypeface(RobotoThinFont);
        passwordEditText.setTypeface(RobotoThinFont);

        eMailEditText.setFocusableInTouchMode(true);

        IS_UTENTE = savedInstanceState.getBoolean("IS_UTENTE");
        IS_GESTORE = savedInstanceState.getBoolean("IS_GESTORE");
    }

    public String getEmail(){
        return eMailEditText.getText().toString();
    }

    public String getPassword(){
        return passwordEditText.getText().toString();
    }

    public void openSignUpForm(View v){
            Intent i = new Intent(this, UtenteRegistrationActivity.class);
            startActivity(i);
    }

    public boolean isUtente(){
        if (IS_UTENTE) {
            return true;
        }
        else
            return false;
    }

    public boolean isGestore(){

        if (IS_GESTORE) {
            return true;
        }
        else
            return false;
    }

}
