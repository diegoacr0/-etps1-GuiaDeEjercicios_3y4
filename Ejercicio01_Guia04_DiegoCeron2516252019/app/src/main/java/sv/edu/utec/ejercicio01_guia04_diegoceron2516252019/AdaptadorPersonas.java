package sv.edu.utec.ejercicio01_guia04_diegoceron2516252019;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPersonas extends ArrayAdapter<Persona> {
    AppCompatActivity appCompatActivity;
    private ArrayList<Persona> listapersonas;
    int ImgPpersonas[];
    AdaptadorPersonas(AppCompatActivity context,ArrayList<Persona> listapersonas,int ImgPpersonas[]) {
        super(context, R.layout.persona,listapersonas);
        this.appCompatActivity = context;
        this.listapersonas=listapersonas;
        this.ImgPpersonas=ImgPpersonas;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.persona, null);
        TextView textView1 = item.findViewById(R.id.tvNombrepersona);
        textView1.setText(listapersonas.get(position).getNombre());
        TextView textView2 = item.findViewById(R.id.tvGenero);
        //textView2.setText(String.valueOf(listapersonas.get(position).getGenero()));
        if(listapersonas.get(position).getGenero()=='m'){
            textView2.setText("Masculino");
        }
        else {
            textView2.setText("Femenino");
        }
        ImageView imageView1 = item.findViewById(R.id.imgPersona);
        imageView1.setImageResource(ImgPpersonas[position]);
        return(item);
    }
}


