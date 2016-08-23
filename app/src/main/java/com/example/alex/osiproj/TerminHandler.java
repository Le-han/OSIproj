package com.example.alex.osiproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerminHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termin_handler);
        String strId = getIntent().getExtras().getString("mKeyTermin");

        TextView infoTextView = (TextView)findViewById(R.id.termin);
        infoTextView.setText(strId);
    }
}
