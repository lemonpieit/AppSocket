package com.dinema.dsc.blackedition.cmdparser.domain.control

import android.app.IntentService
import android.content.Intent
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.InetSocketAddress
import java.net.Socket

class SocketListenerService : IntentService("SocketListenerService") {

    override fun onHandleIntent(intent: Intent?) {
        val socket = Socket()
        try {
            socket.connect(InetSocketAddress("127.0.0.1", 8080), 5000)
            val input = BufferedReader(InputStreamReader(socket.getInputStream()))

            val message = input.readLine()
            // Processa il messaggio ricevuto qui
            // Considera l'invio di un broadcast o l'uso di EventBus per comunicare con l'UI o altre parti dell'app

            val restartIntent = Intent("com.dinema.dsc.blackedition.RESTART_SOCKET_SERVICE")
            sendBroadcast(restartIntent)

        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            socket.close()
        }
    }
}