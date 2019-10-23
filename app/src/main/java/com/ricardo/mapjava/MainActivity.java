package com.ricardo.mapjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String ana = "Ana";
    String categoria3 = "categoria3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, String> hola = new HashMap<>();
        hola.put("categoria1", "pepe");
        hola.put("categoria2", "jorge");
        hola.put(categoria3, ana);

        String extraida = hola.get(categoria3);
        Log.d("MIOOOOOOOOOO", "el valor del hasmap extraido es: " + extraida);
        Log.d("MIOOOOOOOOOO", "el valor del hasmap extraido es: " + hola.get("categoria1"));

//    myMap.size(); // Devuelve el numero de elementos del Map
//    myMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
//    myMap.put(K clave, Vvalor); // Añade un elemento al Map
//    myMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
//    myMap.clear(); // Borra todos los componentes del Map
//    myMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
//    myMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
//    myMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
//    myMap.values(); // Devuelve una "Collection" con los valores del Map
    }
}
