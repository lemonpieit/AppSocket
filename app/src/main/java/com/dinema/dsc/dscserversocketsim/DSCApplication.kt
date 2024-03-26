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
import java.io.IOException
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket
import kotlin.random.Random


class DSCApplication : MultiDexApplication() {



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
            CoroutineScope(Dispatchers.IO).launch {
                while (true) {
                    try {
                        clientSocket = serverSocket.accept()
                        if (clientSocket != null) {
                            println("Connessione accettata da ${clientSocket!!.inetAddress.hostAddress}")
                            launch {
                                handleClient_01(
                                    clientSocket!!, "Initial command : TEST "
                                )
                            }
                        }
                    } catch (e: IOException) {
                        e.printStackTrace()
                        // Handle exception, like a server socket close exception
                    }
                }
            }
        }


        suspend fun handleClient_01(clientSocket: Socket, initialCommand: String) {
            var fragmentedCmdslist: MutableList<String> = mutableListOf()
            var fragmentedCmdslist_02: MutableList<String> = mutableListOf()

            fragmentedCmdslist = mutableListOf(
                "<CMD id=\"SET_VERSION\"><DSC_VERSION>2.0.0</DSC_VERSION>;<MPP_VERSION>DS-2.5.4-1.1</MPP_VERSION>;<ENC_VERSION>EE-0.4.0-6.2</ENC_VERSION>;</CMD>",
                "<CMD id=\"SET_MESS\">;<OP>reset</OP><ID_MESS>mess</ID_MESS>;</CMD>",
                "<CMD id=\"STATE_AUTOMA\"><STATE>ST_MEASURE</STATE>;</CMD>;",
                "<CMD id=\"GET_3ENC\"><PULS_START>ril</PULS_START>;<CLIP>larg;</CLIP><CLIP_DIAGNO>;larg</CLIP_DIAGNO><ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>;<ROTELLA_LAT>nonUsata</ROTELLA_LAT><ENC_ZONA2>0;</ENC_ZONA2><ENC_ZONA3>0</ENC_ZONA3><ENC_DIFF>0</ENC_DIFF>;<CELLA>assente;</CELLA></CMD>",
                "<CMD id=\"GET_MPP\"><ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA>;<BATTERY_LEVEL>;POWERSUPPLY</BATTERY_LEVEL><PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET>;</CMD>",
                "<CMD id=\"GET_IO\"><MC>LONATI</MC>;;<COSTA>on</COSTA><;/;CMD>",
                "<CMD id;=\"GET_MEASURE\"><MIS>307</MIS><;MIS2>632</MIS2>;<PESO>502<;/PESO><TIPO>;larg</TIPO></;CMD>;",
                "<CMD id=\"GET_;STORICO\"><MI;S>1</MIS></CMD>;",
                "<CMD id=;\"SAVE_USB\"><TYPE>SAVEUSB_MANUAL</TYPE>;</CMD>",
                "<CMD ;id=\"SAVE_CALIBRATION\"><ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA></CMD>",
                "<CMD id;=\"STOP_MEASURE\">halted</CMD>",
                "<CMD id=\"STATE_MEASURE\"><STATE>MEASURE_OFF</STATE></CMD>",
                "<CMD id=;\"STRESS_COUNTER\"><MIN>;0</MIN><M;AX>3</MAX></CMD>",
                "<C;MD id;=\"HOMING\">inHoming</CMD>"
            )

            fragmentedCmdslist_02 = mutableListOf(
                """<CMD id="SET_VERSION">
                    <DSC_VERSION>2.0.0</DSC_VERSION>;
                    <MPP_VERSION>DS - 2.5.4 - 1.1</MPP_VERSION>;
                    <ENC_VERSION>EE - 0.4.0 - 6.2</ENC_VERSION>;
                </CMD>""",


                """<CMD id="SET_MESS">;
                    <OP>reset</OP>
                    <ID_MESS>mess</ID_MESS>;
                </CMD>""",

                """<CMD id="STATE_AUTOMA">
                    <STATE>ST_MEASURE</STATE>;
                </CMD>;""",

                """<CMD id="GET_3ENC">
                    <PULS_START>ril</PULS_START>;
                    <CLIP>larg;</CLIP>                         
                    <CLIP_DIAGNO>;larg</CLIP_DIAGNO>
                    
                    <ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>;
                    <ROTELLA_LAT>nonUsata</ROTELLA_LAT>
                    
                    <ENC_ZONA2>0;</ENC_ZONA2>
                    <ENC_ZONA3>0</ENC_ZONA3>
                    <ENC_DIFF>0</ENC_DIFF>;
                    
                    <CELLA>assente;</CELLA>
                </CMD>""",


                """<CMD id="GET_MPP">
                    <ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA>;
                    <BATTERY_LEVEL>;POWERSUPPLY</BATTERY_LEVEL>
                    <PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET>
                ;</CMD>""",


                """<CMD id="GET_IO">
                    <MC>LONATI</MC>;
                    ;<COSTA>on</COSTA>
                <;/;CMD>""",


                """<CMD id;="GET_MEASURE">
                    <MIS>307</MIS>
                    <;MIS2>632</MIS2>;
                    <PESO>502<;/PESO>
                    <TIPO>;larg</TIPO>
                </;CMD>;""",


                """<CMD id="GET_;STORICO">               
                    <MI;S>1</MIS>                                
                </CMD>;""",


                """<CMD id=;"SAVE_USB">
                    <TYPE>SAVEUSB_MANUAL</TYPE>;
                </CMD>""",


                """<CMD; id="SAVE_CALIBRATION">
                     <ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA>
                </CMD>""",


                """<CMD id;="STOP_MEASURE">halted</CMD>""",


                """<CMD id="STATE_MEASURE">
                     <STATE>MEASURE_OFF</STATE>
                </CMD>""",


                """<CMD id=;"STRESS_COUNTER">
                     <MIN>;0</MIN>
                     <M;AX>3</MAX>
                </CMD>""",


                """<C;MD id;="HOMING">inHoming</CMD>"""
            )

            withContext(Dispatchers.IO) {
                clientSocket.use { socket ->
                    // get client msgs if sent
                    val input = socket.getInputStream().bufferedReader()
                    val message = input.readLine()
                    println("Messaggio  ricevuto dal client :${message}")
                    // open stream to send msgs to client
                    val output = PrintWriter(socket.getOutputStream(), true)
                    var count = 0

                    // Send initial command
                    output.println(initialCommand)
                    println("Initial command sent to client: $initialCommand")

                    try {
                        while (true) {
                            val sendsCount = "Command count: ${count++} "
                            println("Command count sent to client: $sendsCount ")
                            output.println(sendsCount)
                            val commandLine = fragmentedCmdslist[Random.nextInt(0, 14)]
                            val commands = commandLine.split(";")
                            for (cmd in commands) {
                                if (output != null) {
                                    println("Comando frammentato inviato al client:$cmd ")
                                    output.println(cmd)
                                }
                                // Simula una pausa tra l'invio di ciascun frammento
                                delay(Random.nextInt(200, 2000).toLong())
                            }
                        }
                    } catch (e: Exception) {
                        println("Error or client disconnected: ${e.message}")
                    }
                }
            }


        }




    }





}