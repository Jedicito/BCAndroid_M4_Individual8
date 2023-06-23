package chl.ancud.m4_individual8;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Logeos de metodos", "onCreate Actividad 1");
        setContentView(R.layout.activity_main);

        initListeners();

    }

    private void initListeners() {
        Button btn_segundaActividad = findViewById(R.id.btn_segundaActividad);

        btn_segundaActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(mainActivity2);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logeos de Metodos", "onStart Actividad 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Logeos de Metodos", "onRestart Actividad 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Logeos de Metodos", "onResume Actividad 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Logeos de Metodos", "onPause Actividad 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Logeos de Metodos", "onStop Actividad 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logeos de Metodos", "onDestroy Actividad 1");
    }
}
