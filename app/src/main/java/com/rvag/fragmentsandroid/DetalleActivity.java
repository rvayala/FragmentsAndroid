package com.rvag.fragmentsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.rvag.fragmentsandroid.model.Amigo;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Amigo amigo = (Amigo) getIntent().getExtras().getSerializable(getString(R.string.amigo));
        TextView tvNombre = (TextView) findViewById(R.id.lblNombre);
        TextView tvTelefono = (TextView) findViewById(R.id.lblTelefono);
        TextView tvTwiter = (TextView) findViewById(R.id.lblTwiter);

        if(amigo != null)
        {
            tvNombre.setText(amigo.getNombre());
            tvTelefono.setText(amigo.getTelefono());
            tvTwiter.setText(amigo.getTwiter());
        }
    }
}
