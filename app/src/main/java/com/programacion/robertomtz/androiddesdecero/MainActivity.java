package com.programacion.robertomtz.androiddesdecero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPassword = (EditText) findViewById(R.id.et_password);
    }

    public void metodoEntrar(View v){
        String password = etPassword.getText().toString();
        if (password.equals("313087194")){
            Intent intent = new Intent(this, MusicaActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Contraseña erronea!", Toast.LENGTH_SHORT).show();
        }
    }
}
