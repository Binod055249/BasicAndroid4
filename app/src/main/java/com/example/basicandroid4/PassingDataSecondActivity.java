package com.example.basicandroid4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PassingDataSecondActivity extends AppCompatActivity {

    private EditText edtName,edtEmail,edtUsername,edtPassword;

    public static final String REQUEST_TEXT_FIELD_NAME="REQUEST_NAME";
    public static final String REQUEST_TEXT_FIELD_EMAIL="REQUEST_EMAIL";
    public static final String REQUEST_TEXT_FIELD_USER_NAME="REQUEST_USER_NAME";
    public static final String REQUEST_TEXT_FIELD_PASSWORD="REQUEST_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_second);

        edtName=findViewById(R.id.edtName);
        edtEmail=findViewById(R.id.edtEmail);
        edtUsername=findViewById(R.id.edtUserName);
        edtPassword=findViewById(R.id.edtPassword);

        findViewById(R.id.btnDone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent data =new Intent();
                data.putExtra(REQUEST_TEXT_FIELD_NAME,edtName.getText().toString());
                data.putExtra(REQUEST_TEXT_FIELD_EMAIL,edtEmail.getText().toString());
                data.putExtra(REQUEST_TEXT_FIELD_USER_NAME,edtUsername.getText().toString());
                data.putExtra(REQUEST_TEXT_FIELD_PASSWORD,edtPassword.getText().toString());
                setResult(RESULT_OK,data);
                finish();

            }
        });

    }
}