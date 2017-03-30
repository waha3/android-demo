package com.example.a89524.lesson1;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LifeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textview;
    private ProgressBar bar;
    private Button btn;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        textview = (TextView) findViewById(R.id.text_1);
        bar = (ProgressBar) findViewById(R.id.progressbar_1);
        btn = (Button) findViewById(R.id.btn3);
        btn1 = (Button) findViewById(R.id.btn4);

        textview.setOnClickListener(this);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_1:
                if (bar.getVisibility() == View.VISIBLE) {
                    bar.setVisibility(View.GONE);
                } else if (bar.getVisibility() == View.GONE) {
                    bar.setVisibility(View.VISIBLE);
                }
              break;
            case R.id.btn3:
                Log.d("log", "here");
                AlertDialog.Builder dialog = new AlertDialog.Builder(LifeActivity.this);
                dialog.setTitle("this is a dialog");
                dialog.setMessage("1");
                dialog.setCancelable(true);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.v("dialog", "here");
                    }
                });
                dialog.show();
                break;
            case R.id.btn4:
                ProgressDialog progressdialog = new ProgressDialog(LifeActivity.this);
                progressdialog.setTitle("this is progressdialog");
                progressdialog.setMessage("hello world");
                progressdialog.setCancelable(true);
                progressdialog.show();
            default:
              break;
        }
    }
}
