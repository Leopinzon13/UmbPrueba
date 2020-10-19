package com.example.umbprueba

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainPag3: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagina3)

        val boton: Button = findViewById(R.id.BtnReg)
        boton.setOnClickListener {
            val fec: EditText = findViewById(R.id.Txtfec)
            val asu: EditText = findViewById(R.id.TxtAsu)
            val act: EditText = findViewById(R.id.TxtAct)

            val TxtFec: TextView = findViewById(R.id.TextAct1)
            val TxtAsu: TextView = findViewById(R.id.TextAsu1)
            val TxtAct: TextView = findViewById(R.id.TextFec1)

            val TxtFec2: TextView = findViewById(R.id.TextAct2)
            val TxtAsu2: TextView = findViewById(R.id.TextAsu2)
            val TxtAct2: TextView = findViewById(R.id.TextFec2)

            val TxtFec3: TextView = findViewById(R.id.TextAct3)
            val TxtAsu3: TextView = findViewById(R.id.TextAsu3)
            val TxtAct3: TextView = findViewById(R.id.TextFec3)



            if (TxtFec.getText().toString() === ""){
                TxtFec.setText(fec.getText().toString())
                TxtAsu.setText(asu.getText().toString())
                TxtAct.setText(act.getText().toString())
            }else if(TxtFec.getText().toString() !== ""){
                TxtFec2.setText(fec.getText().toString())
                TxtAsu2.setText(asu.getText().toString())
                TxtAct2.setText(act.getText().toString())
            }else if(TxtFec2.getText().toString() !== ""){
                TxtFec3.setText(fec.getText().toString())
                TxtAsu3.setText(asu.getText().toString())
                TxtAct3.setText(act.getText().toString())
            }

        }



    }
}