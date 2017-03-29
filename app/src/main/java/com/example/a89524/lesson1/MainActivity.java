package com.example.a89524.lesson1;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bundle中带有activity的数据
        if (savedInstanceState != null) {
            String temp = savedInstanceState.getString("temp_key");
        }


//    Button btn1 = (Button) findViewById(R.id.btn1);
//    btn1.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View v) {
//        String data = "hello world";
//
//        Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_LONG);
//
//        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//        intent.putExtra("extra_data", data);
//        // startActivity(intent);
//        startActivityForResult(intent, 1);
//
//      }
//    });


        Button normalBtn = (Button) findViewById(R.id.start_normal_activity);
        Button dialogBtn = (Button) findViewById(R.id.start_dialog_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LifeActivity.class);
                startActivity(intent);
            }
        });

        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(MainActivity.this, "world", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onActivityResult(int requestData, int responseData, Intent intent) {
        switch (requestData) {
            case 1:
                if (responseData == RESULT_OK) {
                    String backData = intent.getStringExtra("back_data");
                    Toast.makeText(MainActivity.this, backData, Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }
    }

    // life cycle
    @Override
    protected  void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected  void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    // 保存临时数据
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String temp = "temp data";
        outState.putString("temp_key", temp);
    }
}
