package com.programacion.robertomtz.androiddesdecero;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MusicaActivity extends AppCompatActivity {

    /**
     * Declaramos nuestro Objeto MediaPlayer con el que reproduciremos nuestras canciones
     */
    MediaPlayer miReproductorMusical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);

        // La palabra reservada 'null' es de gran importancia en la programación orientada a
        // Objetos, con ella estamos diciendo que nuestro Objeto es nulo, o que no existe.
        // Con esta instruccion estamos diciendo que nuestro reproductorMusical aún no existe, pero
        // que lo crearemos en algun momento de nuestra aplicacion.
        miReproductorMusical = null;
    }

    /**
     * Metodo que se ejecutara al dar click sobre la imagen que tiene el metodo onClick con este metodo
     */
    public void metodoPxndx(View v){
        // Esta condicion es necesaria para que la aplicacion pueda detener el reproductor de musica
        // si este ya fue creado anteriormente.
        // Si no colocaramos la condicional 'miReproductorMusical != null' la aplicacion querra
        // detener algo que no existe por el momento y eso haria que la aplicación se detuviera
        if (miReproductorMusical != null) {
            miReproductorMusical.stop();
        }

        // Esta es una forma muy común de crear objetos en Java sin tener que llamar a la palabra
        // recervada 'new' Se coloca el nombre de la Clase del que queremos el Objeto seguido de
        // la intruccion '.create' con el parametro this y las palabras R.raw.nombre_cancion
        // para hacer referencia a la cancion en nuestra carpeta raw.
        // No todas las Clases tienen la posibilidad de crear Objetos de esta manera.
        // Nosotros tenemos que crearlos. (Quzá en el curso Android Básico a Intermedio lo veamos)
        miReproductorMusical = MediaPlayer.create(this, R.raw.pxndx_cancion);

        // Con el método start() iniciamos la canción que pasamos como parametro en la creación
        // del Objeto.
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

    /**
     * El Método onStop() se ejecuta cuando la pantalla fue detenida de alguna forma.
     * Puede ser que la aplicación se haya minimizado o que el telefono fue bloqueado, así que dentro
     * de éste metodo pondremos las acciones que necesitamos que se realicen antes de que
     * la aplicacion se detenga.
     * Las palabras super.onStrop() son necesarias para que la aplicacion pueda minimizarse de
     * la forma correcta. siempre tiene que ir al final de nuestro método.
     */
    @Override
    protected void onStop() {
        // Hacemos la misma condicional para que la aplicacion no se detenga si solo queremos
        // detener la musica
        if (miReproductorMusical != null) {
            // Con el metodo stop() hacemos que la música se detenga.
            miReproductorMusical.stop();
        }
        super.onStop();
    }
}
