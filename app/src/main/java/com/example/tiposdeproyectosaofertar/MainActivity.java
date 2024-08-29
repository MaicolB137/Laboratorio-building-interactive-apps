package com.example.tiposdeproyectosaofertar;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity{
    private ListaProyectos list = new ListaProyectos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onClickProyecto(View view){
        TextView textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String ListaProOferta = String.valueOf(spinner.getSelectedItem());

        List<String> ofertas = list.nameproyecto(ListaProOferta);
        StringBuilder categoria = new StringBuilder();
        for (String proyecto : ofertas)
            categoria.append(proyecto).append('\n');
        textView.setText(categoria);
    }
}
