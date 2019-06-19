package com.example.nibaron_kumar.classroutine20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity01 extends AppCompatActivity {

    private Button btnEnter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);

        btnEnter = (Button) findViewById(R.id.btnEnter);


        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dayIntent = new Intent(getApplicationContext(),DayActivity.class);

                startActivity(dayIntent);


            }
        });


    }
}
