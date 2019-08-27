package com.example.cardapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCorote(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Corote");
        startActivity(intent);
    }

    public void abrirCarne(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Carne");
        startActivity(intent);
    }

    public void abrirCoca(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Coca Cola");
        startActivity(intent);
    }

    public void abrirAlface(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO, "Alface");
        startActivity(intent);
    }
}
