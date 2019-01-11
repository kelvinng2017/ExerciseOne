package com.example.kelvinng.exerciseone;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Email_Login extends AppCompatActivity {

    Toolbar activity_email_login_toolbar;
    ActionBar activity_email_login_actionbar;
    Button confirm_button_of_activity_email_register;
    EditText email_login_edit_text,password_login_edit_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email__login);

        activity_email_login_toolbar=findViewById(R.id.activity_email_login_toolbar);
        setSupportActionBar(activity_email_login_toolbar);
        activity_email_login_actionbar=getSupportActionBar();
        activity_email_login_actionbar.setTitle("登錄頁面");
        activity_email_login_actionbar.setDisplayHomeAsUpEnabled(true);
        email_login_edit_text=findViewById(R.id.email_login_edit_text);
        password_login_edit_text=findViewById(R.id.password_login_edit_text);
        confirm_button_of_activity_email_register=(Button)findViewById(R.id.confirm_button_of_activity_email_register);
        confirm_button_of_activity_email_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email_login_edit_text.getText().toString().matches("root")&&password_login_edit_text.getText().toString().matches("toor")){
                    Toast.makeText(Email_Login.this,"登錄成功",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Email_Login.this,"賬號或密碼輸入錯誤",Toast.LENGTH_SHORT).show();
                    email_login_edit_text.requestFocus();
                }
            }
        });




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(Email_Login.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Email_Login.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
