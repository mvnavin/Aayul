package com.buillding.aayul.aayul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton sound, vibration;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected

                if(checkedId == R.id.sound) {
                    Toast.makeText(getApplicationContext(), "choice: Yes",
                            Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),Main3Activity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "choice: No",
                            Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);
                }
            }

        });

        sound = (RadioButton) findViewById(R.id.sound);
        vibration = (RadioButton) findViewById(R.id.vibration);
        textView = (TextView) findViewById(R.id.text);



    }

}