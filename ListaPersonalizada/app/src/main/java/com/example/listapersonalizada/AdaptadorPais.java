package com.example.listapersonalizada;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdaptadorPais extends ArrayAdapter<String> {
    Activity contexto;
    String []paises;
    Integer [] ImgPais;
    ImageView imgBande;
    TextView tvNombre;

    public AdaptadorPais (Activity contexto,String [] paises, Integer[] ImgPais){
        super(contexto,R.layout.paises,paises);
        this.contexto=contexto;
        this.paises=paises;
        this.ImgPais=ImgPais;
    }

    public View getView(int position, View v, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.paises,null, true);
        tvNombre=rowView.findViewById(R.id.tvNombrePais);
        imgBande=rowView.findViewById(R.id.imgvBandera);
        tvNombre.setText(paises[position]);
        imgBande.setImageResource(ImgPais[position]);
        return rowView;
}}
