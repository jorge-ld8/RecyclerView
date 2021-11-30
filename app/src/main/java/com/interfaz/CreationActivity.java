package com.interfaz;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.archivos.creacionJson;
import com.example.recyclerview.R;
import com.logica.Producto.Producto;

import java.io.IOException;


public class CreationActivity extends AppCompatActivity {
    private Producto p = new Producto();
    private creacionJson j = new creacionJson();

    public void siguienteActivity(View v) {
        startActivityForResult(new Intent(CreationActivity.this, com.interfaz.MenuPublicacion.class), 1);

    }

    //para recibir datos de menuPublicacion
    public void onActivityResult(int requestCode, int resultCode, Intent datos) {

        super.onActivityResult(requestCode, resultCode, datos);
        if ((requestCode == 1) && (resultCode == RESULT_OK)) {
            //agregar los datos al producto
            p.setNombre(datos.getStringExtra("nombre"));
            p.setDescripcion(datos.getStringExtra("desc"));
            p.setPrecio(Float.parseFloat(datos.getStringExtra("precio")));
            p.setCantidad(Integer.parseInt(datos.getStringExtra("cantidad")));
            p.setPrecioVisible(Boolean.parseBoolean(datos.getStringExtra("visible")));
            p.setUbicImg(datos.getStringExtra("img"));

            p.setUserID("USERID_A");//AQUI INSERTAR ID DEL USUARIO

            //añadir el producto a la lista
            Log.d(TAG, "onActivityResult: PRODUCTO" + p);
            MainActivity.productos.add(p);

            //comprueba que se agregaron los datos
            TextView temp1 = findViewById(R.id.textView);
            temp1.setText(p.getNombre());
            try {
                j.escribirArchivo(j.crearJsonProducto(p), CreationActivity.this);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(j.crearJsonProducto(p));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get el intent que se paso desde main activity
        Intent mainIntent = getIntent();
        Log.d(TAG, "onCreate de Creation Activity: intent recieved");

        //ArrayList<Producto> productos = mainIntent.getExtras().getParcelableArrayList("lista_productos");
    }
}