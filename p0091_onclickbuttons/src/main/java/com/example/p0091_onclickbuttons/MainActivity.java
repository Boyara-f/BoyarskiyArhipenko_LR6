package com.example.p0091_onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    TextView tvLog;
    TextView tvPas;
    Button btnEnter;
    Button btnReg;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnEnter = (Button) findViewById(R.id.btnEnter);
        btnReg = (Button) findViewById(R.id.btnReg);
        tvOut = (TextView) findViewById(R.id.tV7);

        tvLog = (TextView) findViewById(R.id.TVL);
        tvPas = (TextView) findViewById(R.id.TVP);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvLog.getText().toString().equals("admin"))
                {
                    if (tvPas.getText().toString().equals("admin"))
                    {
                        tvOut.setText("Вы авторизовались");
                    }
                    else
                    {
                        tvOut.setText("Пароль не правильный");
                    }
                }
                else
                {
                    tvOut.setText("Такого логина нет");
                }

            }
        };

        btnEnter.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnReg = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Функция в разработке");
            }
        };

        btnReg.setOnClickListener(oclBtnReg);
    }

}


