package com.archivos;

import android.app.Activity;
import com.logica.Producto.Producto;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class creacionJson {


    // On decoding, the default concrete class of java.util.List is org.json.simple.JSONArray and the default concrete class of java.util.Map is org.json.simple.JSONObject.

    // Encoding JSON in Java
    // Following is a simple example to encode a JSON object using Java JSONObject which is a subclass of java.util.HashMap. No ordering is provided. If you need the strict ordering of elements, use JSONValue.toJSONString ( map ) method with ordered map implementation such as java.util.LinkedHashMap.

    public JSONObject crearJsonProducto(Producto p) {



        JSONObject producto = new JSONObject();

        try {
            producto.put("name", p.getNombre());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            producto.put("price", p.getPrecio());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            producto.put("desc", p.getDescripcion());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            producto.put("quantity", p.getCantidad());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            producto.put("visible",p.isPrecioVisible());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            producto.put("imgroute", p.getUbicImg());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            producto.put("userID",p.getUserID());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return producto;
    }



    public void escribirArchivo(JSONObject producto, Activity a) throws IOException {

        File file = new File(a.getFilesDir(), "text");
        if (!file.exists()) {
            file.mkdir();
        }

        try{
            File f = new File (file, "producto");
            FileWriter fileW=new FileWriter(f);
            fileW.append(producto.toString());
            fileW.flush();
            fileW.close();
            System.out.println(file);}
        catch (Exception e){
            e.printStackTrace();
        }}


}