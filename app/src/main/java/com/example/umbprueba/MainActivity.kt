package com.example.umbprueba

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pagina1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button= findViewById(R.id.BtnPag)
        boton.setOnClickListener {
            val i  = Intent(this,MainPag1::class.java)
            startActivity(i)
        }
        val boton2: Button= findViewById(R.id.BtnPagBus)
        boton2.setOnClickListener {
            val i  = Intent(this,MainPag2::class.java)
            startActivity(i)
        }
        val boton3: Button= findViewById(R.id.BtnPagMen)
        boton3.setOnClickListener {
            val i  = Intent(this,MainPag3::class.java)
            startActivity(i)
        }
    }
}