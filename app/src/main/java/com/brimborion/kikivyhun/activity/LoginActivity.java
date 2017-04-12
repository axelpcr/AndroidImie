package com.brimborion.kikivyhun.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.brimborion.kikivyhun.R;

public class LoginActivity extends AppCompatActivity {

    public static final String LOGIN_KEY = "LOGIN_KEY";
    private static final String PASSWORD_KEY = "PASSWORD_KEY";

    private EditText login;
    private EditText password;
    private CheckBox savePassword;
    private Button connection;
    private Button register;

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.login = (EditText) findViewById(R.id.editTextLogin);
        this.password = (EditText) findViewById(R.id.editTextPassword);
        this.savePassword = (CheckBox) findViewById(R.id.checkBoxSavePassword);
        this.connection = (Button) findViewById(R.id.buttonConnection);
        this.register = (Button) findViewById(R.id.buttonRegister);

        if (prefs.contains(LOGIN_KEY) && prefs.contains(PASSWORD_KEY)) {
            login.setText(prefs.getString(LOGIN_KEY, ""));
            password.setText(prefs.getString(PASSWORD_KEY, ""));
        }

        this.connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (savePassword.isChecked()) {
                    prefs.edit().putString(LOGIN_KEY, login.getText().toString()).apply();
                    prefs.edit().putString(PASSWORD_KEY, password.getText().toString()).apply();
                } else {
                    prefs.edit().remove(LOGIN_KEY).apply();
                    prefs.edit().remove(PASSWORD_KEY).apply();
                }

                if (login.getText().toString().equals("login")
                        && password.getText().toString().equals("pass")) {
                    startActivity(new Intent(LoginActivity.this, EventActivity.class));
                }
            }
        });

        this.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}
