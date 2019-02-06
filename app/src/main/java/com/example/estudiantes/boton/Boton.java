package com.example.estudiantes.boton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Boton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton);

    }
    public void buscarSalon(View vista) {
        TextView miEtiqueta = (TextView) findViewById(R.id.etiqueta);
        Button miBoton = (Button) findViewById(R.id.boton);
        EditText miTexto = (EditText) findViewById(R.id.texto);

        String salon = miTexto.getText().toString();
        if(salon.equals("701")) {
            miEtiqueta.setText("Esta en la sede de ingenieria");

        } else {
            miEtiqueta.setText("El salon " + miTexto.getText()+ " no esta registrado");
        }


    }
}

