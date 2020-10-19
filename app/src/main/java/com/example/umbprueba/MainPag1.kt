package com.example.umbprueba

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.pagina1.*

class MainPag1: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagina1)
        VisorWeb.webChromeClient = object : WebChromeClient(){}
        VisorWeb.webViewClient = object  : WebViewClient(){}

        val conf:WebSettings = VisorWeb.settings
        conf.javaScriptEnabled = true
        VisorWeb.loadUrl("https://umb.edu.co/")
    }

}