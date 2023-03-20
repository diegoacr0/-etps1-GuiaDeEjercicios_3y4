package sv.edu.utec.ejercicio01_guia04_diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.Home,
            R.drawable.Application,
            R.drawable.Bluetooth,
            R.drawable.Battery,
            R.drawable.Console,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("ana",'f'));
        listapersonas.add(new Personas("carlos",'m'));
        listapersonas.add(new Personas("fernanda",'f'));
        listapersonas.add(new Personas("gustavo",'m'));
        listapersonas.add(new Personas("jose",'m'));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);

    }
}