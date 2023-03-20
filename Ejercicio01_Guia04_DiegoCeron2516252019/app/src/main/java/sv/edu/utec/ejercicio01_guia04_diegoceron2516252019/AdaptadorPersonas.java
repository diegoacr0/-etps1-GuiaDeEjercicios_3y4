package sv.edu.utec.ejercicio01_guia04_diegoceron2516252019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class AdaptadorPersonas extends ArrayAdapter<Personas> {
    AppCompatActivity appCompatActivity;
    AdaptadorPersonas(AppCompatActivity context) {
        super(context, R.layout.persona,listapersonas);
        appCompatActivity = context;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.persona, null);
        TextView textView1 = item.findViewById(R.id.tvNombrepersona);
        textView1.setText(listapersonas.get(position).getNombre());
        ImageView imageView1 = item.findViewById(R.id.imgPersona);
        imageView1.setImageResource(ImgPpersonas[position]);
        return(item);
    }
}


