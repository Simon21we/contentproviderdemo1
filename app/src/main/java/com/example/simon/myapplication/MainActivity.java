package com.example.simon.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick (View view){
        int id = view.getId();
        switch(id){
            case R.id.btn_insert:
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                /*dialog.setTitle("请输入学生姓名，性别，年龄")
                        .setView(R.layout.)*/
                break;
            case R.id.btn_query:
                break;
            default:

        }
    }
}
