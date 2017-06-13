package com.example.first.oralev10;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton teteEtCou;
    ImageButton dosEtDerrier;
    ImageButton epolesEtPoitrine;
    ImageButton ventre;
    ImageButton partiesPrives;
    ImageButton jambes;
    ImageButton corpsEntier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        teteEtCou = (ImageButton) findViewById(R.id.teteEtCout);
        teteEtCou.setOnClickListener(this);

        dosEtDerrier = (ImageButton) findViewById(R.id.dosEtDerriere);
        dosEtDerrier.setOnClickListener(this);

        epolesEtPoitrine = (ImageButton) findViewById(R.id.epolesEtPoitrine);
        epolesEtPoitrine.setOnClickListener(this);

        ventre = (ImageButton) findViewById(R.id.ventre);
        ventre.setOnClickListener(this);

        partiesPrives = (ImageButton) findViewById(R.id.partiesPrivees);
        partiesPrives.setOnClickListener(this);

        jambes = (ImageButton) findViewById(R.id.jambes);
        jambes.setOnClickListener(this);

        corpsEntier = (ImageButton) findViewById(R.id.corpsEntier);
        corpsEntier.setOnClickListener(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.teteEtCou:
//                Toast.makeText(getApplicationContext(),"Esto es otro Toast",Toast.LENGTH_SHORT).show();

            case R.id.teteEtCout:
                Intent intentLoadTeteEtCou = new Intent (MainActivity.this,TeteEtCou.class);
                startActivity(intentLoadTeteEtCou);
                break;

            case R.id.dosEtDerriere:
                Intent intentLoadDosEtDerriere = new Intent (MainActivity.this,DosEtDerriere.class);
                startActivity(intentLoadDosEtDerriere);
                break;

            case R.id.epolesEtPoitrine:
                Intent intentLoadEpolesEtPoitrine = new Intent (MainActivity.this,EpolesEtPoitrine.class);
                startActivity(intentLoadEpolesEtPoitrine);
                break;

            case R.id.ventre:
                Intent intentLoadVentre = new Intent (MainActivity.this,Ventre.class);
                startActivity(intentLoadVentre);
                break;

            case R.id.partiesPrivees:
                Intent intentLoadPartiesPrives = new Intent (MainActivity.this,PartiesPrives.class);
                startActivity(intentLoadPartiesPrives);
                break;

            case R.id.jambes:
                Intent intentLoadJambes = new Intent (MainActivity.this,Jambes.class);
                startActivity(intentLoadJambes);
                break;


            case R.id.corpsEntier:
                Intent intentLoadCorpsEntier = new Intent (MainActivity.this,CorpsEntier.class);
                startActivity(intentLoadCorpsEntier);
                break;

            default:
                break;
            
        }
    }
}
