package com.example.formasdepago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, tarjetanum, cvv, fechavencimiento;

    Button continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        tarjetanum = findViewById(R.id.tarjetanum);
        cvv = findViewById(R.id.cvv);
        fechavencimiento = findViewById(R.id.fechavencimiento);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Makes();
            }
        });
    }
    public void Makes() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        finish();

    }
}