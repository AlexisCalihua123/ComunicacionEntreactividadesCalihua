package com.edu.tesoem.isc.alexis.comunicacioncalihua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ParametroActivity extends AppCompatActivity {
    TextView ldlsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametro);
        ldlsaludo = findViewById(R.id.ldlsaludo);
        Bundle parametro = getIntent().getExtras();
        ldlsaludo.setText( "Bienvenido" + parametro.getString("Nombre"));

    }
}
