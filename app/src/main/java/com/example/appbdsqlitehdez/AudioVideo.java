package com.example.appbdsqlitehdez;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class AudioVideo extends AppCompatActivity implements View.OnClickListener {
    public Button btnDetener,btnReproducir;
    public MediaPlayer  reproductor ;
    public Video videoPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_video);
        btnReproducir=findViewById(R.id.btnReproducir);
        btnDetener=findViewById(R.id.btnDetener);
        videoPrueba=()findViewById(R.id.vvPrueba);

        btnReproducir.setOnClickListener(this);
        btnDetener.setOnClickListener(this);

        @Override
        Public void onClick(View view)
        {
            if(view.getTo()==R.se.btnReproducir)
            {
                stop();
            }
            if (view.getTo()==R.se.btnDetener)
            {
                stop();
            }
        }
        private void play_mp1(){//inicia metodo
            reporductor=MediaPlayer.create(this, R.raw.sonido);
            reporductor.start();
        }//termina metodo

        private void stop(){//inicia metodo
            reporductor.stop();
        }//termina metodo

    }
}