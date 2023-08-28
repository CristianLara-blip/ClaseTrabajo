package com.example.clasetrabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Navegacion extends AppCompatActivity {
    private TextView Usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);

        Usuarios =(TextView) findViewById(R.id.usuarioss);

        String datos= getIntent().getStringExtra("dato1");
        Usuarios.setText(""+datos);


    }
    public void Salir(View v){
        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }

}