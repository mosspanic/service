package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var bt1: Button? = null
    var bt2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1 = findViewById<View>(R.id.bstart) as Button
        bt1!!.setOnClickListener(View.OnClickListener {
            startService(Intent(this, serv1::class.java));
        })

        bt2 = findViewById<View>(R.id.bstop) as Button
        bt2!!.setOnClickListener(View.OnClickListener {
            stopService(Intent(this, serv1::class.java));
        })
        //fun onClickStart(v:View) {
          //  startService(Intent(this, serv1::class.java));
        //}        fun onClickStop(v: View) {            stopService(Intent(this, serv1::class.java));        }
    }
}