package com.example.a89524.lesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by 89524 on 2017/3/30.
 */

public class BaseActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    Log.v("调用的activity", getClass().getSimpleName());
  }
}
