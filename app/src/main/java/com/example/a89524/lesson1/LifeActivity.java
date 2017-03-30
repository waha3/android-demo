package com.example.a89524.lesson1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LifeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textview;
    private ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        textview = (TextView) findViewById(R.id.text_1);
        bar = (ProgressBar) findViewById(R.id.progressbar_1);

        textview.setOnClickListener(this);
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
                AlertDialog.Builder dialog = new AlertDialog.Builder(LifeActivity.this);
                dialog.setTitle("this is a dialog");
                dialog.setMessage("1");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.v("dialog", "here");
                    }
                });
                dialog.show();
                break;
            default:
              break;
        }
    }
}
