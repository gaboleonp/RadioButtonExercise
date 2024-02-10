package com.example.class_5_select;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioBtnActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn);

        radioGroup = findViewById(R.id.radiogroup);
        btn = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedone = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedone);
                String text1 = radioButton.getText().toString();
                Toast.makeText(RadioBtnActivity.this, "Your Gender is: "+ text1, Toast.LENGTH_SHORT).show();
            }
        });
    }
}