package com.dinema.dsc.dscserversocketsim

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
// import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket


class DSCApplication: MultiDexApplication() {

    companion object {
        internal var appContext: Context? = null
        internal var application: Application = DSCApplication()

        fun killApp(){
            android.os.Process.killProcess(android.os.Process.myPid())
        }
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        // Avvia il server socket utilizzando coroutines
        CoroutineScope(Dispatchers.IO).launch {
            startServerSocket()
        }
    }


    // for android < 5.0
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }


    private fun startServerSocket() {
        // Qui va il tuo codice server socket dal metodo main()
        val serverPort = 8080
        val serverSocket = ServerSocket(serverPort)
        println("Server in ascolto sulla porta $serverPort...")

        while (true) {
            val clientSocket = serverSocket.accept()
            println("Connessione accettata da ${clientSocket.inetAddress.hostAddress}")

            // Gestisci la connessione client
            CoroutineScope(Dispatchers.IO).launch {
                handleClient(clientSocket)
            }
        }
    }


    // Versione corretta di handleClient che riceve il comando dal socket
    suspend fun handleClient(clientSocket: Socket) {
        withContext(Dispatchers.IO) {
            clientSocket.use { socket ->
                val input = socket.getInputStream().bufferedReader()
                val output = PrintWriter(socket.getOutputStream(), true)

                // Leggi il comando inviato dal client
                val command = input.readLine()
                println("Comando intero inviato al client :${command}")

                // Suddividi il comando in token basati sul separatore e inviali al client
                val commands = command.split(";")
                println("Comando frammentato inviato al client:")
                for (cmd in commands) {
                    output.println(cmd)
                    // Simula una pausa tra l'invio di ciascun frammento
                    delay(500)
                }


            }
        }
    }
}