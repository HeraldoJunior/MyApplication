package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private EditText editQtdPessoas;
    private TextView textValorPorPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.EditValor);
        editQtdPessoas = findViewById(R.id.EditQuantidadePessoas);

        textValorPorPessoa = findViewById(R.id.textValorPorPessoa);
    }

    public void Calculador(View view) {
        String textValor = editValor.getText().toString();
        double valorDespesa = Double.parseDouble(textValor);

        String textQtdPessoas = editQtdPessoas.getText().toString();
        double qtdPessoas = Double.parseDouble(textQtdPessoas);

        double resultado = valorDespesa  / qtdPessoas ;

        String formatado = "R$ " +  resultado;

        textValorPorPessoa.setText(formatado);
    }
}
