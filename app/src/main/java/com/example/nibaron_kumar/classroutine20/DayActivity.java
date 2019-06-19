
package com.example.nibaron_kumar.classroutine20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DayActivity extends AppCompatActivity {

    private Button btn1,btnr1,btnr2,btnr3,btnr4,bttn5;
    RoutineActivity routineActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        btn1= (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aIntent = new Intent(getApplicationContext(),RoutineActivity.class);

                startActivity(aIntent);

            }
        });
        btnr2= (Button) findViewById(R.id.button2);

        btnr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aIntent = new Intent(getApplicationContext(),B_Day.class);

                startActivity(aIntent);

            }
        });
        btnr3= (Button) findViewById(R.id.button3);

        btnr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aIntent = new Intent(getApplicationContext(),C_Day.class);

                startActivity(aIntent);

            }
        });

        btnr4= (Button) findViewById(R.id.button4);

        btnr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aIntent = new Intent(getApplicationContext(),D_Day.class);

                startActivity(aIntent);

            }
        });
        bttn5= (Button) findViewById(R.id.button5);

        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aIntent = new Intent(getApplicationContext(),E_Day.class);

                startActivity(aIntent);

            }
        });

    }
}
