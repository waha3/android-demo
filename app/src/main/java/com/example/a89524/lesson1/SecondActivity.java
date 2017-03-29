package com.example.a89524.lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = getIntent();
//                String data = intent.getStringExtra("extra_data");

//                Toast.makeText(SecondActivity.this, data, Toast.LENGTH_LONG).show();

                Intent intent = new Intent();
                intent.putExtra("back_data", "back to MainActivity");
                setResult(RESULT_OK, intent);

                finish();

            }
        });

    }
}
