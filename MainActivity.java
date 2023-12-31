package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static double result;
    static char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e =(EditText)findViewById(R.id.editTextText2);
        Button b1=(Button)findViewById(R.id.btn1);
        Button b2=(Button)findViewById(R.id.btn2);
        Button b3=(Button)findViewById(R.id.btn3);
        Button b4=(Button)findViewById(R.id.btn4);
        Button ba=(Button)findViewById(R.id.btnadd);
        Button b5=(Button)findViewById(R.id.btn5);
        Button b6=(Button)findViewById(R.id.btn6);
        Button b7=(Button)findViewById(R.id.btn7);
        Button bs=(Button)findViewById(R.id.btnsub);
        Button bc=(Button)findViewById(R.id.btnc);
        Button bm=(Button)findViewById(R.id.btnmul);
        Button bd=(Button)findViewById(R.id.btndiv);
        Button be=(Button)findViewById(R.id.btneql);
        Button b8=(Button)findViewById(R.id.btn8);
        Button b9=(Button)findViewById(R.id.btn9);
        Button b0=(Button)findViewById(R.id.btn0);
        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if((e.getText().toString().equals(" ")))
                    e.setText(String.valueOf(e.getText().toString()+0));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { e.setText(String.valueOf(e.getText().toString()+1)); }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+2));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+3));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+4));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+5));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+6));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+7));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+8));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(e.getText().toString()+9));
            }

        });
        bc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                e.setText(String.valueOf(" "));
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                op='+';
                result=Double.parseDouble(e.getText().toString());
                e.setText(String.valueOf(" "));
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                op='-';
                result=Double.parseDouble(e.getText().toString());
                e.setText(String.valueOf(" "));
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                op='*';
                result=Double.parseDouble(e.getText().toString());
                e.setText(String.valueOf(" "));
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                op='/';
                result=Double.parseDouble(e.getText().toString());
                e.setText(String.valueOf(" "));
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (op == '+') {
                    double n = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(result + n));
                } else if (op == '-') {
                    double n = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(result - n));

                } else if (op == '*') {
                    double n = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(result * n));
                } else {
                    double n = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(result / n));
                }
            }
        });
    }
}