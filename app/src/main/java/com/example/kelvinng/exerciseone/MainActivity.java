package com.example.kelvinng.exerciseone;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    public  ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar activity_main_toolbar=findViewById(R.id.activity_main_toolbar);//一定要選android.support.v7.widget.Toolbar;不要v4
        setSupportActionBar(activity_main_toolbar);//將toolbar的功能給actionbar

        ActionBar activity_main_actionBar=getSupportActionBar();//actionbar取得toolbar的功能
        activity_main_actionBar.setTitle("主頁面");//在app也沒最上方顯示標題名稱
        activity_main_actionBar.setDisplayHomeAsUpEnabled(true);
        activity_main_actionBar.setDisplayShowHomeEnabled(true);


        Button button_hello_word=findViewById(R.id.button_hello_word);
        button_hello_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你點擊了Hello World按鈕",Toast.LENGTH_SHORT).show();
            }
        });

        Button button_android=findViewById(R.id.button_android);
        button_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你點擊了android按鈕",Toast.LENGTH_SHORT).show();
            }
        });

        Button button_my_first_app=findViewById(R.id.button_my_first_app);
        button_my_first_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你點擊了我的第一個程式按鈕",Toast.LENGTH_SHORT).show();
            }
        });

        DrawerLayout drawerLayout_activity_main=findViewById(R.id.drawerLayout_activity_main);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout_activity_main,R.string.open,R.string.close);//必須用字串資源檔
        drawerLayout_activity_main.addDrawerListener(actionBarDrawerToggle);//監聽選單按鈕是否被觸擊
        actionBarDrawerToggle.syncState();//隱藏顯示箭頭返回
        NavigationView navigation_view_activity_main=findViewById(R.id.navigation_view_activity_main);
        View activity_main_view=navigation_view_activity_main.getHeaderView(0);
        TextView activity_main_user_name=activity_main_view.findViewById(R.id.activity_name_user_name);
        CircleImageView activity_name_user_image=activity_main_view.findViewById(R.id.activity_name_user_image);
        activity_name_user_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你點擊了大頭貼",Toast.LENGTH_LONG).show();
            }
        });
        Menu activity_main_menu=navigation_view_activity_main.getMenu();
        MenuItem email_login=activity_main_menu.findItem(R.id.email_login);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){//當按下左上三條線或顯示工具列
            invalidateOptionsMenu();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
