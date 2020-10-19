package com.example.umbprueba

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.pagina1.*
import kotlinx.android.synthetic.main.pagina2.*

class MainPag2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagina2)

        webBus.webChromeClient = object : WebChromeClient(){}
        webBus.webViewClient = object  : WebViewClient(){}

        val conf:WebSettings = webBus.settings
        conf.javaScriptEnabled = true
        webBus.loadUrl("https://google.com/")
    }

}