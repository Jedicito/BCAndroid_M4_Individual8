package chl.ancud.m4_individual8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "Segunda Actividad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Logeos de Metodos", "onCreate Actividad 2");
        setContentView(R.layout.activity_main2);

        initListeners();

    }

    private void initListeners() {



        Button btn_primeraActividad = findViewById(R.id.btn_primeraActividad);

        btn_primeraActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent mainActivity = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(mainActivity);*/
                finish();

            }
        });

        Button btn_abrirPagina = findViewById(R.id.btn_abrirPagina);

        btn_abrirPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirPagina = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.cl"));
                Log.d(TAG, "Abrir pagina: antes del if");
                startActivity(abrirPagina);
                if(abrirPagina.resolveActivity(getPackageManager()) != null) {

                    Log.d(TAG, "Abrir pagina: startActivity");
                }
                Log.d(TAG, abrirPagina.resolveActivity(getPackageManager()).toString());
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logeos de Metodos", "onStart Actividad 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Logeos de Metodos", "onRestart Actividad 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Logeos de Metodos", "onResume Actividad 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Logeos de Metodos", "onPause Actividad 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Logeos de Metodos", "onStop Actividad 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logeos de Metodos", "onDestroy Actividad 2");
    }
}