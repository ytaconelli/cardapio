package com.example.cardapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cardapio.modelos.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textView;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private LinearLayout linearLayout;
    private ImageView imageViewProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        textView = findViewById(R.id.text_view_produto);
        textView.setText(titulo);

        linearLayout = findViewById(R.id.layout);
        imageViewProduto = findViewById(R.id.image_view_produto);

        criarProduto(titulo);
        listarProdutos(titulo);
    }

    public void criarProduto(String titulo){
        if (titulo.equals("Corote")){
            imageViewProduto.setImageResource(R.drawable.corote);
            produtos.add(new Produto("Corote de frutas vermelhas",
                    3.99,
                    "Bebidas",
                    "Bebida alcoolica com sabor de frutas vermelhas"));

            produtos.add(new Produto("Corote de limão",
                    4.49,
                    "Bebidas",
                    "Bebida alcoolica com sabor de limão"));
        }
        else if (titulo.equals("Carne")){
            imageViewProduto.setImageResource(R.drawable.carne);
            produtos.add(new Produto("Contra Filé",
                    22.99,
                    "Carnes",
                    "Delicioso e macio Contra Filé mal passada para carnívoros" ));
            produtos.add(new Produto("Picanha",
                    34.99,
                    "Carnes",
                    "Maravilhosa Picanha para quem adora um clássico dos churrascos"));
        }

        else if (titulo.equals("Coca Cola")){
            imageViewProduto.setImageResource(R.drawable.coca);
            produtos.add(new Produto("Coca Cola",
                    7.99,
                    "Bebidas",
                    "Matador refrigerante de cola para um churrasco"));
        }

        else if (titulo.equals("Alface")){
            imageViewProduto.setImageResource(R.drawable.alface);
            produtos.add(new Produto("Alface",
                    4.99,
                    "Saudável",
                    "Folhas de alfaces para veganos"));
        }

    }

    public void listarProdutos(String titulo) {

        for (int i=0; i<produtos.size(); i++){

            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);

            textViewNome.setText(produtos.get(i).getNome());
            textViewNome.setTextSize(18);

            textViewPreco.setText("R$ " + produtos.get(i).getPreco().toString().replace(".",","));

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
        }
    }
}
