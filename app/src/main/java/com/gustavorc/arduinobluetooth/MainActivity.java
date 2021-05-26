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
    }
}