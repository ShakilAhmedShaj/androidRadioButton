package com.t3ch.shaj.androidradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button showButton;
    private TextView showHolder;
    private RadioButton sayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupID);
        showButton = findViewById(R.id.show_button_id);
        showHolder = findViewById(R.id.show_holder_id);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedID = radioGroup.getCheckedRadioButtonId();
                sayButton = findViewById(selectedID);
                String value = sayButton.getText().toString();
                showHolder.setText("You said " + value);

            }
        });


    }
}
