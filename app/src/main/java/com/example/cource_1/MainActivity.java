package com.example.cource_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText num1 = (EditText) this.findViewById(R.id.a);
        EditText num2 = (EditText) this.findViewById(R.id.b);
        TextView reslut = (TextView) this.findViewById(R.id.result);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        reslut.setText(Integer.toString(number1 + number2));
    }
}