package com.dinema.dsc.dscserversocketsim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.PrintWriter
import java.net.Socket

class MainActivity : AppCompatActivity() {
    private val serverAddress = "127.0.0.1"
    private val serverPort = 8080

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_01).setOnClickListener { sendCommand("comando1;Parte1;Parte2;Parte3") }
        findViewById<Button>(R.id.button_02).setOnClickListener { sendCommand("comando2;ParteA;ParteB;ParteC") }
    }

    /*private fun sendCommand(command: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val socket = Socket(serverAddress, serverPort)
                val output = PrintWriter(socket.getOutputStream(), true)
                output.println(command)
                socket.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }*/

    private  fun sendCommand(command: String) {
        CoroutineScope(Dispatchers.IO).launch {
            DSCApplication.clientSocket?.let { DSCApplication.handleClient(it,command) }
        }
    }
}