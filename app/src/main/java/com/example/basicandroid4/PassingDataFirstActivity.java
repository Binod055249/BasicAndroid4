package com.example.basicandroid4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingDataFirstActivity extends AppCompatActivity {

    private TextView txtName,txtEmail,txtUserName,txtPassword;
    private Button btnMove;
    private static final int REQUEST_CODE_MOVE=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_first);

        txtName=findViewById(R.id.txtName);
        txtEmail=findViewById(R.id.txtEmail);
        txtUserName=findViewById(R.id.txtUserName);
        txtPassword=findViewById(R.id.txtPassword);

        btnMove=findViewById(R.id.btnMove);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PassingDataFirstActivity.this,PassingDataSecondActivity.class);
                startActivityForResult(intent,REQUEST_CODE_MOVE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE_MOVE && resultCode==RESULT_OK){

            String name=data.getStringExtra(PassingDataSecondActivity.REQUEST_TEXT_FIELD_NAME);
            String email=data.getStringExtra(PassingDataSecondActivity.REQUEST_TEXT_FIELD_EMAIL);
            String username=data.getStringExtra(PassingDataSecondActivity.REQUEST_TEXT_FIELD_USER_NAME);
            String password=data.getStringExtra(PassingDataSecondActivity.REQUEST_TEXT_FIELD_PASSWORD);

            txtName.setText(name);
            txtEmail.setText(email);
            txtUserName.setText(username);
            txtPassword.setText(password);

        }
    }
}