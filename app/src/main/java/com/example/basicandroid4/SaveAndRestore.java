package com.example.basicandroid4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SaveAndRestore extends AppCompatActivity {

    private TextView txtHi;
    private Button btnHi;

    String stringValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_and_restore);

        letsCreateAToast("onCreate method is called");

        txtHi=findViewById(R.id.txtHi);
        btnHi=findViewById(R.id.btnHi);

        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stringValue="Hi";
                txtHi.setText(stringValue);


            }
        });
    }
    public void letsCreateAToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    letsCreateAToast("onStart method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
    letsCreateAToast("onResume Method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
    letsCreateAToast("onPause method is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
    letsCreateAToast("onStop method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    letsCreateAToast("onDestroy method is called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    letsCreateAToast("onSavedInstance State is called");

    outState.putString("STRING_VALUE",stringValue);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    letsCreateAToast("onRestore method is called");

    stringValue=savedInstanceState.getString("STRING_VALUE");
    txtHi.setText(stringValue);
    }
}