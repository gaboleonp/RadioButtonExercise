package com.example.class_5_select;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autocomplete;
    ToggleButton tgbtn;
    Button btn;

    String[] arr = {"Montreal","Toronto","Paris","Panama","Pakestan","Port"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tgbtn = findViewById(R.id.togglebutton);
        btn = findViewById(R.id.btn);
        autocomplete = findViewById(R.id.autoComplete);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,arr);
        autocomplete.setThreshold(2);
        autocomplete.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = tgbtn.getText().toString();
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
            }
        });
    }
}