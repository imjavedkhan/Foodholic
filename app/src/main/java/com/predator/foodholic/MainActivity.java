package com.predator.foodholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox chilli,coke,rice,shake;
    EditText q1,q2,q3,q4;
    Integer chilli_quan,coke_quan,rice_quan,shake_quan,tchil,trice,tcoke,tshake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOrder(View view){

        chilli =(CheckBox)findViewById(R.id.chilli);
        coke=(CheckBox)findViewById(R.id.coke);
        rice=(CheckBox)findViewById(R.id.rice);
        shake=(CheckBox)findViewById(R.id.shake);
        q1 =(EditText)findViewById(R.id.q1);
        q2 =(EditText)findViewById(R.id.q2);
        q3 =(EditText)findViewById(R.id.q3);
        q4 =(EditText)findViewById(R.id.q4);

        int amt=0;
        StringBuilder result = new StringBuilder();
        result.append("Selected Items:");

        if(chilli.isChecked() && q1.getText().toString().length()!=0){

            chilli_quan = Integer.parseInt(q1.getText().toString());
            tchil = chilli_quan * 60;
            result.append("\nChilli : "+ tchil);
            amt+=tchil;
        }
        if(coke.isChecked()){

            coke_quan = Integer.parseInt(q2.getText().toString());
            tcoke = coke_quan * 40;
            result.append("\nCoke : "+ tcoke);
            amt+=tcoke;
        }
        if(rice.isChecked()){

            rice_quan = Integer.parseInt(q3.getText().toString());
            trice = rice_quan * 100;
            result.append("\nFried Rice : "+ trice);
            amt+=trice;
        }
        if(shake.isChecked()){

            shake_quan = Integer.parseInt(q4.getText().toString());
            tshake = shake_quan * 80;
            result.append("\nMango Shake : "+ tshake);
            amt+=tshake;
        }

            result.append(" \nTotal Amount : "+amt+" ");
        Toast.makeText(getApplicationContext(), result.toString() + ('\u20B9'), Toast.LENGTH_LONG).show();

    }
}

