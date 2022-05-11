package com.example.correctionexercicespays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pays> pays = new ArrayList<>();
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.sp);

        pays.add(new Pays("Maroc","Rabat","Afric",676767,R.drawable.ma));
        pays.add(new Pays("Egypt","Cairo","Afric",767676,R.drawable.eg));
        pays.add(new Pays("Espagne","Madrid","Europe",3434343,R.drawable.es));
        pays.add(new Pays("Argentine","Buenos Aires","Amerique",3444343,R.drawable.ar));
        pays.add(new Pays("Belgique","Bruxelle","Europe",232323,R.drawable.be));
        pays.add(new Pays("Japan","Tokyo","Asie",32323,R.drawable.jp));
        pays.add(new Pays("France","Paris","Europe",232323,R.drawable.fr));
        pays.add(new Pays("Portugal","Lesbon","Europe",23232,R.drawable.pt));


        ArrayList<String> nomsPays = new ArrayList<>();
        for(Pays p : pays)
            nomsPays.add(p.getNom());

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,nomsPays);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}