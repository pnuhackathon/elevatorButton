package com.example.elevator_btn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button out_btn = (Button) findViewById(R.id.out_btn);
        Button in_btn = (Button) findViewById(R.id.in_btn);

        out_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Out_btn_Activity.class);
                startActivity(intent);
            }
        });
        in_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, In_btn_Activity.class);
                startActivity(intent);
            }
        });
    }
}
