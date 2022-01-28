package com.prospect.madosevaluationapp.ui.UseUi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prospect.madosevaluationapp.R;
import com.prospect.madosevaluationapp.ui.Login;

public class UserRegisration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_regisration);
       Button register = findViewById(R.id.btnregister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentResident = new Intent(UserRegisration.this, Login.class);
                intentResident.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intentResident);
                finish();            }
        });

    }
}