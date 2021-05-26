package com.gustavorc.arduinobluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText edtTextOut;
    ImageButton btnEnviar, btnOn, btnOff;
    TextView tvtMensaje;
    Button btnDesconectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTextOut = findViewById(R.id.edtTextOut);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnOn = findViewById(R.id.btnOn);
        btnOff = findViewById(R.id.btnOff);
        tvtMensaje = findViewById(R.id.tvtMensaje);
        btnDesconectar = findViewById(R.id.btnDesconectar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

            }
        });

        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

            }
        });

        btnDesconectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

            }
        });



    }



}