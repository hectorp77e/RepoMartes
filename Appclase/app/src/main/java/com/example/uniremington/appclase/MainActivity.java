package com.example.uniremington.appclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView label1;
    Button boton1;
    Button boton2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1 = (TextView) findViewById(R.id.label1);
        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }

    public void changeText(){

        label1.setText("hola mundo");

    }

 @Override

    public void onClick(View v){

        switch(v.getId()){
            case R.id.boton1:
                label1.setText("se presiono el boton 1");
                break;
            case R.id.boton2:
                label1.setText("se presiono el boton 2");
                break;
            default:
                break;
        }
    }
}
