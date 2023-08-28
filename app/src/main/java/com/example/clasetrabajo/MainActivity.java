package com.example.clasetrabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario, Contraseña;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario =(EditText) findViewById(R.id.user);
        Contraseña =(EditText) findViewById(R.id.contra);


    }


    public void Ingresar(View v){
        if (usuario.getText().toString().equals("admin") && Contraseña.getText().toString().equals("1234")){
            Toast.makeText(this,"Exitoso", Toast.LENGTH_SHORT).show();
            Intent Ingreso = new Intent(this, Navegacion.class);
            Ingreso.putExtra("dato1", usuario.getText().toString());
            startActivity(Ingreso);

        }else if(usuario.getText().toString().equals("user") && Contraseña.getText().toString().equals("1234")) {
            Toast.makeText(this,"Exitoso", Toast.LENGTH_SHORT).show();
            Intent Ingreso = new Intent(this, Navegacion.class);
            Ingreso.putExtra("dato1", usuario.getText().toString());
            startActivity(Ingreso);
        }else {
            Toast.makeText(this,"Datos no correctos", Toast.LENGTH_SHORT).show();
        }

    }
}