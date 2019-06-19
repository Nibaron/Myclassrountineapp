package com.example.nibaron_kumar.classroutine20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class RoutineActivity extends AppCompatActivity {
    private Button btn1,btnr1,btnr2,btnr3,btnr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        btnr1 = (Button) findViewById(R.id.btnr1);
        btnr2 = (Button) findViewById(R.id.btnr2);
        btnr3 = (Button) findViewById(R.id.btnr3);
        btnr4 = (Button) findViewById(R.id.btnr4);
        btnr1.setText("MATH 2213\n" +
                " 8 A.M. to 8.50 a.m.\n" +
                "Room no:101");
        btnr2.setText("CSE 2205\n" +
                " 8.50 A.M. to 9.40 a.m.\n" +
                "Room no:101");
        btnr3.setText("CSE 2203\n" +
                " 9.40 A.M. to 10.30 a.m.\n" +
                "Room no:101");
        btnr4.setText("CSE 2204/CSE 2202\n" +
                "10.50 a.m. to 1.20 p.m.\n" +
                "by:FM/MH");



    }
}
