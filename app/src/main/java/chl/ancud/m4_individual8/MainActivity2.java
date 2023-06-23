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
        setContentView(R.layout.activity_main2);

        initListeners();

    }

    private void initListeners() {



        Button btn_primeraActividad = findViewById(R.id.btn_primeraActividad);

        btn_primeraActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(mainActivity);

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
}