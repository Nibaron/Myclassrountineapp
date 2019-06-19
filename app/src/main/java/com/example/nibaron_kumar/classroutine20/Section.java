
package com.example.nibaron_kumar.classroutine20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Section extends AppCompatActivity {

    private Button button22;
    RoutineActivity routineActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_sel);

        button22= (Button) findViewById(R.id.btn22);

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aIntent = new Intent(getApplicationContext(),DayActivity.class);

                startActivity(aIntent);

            }
        });
    }
}
