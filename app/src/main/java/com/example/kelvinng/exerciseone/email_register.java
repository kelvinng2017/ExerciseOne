package com.example.kelvinng.exerciseone;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class email_register extends AppCompatActivity {

    public EditText user_email_edit_text,user_password_edit_text,user_confirm_password_edit_text;
    public Button confirm_button_of_activity_email_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_register);

        Toolbar activity_email_register_toolbar=findViewById(R.id.activity_email_register_toolbar);
        setSupportActionBar(activity_email_register_toolbar);
        ActionBar activity_email_register_actionbar=getSupportActionBar();
        activity_email_register_actionbar.setTitle("註冊頁面");
        activity_email_register_actionbar.setDisplayHomeAsUpEnabled(true);
        user_email_edit_text=findViewById(R.id.user_email_edit_text);
        user_password_edit_text=findViewById(R.id.user_password_edit_text);
        user_confirm_password_edit_text=findViewById(R.id.user_confirm_password_edit_text);
        confirm_button_of_activity_email_register=findViewById(R.id.confirm_button_of_activity_email_register);
        confirm_button_of_activity_email_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user_email_edit_text.getText().toString().matches("") || user_password_edit_text.getText().toString().matches("")||user_confirm_password_edit_text.getText().toString().matches("")) {
                    Toast.makeText(email_register.this,"輸入欄位不能為空值",Toast.LENGTH_SHORT).show();
                }
                else if(user_password_edit_text.getText().toString().equals(user_confirm_password_edit_text.getText().toString())) {
                    Toast.makeText(email_register.this,"登錄成功",Toast.LENGTH_SHORT).show();
                }
                else if(!user_password_edit_text.getText().toString().equals(user_confirm_password_edit_text.getText().toString())){
                    AlertDialog.Builder builder = new AlertDialog.Builder(email_register.this);
                    builder.setTitle("密碼錯誤")
                            .setMessage("請重新輸入密碼")
                            .setPositiveButton("確認", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                    user_password_edit_text.setText("");
                                    user_confirm_password_edit_text.setText("");
                                    user_password_edit_text.requestFocus();//edit_text的光標會回到輸入密碼的地方
                                }
                            })
                            /*.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                }
                            })*/
                            .show();
                }


            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(email_register.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(email_register.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
