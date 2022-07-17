package com.example.calculatorprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDEL,btnMINUS,btnPLUS,btnDOT,btnSUM,btnDIVIDE,btnMUL,btnMOD,btnC;
    EditText editText;
    Boolean add,div,min,mul,mod;
    float num,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.et);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn0=(Button) findViewById(R.id.btn0);
        btnMINUS=(Button) findViewById(R.id.btnMINUS);
        btnPLUS=(Button) findViewById(R.id.btnPLUS);
        btnDOT=(Button) findViewById(R.id.btnDOT);
        btnSUM=(Button) findViewById(R.id.btnSUM);
        btnDIVIDE=(Button) findViewById(R.id.btnDIVIDE);
        btnMUL=(Button)findViewById(R.id.btnMUL);
        btnDEL=(Button)findViewById(R.id.btnDEL);
        btnC=(Button)findViewById(R.id.btnC);
        btnMOD=(Button)findViewById(R.id.btnMOD);
        btn1.setOnClickListener(v -> editText.setText(editText.getText() + "1"));
        btn2.setOnClickListener(v -> editText.setText(editText.getText() + "2"));
        btn3.setOnClickListener(v -> editText.setText(editText.getText() + "3"));
        btn4.setOnClickListener(v -> editText.setText(editText.getText() + "4"));
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);
            }
        });
        btnPLUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText()==null)
                {

                    editText.setText(null);
                }
                else{
                    num=Float.parseFloat(editText.getText()+"");
                    add=true;
                    editText.setText(null);
                    mod=false;
                    min=false;
                    div=false;
                    mul=false;
                    mod=false;
                }
            }
        });
        btnMINUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else{
                    num=Float.parseFloat(editText.getText()+"");
                    min=true;
                    editText.setText(null);
                    mod=false;
                    add=false;
                    div=false;
                    mul=false;
                    mod=false;
                }
            }
        });
        btnDIVIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else{
                    num=Float.parseFloat(editText.getText()+"");
                    div=true;
                    editText.setText(null);
                    mod=false;
                    min=false;
                    add=false;
                    mul=false;
                    mod=false;
                }
            }
        });
        btnDOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });
        btnMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else{
                    num=Float.parseFloat(editText.getText()+"");
                    mul=true;
                    editText.setText(null);
                    mod=false;
                    min=false;
                    div=false;
                    add=false;
                    mod=false;
                }
            }
        });
        btnMOD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else{
                    num=Float.parseFloat(editText.getText()+"");
                    mod=true;
                    editText.setText(null);
                    mod=false;
                    min=false;
                    div=false;
                    mul=false;
                    add=false;
                }
            }
        });
        btnDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInBox=editText.getText().toString();
                if(textInBox.length()>0) {
                    String newString = textInBox.substring(0, editText.getText().length() - 1);
                    editText.setText(newString);
                }
            }
        });
        btnSUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Float.parseFloat(editText.getText()+"");
                if(add)
                {
                    editText.setText(num + num2+"");
                    add=false;
                }
                else if(min)
                {
                    editText.setText(num - num2+"");
                    min=false;
                }
                else if(div)
                {
                    editText.setText(num / num2+"");
                    div=false;
                }
                else if(mod)
                {
                    editText.setText(num % num2+"");
                    mod=false;
                }
                else if(mul)
                {
                    editText.setText(num* num2+"");
                    mul=false;
                }
            }
        });

    }
}