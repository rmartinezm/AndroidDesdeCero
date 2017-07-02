package com.programacion.robertomtz.androiddesdecero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaremos nuestro EditText para poderlo utilizar dentro de toda nuestra Clase
     */
    EditText etPassword;

    /**
     * El Método onCreate es el primero en ejecutarse cuando abrimos nuestra ventana
     * Es común que en este método asignemos los valores a nuestras variables
     */
    // @Override es una etiqueta que por el momento no vale la pena aprender
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Las dos siguientes lineas se crean automaticamente cuando es creado el Activity.
        // Es mejor no moverlas y no escribir instrucciones antes de estas dos lineas.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // findViewById(R.id.miIdentificador) es la forma en que vinculamos un View de nuestro .xml
        // con un Objeto en Java.
        // Colocamos antes de esta funcion entre parentesis el Objeto que guardaremos en nuestra
        // variable.

        etPassword = (EditText) findViewById(R.id.et_password);
    }

    /**
     * Este metodo se ejecutara cuando el botón en que tengamos la propiedad
     * android:onClick="metodoEntrar" sea precionado
     * El parametro view: Se pone obligatoriamente por razones no tan importantes.
     */
    public void metodoEntrar(View view){
        // El método getText() de un TextView sirve para extraer el texto introducido en él.
        // El método toString() es obligatorio para convertir el texto a un String
        String password = etPassword.getText().toString();

        // El método equals("otro String") sirve para verificar si una cadena de texto es igual
        // a otra. (Para los String no es recomendable utilizar la comparacion de numeros == )
        if (password.equals("123456")){

            // El objeto Intent es el que nos sirve para movernos dentro de la aplicacion.
            // No solo sirve para cambiar de pantalla, tambien podriamos abrir la camara, la galeria,
            // una pagina de internet, etc. pero con otra sintaxis.
            // Como parametros recibe la palabra reservada 'this' además del nombre de la clase
            // a la que queremos ir seguida de .class
            Intent intent = new Intent(this, MusicaActivity.class);

            // Con este método ejecutamos el intent para cambiar de pantalla
            startActivity(intent);
        }else{
            // Toast es un Objeto que nos proporciona android para mostrar informacion a nuestro
            // usuario. Se utiliza para mensajes cortos cuando ocurre algo dentro de la aplicacion.
            // Para crear un Toast es necesario seguir esta sintaxis.
            // Recibe como primer parametro la palabra 'this' seguido del texto que queremos mostrar
            // y por ultimo las palabras Toast.LENGTH_SHORT si queremos que el Toast se muestre
            // poco tiempo o bien Toast.LENGTH_LONG si queremos que se muestre un poco mas tiempo.
            Toast.makeText(this, "Contraseña erronea!", Toast.LENGTH_SHORT).show();
        }
    }
}
