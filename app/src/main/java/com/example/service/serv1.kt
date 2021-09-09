package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.view.View
import android.widget.Button
import android.widget.TextView

class serv1 : Service() {

    override fun onCreate() {
        super.onCreate()
        println("onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("onStartCommand")
        someTask()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")

        stopSelf();
    }


    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    private fun someTask() {
        println("начало работы сервиса"); var count=0
        while (true) {
            Thread.sleep(5000); count++;    println("работает  $count")
        }
    }
}