package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.socket.client.IO;
import io.socket.client.Socket;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IO.socket("https://caridosen.online/").connect();

    }
}