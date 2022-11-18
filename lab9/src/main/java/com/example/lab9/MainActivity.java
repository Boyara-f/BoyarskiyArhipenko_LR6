package com.example.lab9;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    EditText etLogin, etPassword;
    Button btnSave, btnLoad;

    SharedPreferences Log;
    SharedPreferences Pas;

    final String SAVED_LOG = "saved_LOG";
    final String SAVED_PAS = "saved_PAS";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btnSave = (Button) findViewById(R.id.btnReg);
        btnSave.setOnClickListener(this);
        btnLoad = (Button) findViewById(R.id.btnJoin);
        btnLoad.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnReg:
                saveText();
                break;
            case R.id.btnJoin:
                checkText();
                break;
            default:
                break;
        }
    }

    void saveText() {
        Log = getPreferences(MODE_PRIVATE);
        Editor L = Log.edit();
        L.putString(SAVED_LOG, etLogin.getText().toString());
        L.commit();
        Pas = getPreferences(MODE_PRIVATE);
        Editor P = Pas.edit();
        P.putString(SAVED_PAS, etPassword.getText().toString());
        P.commit();
        Toast.makeText(this, "User saved", Toast.LENGTH_SHORT).show();
    }

    void checkText() {
        Log = getPreferences(MODE_PRIVATE);
        String Login = Log.getString(SAVED_LOG, "Login saved");
        Pas = getPreferences(MODE_PRIVATE);
        String Password = Pas.getString(SAVED_PAS, "Password saved");
        if(Login.equals(etLogin.getText().toString())) {
            if (Password.equals(etPassword.getText().toString())) {
                Toast.makeText(this, "Join Succses", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }

}