package com.dinema.dsc.blackedition.cmdparser.domain.control

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class RestartSocketServiceReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (context != null) {
            context.startService(Intent(context, SocketListenerService::class.java))
            Log.d("rssr", "onReceive: SocketListenerService started.")
        }
    }
}