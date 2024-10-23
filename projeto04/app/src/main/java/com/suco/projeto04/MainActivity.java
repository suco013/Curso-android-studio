package com.suco.projeto04;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

private static final int NUMERO_MAXIMO = 30; //variaveis contantes
private static final int QUANTIDADE_SORTEADA = 6;

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

    public void btn_sorteio(View view){
        //Criar um Array para armazenar os numeros
        ArrayList<Integer> numeros = new ArrayList<>();
        //Wrapper
        for (int i = 1; i <= NUMERO_MAXIMO; i++){ //1++ | i = i+1
            numeros.add(i);
    }
        // Embaralhando os numeros
        Collections.shuffle(numeros);

        //Interpolar
        StringBuilder resultado = new StringBuilder("Numeros Sortados: \n");

        //Pegar os numeros do Array
        for (int i = 0; i <QUANTIDADE_SORTEADA; i++){
            resultado.append(numeros.get(i)).append(" ");
        }

        //Exibir o Resultado
        TextView resultadoTextView = findViewById(R.id.ResultadoSorteio);
        resultadoTextView.setText(resultado.toString());




        }







}