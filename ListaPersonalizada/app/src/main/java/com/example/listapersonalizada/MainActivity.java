package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String [] paises={"El Salvador","Costa Rica","Guatemala", "Honduras", "Nicaragua"};
    ListView lvstPais;
    Integer []ImgPais= {
            R.drawable.banderaesa,
            R.drawable.banderacr,
            R.drawable.banderaguatemala,
            R.drawable.banderahon,
            R.drawable.banderanic,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador = new AdaptadorPais(this,paises,ImgPais);
        lvstPais = findViewById(R.id.lstPaises);
        lvstPais.setAdapter(adaptador);
    }
}