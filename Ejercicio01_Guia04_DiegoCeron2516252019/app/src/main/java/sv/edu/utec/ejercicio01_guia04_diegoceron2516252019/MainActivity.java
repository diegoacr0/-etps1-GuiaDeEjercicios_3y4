package sv.edu.utec.ejercicio01_guia04_diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Persona> listapersonas;
    ListView lv1;
    int[]ImgPpersonas={
            R.drawable.mujer,
            R.drawable.hombre,
            R.drawable.mujer,
            R.drawable.hombre,
            R.drawable.hombre,
            R.drawable.hombre,
            R.drawable.mujer,
            R.drawable.hombre,
            R.drawable.mujer,
            R.drawable.mujer,
            R.drawable.hombre,
            R.drawable.mujer,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Persona>();
        listapersonas.add(new Persona("Ana",'f'));
        listapersonas.add(new Persona("Carlos",'m'));
        listapersonas.add(new Persona("Fernanda",'f'));
        listapersonas.add(new Persona("Gustavo",'m'));
        listapersonas.add(new Persona("Jose",'m'));
        listapersonas.add(new Persona("Juan",'m'));
        listapersonas.add(new Persona("Karla",'f'));
        listapersonas.add(new Persona("Luis",'m'));
        listapersonas.add(new Persona("Maria",'f'));
        listapersonas.add(new Persona("Marta",'f'));
        listapersonas.add(new Persona("Pedro",'m'));
        listapersonas.add(new Persona("Silvia",'f'));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this,listapersonas,ImgPpersonas);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);

    }
}