package com.suco.projeto6;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    String[] frases = {
            "É por isso que a sua família faz churrasco sem você.",
            "Não se desanime com a derrota de hoje, porque amanhã tem mais.",
            "Para você ser ruim falta muito ainda."
    };

    public void GerarFrases(View view){
        TextView texto = findViewById(R.id.txt_result);
        int NumerosAleatorios = new Random().nextInt(3);

        String frase = frases[NumerosAleatorios];

        texto.setText(frase);

    }

    public void ExibirTodas(View view){
        TextView texto = findViewById(R.id.txt_result);

        String TextoResultado = "";

        for (String frase : frases){
            TextoResultado = TextoResultado + frase + "\n";
        }

        texto.setText(TextoResultado);

    }







}