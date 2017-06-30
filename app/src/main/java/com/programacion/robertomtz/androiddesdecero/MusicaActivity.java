package com.programacion.robertomtz.androiddesdecero;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MusicaActivity extends AppCompatActivity {

    MediaPlayer miReproductorMusical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);

        miReproductorMusical = null;
    }

    public void metodoPxndx(View v){
        if (miReproductorMusical != null) {
            miReproductorMusical.stop();
        }
        miReproductorMusical = MediaPlayer.create(this, R.raw.pxndx_cancion);
        miReproductorMusical.start();
    }

    public void metodoPanic(View v){
        if (miReproductorMusical != null) {
            miReproductorMusical.stop();
        }
        miReproductorMusical = MediaPlayer.create(this, R.raw.panic_cancion);
        miReproductorMusical.start();
    }

    public void metodoDivision(View v){
        if (miReproductorMusical != null) {
            miReproductorMusical.stop();
        }
        miReproductorMusical = MediaPlayer.create(this, R.raw.division_cancion);
        miReproductorMusical.start();
    }

    public void metodoMaluma(View v){
        if (miReproductorMusical != null) {
            miReproductorMusical.stop();
        }
        miReproductorMusical = MediaPlayer.create(this, R.raw.maluma_cancion);
        miReproductorMusical.start();
    }

    @Override
    protected void onStop() {
        if (miReproductorMusical != null) {
            miReproductorMusical.stop();
        }
        super.onStop();
    }
}
