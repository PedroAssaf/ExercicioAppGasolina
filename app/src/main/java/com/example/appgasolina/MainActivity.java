package com.example.appgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcularPreco(View view) {
        // Variavel refente ao alcool informado
        EditText alcool = findViewById(R.id.editTextAlcool);
        // Variavel refente a gasolina informada
        EditText gasolina = findViewById(R.id.editTextGasolina);
        // Variavel para exibir o qual o melhor resultado(Gasolina ou Alcool)
        TextView resultado = findViewById(R.id.textView2);

        // Verificação para obter a informação de qual opção compensa para ser mostrada
        if(Float.parseFloat(alcool.getText().toString()) <= Float.parseFloat(gasolina.getText().toString()) * 0.7f) {
            resultado.setText("Resultado: Alcool é a melhor opção");
        } else {
            resultado.setText("Resultado: Gasolina é a melhor opção");
        }

    }
}