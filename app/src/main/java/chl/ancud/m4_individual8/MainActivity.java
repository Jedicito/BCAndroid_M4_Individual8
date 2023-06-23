package chl.ancud.m4_individual8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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


}