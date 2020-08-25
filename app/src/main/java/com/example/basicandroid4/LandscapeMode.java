package com.example.basicandroid4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class LandscapeMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscape_mode);

        final TextView txtInclude=findViewById(R.id.txtInclude);
        Button btnInclude=findViewById(R.id.btnInclude);
        final CheckBox chxInclude=findViewById(R.id.chxInclude);

        btnInclude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtInclude.setText("The Text is changed");
                txtInclude.setTextSize(40f);
                chxInclude.setChecked(true);
                chxInclude.setText("The value of the checkBox is true now");
                chxInclude.setTextSize(20f);
            }
        });

    }
}