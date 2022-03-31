package com.example.myapplicationkootlin

/*

Author: Ing. Carlos Otero Ramírez

 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() , View.OnClickListener {

    var num:Int = 0;
    var contador:Int = 0;
    var guardar:String = "";

    var editText1: EditText?= null;

    var button1:Button ?= null;
    var button2:Button ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("Cantidad de Número Introducidos");

        editText1 = findViewById(R.id.AM1_id2);

        button1 = findViewById(R.id.AM1_id3);
        button1!!.setOnClickListener(this);

        button2 = findViewById(R.id.AM1_id4);
        button2!!.setOnClickListener(this);
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.AM1_id3 ->
                if(editText1?.text.toString().isEmpty()) {
                    Toast.makeText(this, "El Campo de Texto esta Vacio", Toast.LENGTH_SHORT).show();
                } else {
                    contador++;
                    num = Integer.parseInt(this.editText1?.text.toString());
                    guardar+= "$num ";
                    print("Total de Números introducidos: $contador\nNúmeros introducidos: $guardar");
                    Toast.makeText(this, "Total de Números introducidos: $contador\nNúmeros introducidos: $guardar", Toast.LENGTH_SHORT).show();
                }
            R.id.AM1_id4 ->
                System.exit(0);
        }
    }
}