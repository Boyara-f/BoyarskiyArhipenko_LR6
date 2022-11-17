package com.example.p0111_resvalues;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    Button btnTop;
    EditText textInput;
    ImageView img;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTop = (AppCompatButton) findViewById(R.id.btnTop);
        img = (ImageView) findViewById(R.id.img);
        textInput = (EditText) findViewById(R.id.textInput);

    }
    public void onCLick(View v)
    {
        img.setBackgroundResource(R.drawable.metro);
         btnTop.setText(textInput.getText().toString());
    }
}
