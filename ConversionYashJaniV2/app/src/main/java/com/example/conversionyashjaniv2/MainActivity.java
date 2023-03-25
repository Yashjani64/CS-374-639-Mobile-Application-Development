package com.example.conversionyashjaniv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText dollarInput;
    private Button convertButton;
    private TextView euroOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollarInput = findViewById(R.id.dollar_input);
        convertButton = findViewById(R.id.convert_button);
        euroOutput = findViewById(R.id.euro_output);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dollarString = dollarInput.getText().toString();
                double dollarAmount = Double.parseDouble(dollarString);
                double euroAmount = dollarAmount * 0.88;
                String euroString = String.format("%.2f euros", euroAmount);
                euroOutput.setText(euroString);
            }
        });
    }
}