package com.example.nibaron_kumar.classroutine20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class C_Day extends AppCompatActivity {

    private Button btn1,btnr1,btnr2,btnr3,btnr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__day);

        btnr1 = (Button) findViewById(R.id.btnr1);
        btnr2 = (Button) findViewById(R.id.btnr2);
        btnr3 = (Button) findViewById(R.id.btnr3);
        btnr4 = (Button) findViewById(R.id.btnr4);
        btnr4.setText("CSE 2206 LAB\n" +
                " 8 A.M. to 10.30 a.m.\n" +
                "by: SSG");
        btnr1.setText("CSE 2201\n" +
                " 10.50 A.M. to 11.40 a.m.\n" +
                "Room no:202");
        btnr2.setText("EEE 2251\n" +
                " 11.40 A.M. to 12.30 P.m.\n" +
                "Room no:202");
        btnr3.setText("CSE 2203\n" +
                " 12.30 P.M. to 1.20 P.m.\n" +
                "Room no:202");



    }
}
