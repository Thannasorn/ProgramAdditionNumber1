//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.programadditionnumber1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView sum;
    private TextView min;
    private TextView max;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        sum = (TextView) findViewById(R.id.sum);
        min = (TextView) findViewById(R.id.min);
        max = (TextView) findViewById(R.id.max);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1, num2;
                num1 = Integer.parseInt(n1.getText().toString());
                num2 = Integer.parseInt(n2.getText().toString());

                if (num1 == 0 ){
                    Toast.makeText(MainActivity.this, "กรุณากรอกข้อมูลให้ครบ", Toast.LENGTH_LONG).show();
                }
                else if (num2 == 0){
                    Toast.makeText(MainActivity.this, "กรุณากรอกข้อมูลให้ครบ", Toast.LENGTH_LONG).show();
                }
                else {
                    int Sum = 0, Min = 0, Max = 0;
                    Sum = Total(num1, num2);
                    sum.setText(Sum + "");
                    Min = MinV(num1, num2);
                    min.setText(Min + "");
                    Max = MaxV(num1, num2);
                    max.setText(Max + "");

                }
            }
        });
    }

    private int Total(int num1, int num2){
        int total = num1+num2;
        return (total);
    };

    private int MinV(int num1, int num2){
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        return(min);
    }

    private int MaxV(int num1, int num2){
        int max = num1;
        if(num2 > max){
            max = num2;
        }
        return(max);
    }
}