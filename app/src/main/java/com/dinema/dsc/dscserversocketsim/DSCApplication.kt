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


    companion object {
        internal var appContext: Context? = null
        internal var application: Application = DSCApplication()
        var clientSocket: Socket? = null
        val serverPort = 8080
        val serverSocket = ServerSocket(serverPort)

        fun killApp() {
            android.os.Process.killProcess(android.os.Process.myPid())
        }

        fun startServerSocket() {

            println("Server in ascolto sulla porta $serverPort...")

            while (true) {

                clientSocket = serverSocket.accept()

                if (clientSocket != null) {
                    println("Connessione accettata da ${clientSocket!!.inetAddress.hostAddress}")

                    // Gestisci la connessione client
                    /*CoroutineScope(Dispatchers.IO).launch {
                    // handleClient(clientSocket!!)
                    handleClient()
                }*/
                }
            }
        }


        // Versione corretta di handleClient che riceve il comando dal socket
        suspend fun handleClient(/*clientSocket: Socket*/ command: String) {
            withContext(Dispatchers.IO) {
                clientSocket.use { socket ->
                    // val input = socket.getInputStream().bufferedReader()
                    val output = socket?.getOutputStream()?.let { PrintWriter(it, true) }

                    // Leggi il comando inviato dal client
                    /*val command = input.readLine()
                println("Comando intero inviato dal client :${command}")*/

                    // Suddividi il comando in token basati sul separatore e inviali al client
                    val commands = command.split(";")
                    println("Comando frammentato inviato al client:")
                    for (cmd in commands) {
                        if (output != null) {
                            output.println(cmd)
                        }
                        // Simula una pausa tra l'invio di ciascun frammento
                        delay(500)
                    }


                    // Simula l'invio di un comando frammentato
                    /*val commands_01 = listOf(
                    "<CMD id=\"example_01\">",
                    "Parte1 del comando_01; ",
                    "Parte2 del comando_01; ",
                    "Parte3 del comando_01; ",
                    "</CMD>"
                )

                for (command in commands_01) {
                    output.println(command)
                    // Simula una pausa tra l'invio di ciascun frammento
                    // delay(100) // sostituisce Thread.sleep() in un contesto di coroutine
                }

                // Simula l'invio di un comando frammentato
                val commands_02 = listOf(
                    "<CMD id=\"example_02\">",
                    "Parte1 del comando_02; ",
                    "Parte2 del comando_02; ",
                    "Parte3 del comando_02; ",
                    "</CMD>"
                )

                for (command in commands_02) {
                    output.println(command)
                    // Simula una pausa tra l'invio di ciascun frammento
                    // delay(100) // sostituisce Thread.sleep() in un contesto di coroutine
                }*/

                    // Chiudi la connessione
                    // socket.close()

                }
            }
        }
    }
}