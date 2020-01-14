package com.example.tarea1unidad01_leydihuallpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejercicio1(View view){

        startActivity(new Intent(this, Calculadora.class));
    }

    public void ejercicio2(View view){

        startActivity(new Intent(this, Formulario.class));
    }
    public void salir(View view){
        finish();
    }

}
