package com.dinema.dsc.blackedition.cmdparser.data.dummydata

import com.dinema.dsc.blackedition.cmdparser.domain.model.appssapp.HOMING
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.FACTORY_SETUP
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.RESET_STORICO
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_2A_MISURA_ENCODER
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_AUTOMATIC_MEASURE
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.SET_VERSION
import com.dinema.dsc.blackedition.cmdparser.data.deserialize
import com.dinema.dsc.blackedition.cmdparser.data.serialize
import com.dinema.dsc.blackedition.cmdparser.domain.model.appssapp.STATE_MEASURE
import com.dinema.dsc.blackedition.cmdparser.domain.model.appssapp.STRESS_COUNTER
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.STOP_MEASURE
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.PUT_EVENT
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SEAMLESS_WIDTH_POS
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_CALIBRATION
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_IO
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_SETUP
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_SETUP_LIGHT
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_TEST_STRESS
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_TYPE_MEASURE
import com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss.SET_TYPE_PULL
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.GET_3ENC
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.GET_IO
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.GET_MEASURE
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.GET_MPP
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.GET_STORICO
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.SAVE_CALIBRATION
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.SAVE_USB
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.SET_MESS
import com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp.STATE_AUTOMA


fun testDeserSerialization() {

    // ------------------------------------------------------------------------------ no sub tag cmd

    val xmlRESET_STORICO = """<CMD id="RESET_STORICO"></CMD>"""
    val cmdRESET_STORICO: RESET_STORICO = deserialize<RESET_STORICO>(xmlRESET_STORICO)
    println(
        "$xmlRESET_STORICO \n\n Deserialized: id: $cmdRESET_STORICO.id " +
                "content: $cmdRESET_STORICO.content"
    )

    val serializedRESET_STORICO = serialize<RESET_STORICO>(cmdRESET_STORICO)
    println(
        "Serialized: $serializedRESET_STORICO \n\n" +
                " ---------------------------"
    )


    val xmlFACTORY_SETUP = """<CMD id="FACTORY_SETUP"></CMD>"""
    val cmdFACTORY_SETUP: FACTORY_SETUP = deserialize<FACTORY_SETUP>(xmlFACTORY_SETUP)
    println(
        "$xmlFACTORY_SETUP \n\n Deserialized: id: ${cmdFACTORY_SETUP.id} " +
                "content: ${cmdFACTORY_SETUP.content}"
    )

    val serializedFACTORY_SETUP = serialize<FACTORY_SETUP>(cmdFACTORY_SETUP)
    println(
        "Serialized: $serializedFACTORY_SETUP\n\n" +
                " ---------------------------"
    )


    val xmlSTOP_MEASURE = """<CMD id="STOP_MEASURE">halted</CMD>"""
    val cmdSTOP_MEASURE: STOP_MEASURE = deserialize<STOP_MEASURE>(xmlSTOP_MEASURE)
    println(
        "$xmlSTOP_MEASURE \n\n Deserialized: id: ${cmdSTOP_MEASURE.id} " +
                "content: ${cmdSTOP_MEASURE.content}"
    )

    val serializedSTOP_MEASURE = serialize<STOP_MEASURE>(cmdSTOP_MEASURE)
    println(
        "Serialized: $serializedSTOP_MEASURE \n\n" +
                " ---------------------------"
    )


    val xmlSET_2A_MISURA_ENCODER = """<CMD id="SET_2A_MISURA_ENCODER">stato</CMD>"""
    val cmdSET_2A_MISURA_ENCODER: SET_2A_MISURA_ENCODER =
        deserialize<SET_2A_MISURA_ENCODER>(xmlSET_2A_MISURA_ENCODER)
    println(
        "$xmlSET_2A_MISURA_ENCODER \n\n Deserialized: id: ${cmdSET_2A_MISURA_ENCODER.id} " +
                "content: ${cmdSET_2A_MISURA_ENCODER.content}"
    )

    val serializedSET_2A_MISURA_ENCODER = serialize<SET_2A_MISURA_ENCODER>(cmdSET_2A_MISURA_ENCODER)
    println(
        "Serialized: $serializedSET_2A_MISURA_ENCODER\n\n" +
                " ---------------------------"
    )


    val xmlSET_AUTOMATIC_MEASURE = """<CMD id="SET_AUTOMATIC_MEASURE">on</CMD>"""
    val cmdSET_AUTOMATIC_MEASURE: SET_AUTOMATIC_MEASURE =
        deserialize<SET_AUTOMATIC_MEASURE>(xmlSET_AUTOMATIC_MEASURE)
    println(
        "$xmlSET_AUTOMATIC_MEASURE \n\n Deserialized: id: ${cmdSET_AUTOMATIC_MEASURE.id} " +
                "content: ${cmdSET_AUTOMATIC_MEASURE.content}"
    )

    val serializedSET_AUTOMATIC_MEASURE = serialize<SET_AUTOMATIC_MEASURE>(cmdSET_AUTOMATIC_MEASURE)
    println(
        "Serialized: $serializedSET_AUTOMATIC_MEASURE\n\n" +
                " ---------------------------"
    )


    val xmlHOMING = """<CMD id="HOMING">inHoming</CMD>"""
    val cmdHOMING: HOMING = deserialize<HOMING>(xmlHOMING)
    println(
        "$xmlHOMING \n\n Deserialized: id: ${cmdHOMING.id} " +
                "content: ${cmdHOMING.content}"
    )

    val serializedHOMING = serialize<HOMING>(cmdHOMING)
    println(
        "Serialized: $serializedHOMING\n\n" +
                " ---------------------------"
    )


    // -------------------------------------------------------------------- test for APP to SS

    val xmlPUT_EVENT = """<CMD id="PUT_EVENT">
                                <EV>EV_MEASURE</EV>
                          </CMD>"""
    val cmdPUT_EVENT: PUT_EVENT = deserialize<PUT_EVENT>(xmlPUT_EVENT)
    println(
        "$xmlPUT_EVENT \n\n Deserialized: id: ${cmdPUT_EVENT.id} " +
                "content: ${cmdPUT_EVENT.ev}"
    )

    val serializedPUT_EVENT = serialize<PUT_EVENT>(cmdPUT_EVENT)
    println(
        "Serialized: $serializedPUT_EVENT\n\n" +
                " ---------------------------"
    )


    val xmlSEAMLESS_WIDTH_POS = """<CMD id="SEAMLESS_WIDTH_POS">
                                        <POS>SP_WIDTH_DX</POS>
                                   </CMD>"""
    val cmdSEAMLESS_WIDTH_POS: SEAMLESS_WIDTH_POS =
        deserialize<SEAMLESS_WIDTH_POS>(xmlSEAMLESS_WIDTH_POS)
    println(
        "$xmlSEAMLESS_WIDTH_POS \n\n Deserialized: id: ${cmdSEAMLESS_WIDTH_POS.id} " +
                "content: ${cmdSEAMLESS_WIDTH_POS.pos}"
    )

    val serializedSEAMLESS_WIDTH_POS = serialize<SEAMLESS_WIDTH_POS>(cmdSEAMLESS_WIDTH_POS)
    println(
        "Serialized: $serializedSEAMLESS_WIDTH_POS\n\n" +
                " ---------------------------"
    )


    val xmlSET_CALIBRATION = """<CMD id="SET_CALIBRATION">
                                        <SPEED>SPEED_FAST</SPEED>
                                        <BUTTON_UP>ril</BUTTON_UP>
                                        <BUTTON_DOWN>press</BUTTON_DOWN>
                                        <BUTTON_ACQ>ril</BUTTON_ACQ>
                                </CMD>"""

    val cmdSET_CALIBRATION: SET_CALIBRATION = deserialize<SET_CALIBRATION>(xmlSET_CALIBRATION)
    println(
        "$xmlSET_CALIBRATION \n\n Deserialized: id: ${cmdSET_CALIBRATION.id} " +
                "speed: ${cmdSET_CALIBRATION.speed}, button_up: ${cmdSET_CALIBRATION.buttonUp}," +
                " button_down: ${cmdSET_CALIBRATION.buttonDown}, button_acq: ${cmdSET_CALIBRATION.buttonAcq}"
    )

    val serializedSET_CALIBRATION = serialize<SET_CALIBRATION>(cmdSET_CALIBRATION)
    println(
        "Serialized: $serializedSET_CALIBRATION\n\n" +
                " ---------------------------"
    )


    val xmlSET_IO = """<CMD id="SET_IO">
                            <LIGHT>off</LIGHT>
                       </CMD>"""
    val cmdSET_IO: SET_IO = deserialize<SET_IO>(xmlSET_IO)
    println(
        "$xmlSET_IO \n\n Deserialized: id: ${cmdSET_IO.id} " +
                "light: ${cmdSET_IO.light}"
    )

    val serializedSET_IO = serialize<SET_IO>(cmdSET_IO)
    println(
        "Serialized: $serializedSET_IO\n\n" +
                " ---------------------------"
    )


    val xmlSET_SETUP = """<CMD id="SET_SETUP">
                                <PULL_W>50</PULL_W>
                                <PULL_SPECIAL_W1>55</PULL_SPECIAL_W1>
                                <PULL_SPECIAL_W2>60</PULL_SPECIAL_W2>
                                <PULL_L>60</PULL_L>
                                <PULL_SPECIAL_L1>65</PULL_SPECIAL_L1>
                                <PULL_SPECIAL_L2>70</PULL_SPECIAL_L2>
                                <UNIT>UM_METERS</UNIT>
                          </CMD>"""

    val cmdSET_SETUP: SET_SETUP = deserialize<SET_SETUP>(xmlSET_SETUP)
    println(
        "$xmlSET_SETUP \n\n Deserialized: id: ${cmdSET_SETUP.id} " +
                "pull_w: ${cmdSET_SETUP.pullW}, pull_special_w1: ${cmdSET_SETUP.pullSpecialW1}," +
                " pull_special_w2: ${cmdSET_SETUP.pullSpecialW2}, pull_l: ${cmdSET_SETUP.pullL}," +
                " pull_special_l1: ${cmdSET_SETUP.pullSpecialL1}, pull_special_l2: ${cmdSET_SETUP.pullSpecialL2}," +
                " unit: ${cmdSET_SETUP.unit}"
    )

    val serializedSET_SETUP = serialize<SET_SETUP>(cmdSET_SETUP)
    println(
        "Serialized: $serializedSET_SETUP\n\n" +
                " ---------------------------"
    )


    val xmlSET_SETUP_LIGHT = """<CMD id="SET_SETUP_LIGHT">
                                        <PULL_W>50</PULL_W>   
                                        <PULL_L>60</PULL_L>   
                                        <UNIT>UM_METERS</UNIT>
                                </CMD>"""
    val cmdSET_SETUP_LIGHT: SET_SETUP_LIGHT = deserialize<SET_SETUP_LIGHT>(xmlSET_SETUP_LIGHT)
    println(
        "$xmlSET_SETUP_LIGHT \n\n Deserialized: id: ${cmdSET_SETUP_LIGHT.id} " +
                "pull_w: ${cmdSET_SETUP_LIGHT.pullW}, pull_l: ${cmdSET_SETUP_LIGHT.pullL}," +
                " unit: ${cmdSET_SETUP_LIGHT.unit}"
    )

    val serializedSET_SETUP_LIGHT = serialize<SET_SETUP_LIGHT>(cmdSET_SETUP_LIGHT)
    println(
        "Serialized: $serializedSET_SETUP_LIGHT\n\n" +
                " ---------------------------"
    )


    val xmlSET_TEST_STRESS = """<CMD id="SET_TEST_STRESS">
                                        <ACTIVE>on</ACTIVE>
                                                                               
                                        <MIN_TYPE>ST_CM</MIN_TYPE>   
                                        <MAX_TYPE>ST_CM</MAX_TYPE>             
                                                                      
                                        <W_MIN>40</W_MIN> 
                                        <W_MAX>50</W_MAX>             
                                                                   
                                        <L_MIN>100</L_MIN> 
                                        <L_MAX>150</L_MAX>         
                                                                       
                                        <DURATION>ST_COUNTER</DURATION>
                                        <NUM>3</NUM>
                                  </CMD>"""
    val cmdSET_TEST_STRESS: SET_TEST_STRESS = deserialize<SET_TEST_STRESS>(xmlSET_TEST_STRESS)
    println(
        "$xmlSET_TEST_STRESS \n\n Deserialized: id: ${cmdSET_TEST_STRESS.id} " +
                "active: ${cmdSET_TEST_STRESS.active}, min_type: ${cmdSET_TEST_STRESS.minType}," +
                " max_type: ${cmdSET_TEST_STRESS.maxType}, w_min: ${cmdSET_TEST_STRESS.wMin}," +
                " w_max: ${cmdSET_TEST_STRESS.wMax}, l_min: ${cmdSET_TEST_STRESS.lMin}," +
                " l_max: ${cmdSET_TEST_STRESS.lMax}, duration: ${cmdSET_TEST_STRESS.duration}," +
                " num: ${cmdSET_TEST_STRESS.num}"
    )

    val serializedSET_TEST_STRESS = serialize<SET_TEST_STRESS>(cmdSET_TEST_STRESS)
    println(
        "Serialized: $serializedSET_TEST_STRESS\n\n" +
                " ---------------------------"
    )


    val xmlSET_TYPE_MEASURE = """<CMD id="SET_TYPE_MEASURE">
                                    <TYPE>MT_LENGTH</TYPE>
                                 </CMD>"""
    val cmdSET_TYPE_MEASURE: SET_TYPE_MEASURE = deserialize<SET_TYPE_MEASURE>(xmlSET_TYPE_MEASURE)
    println(
        "$xmlSET_TYPE_MEASURE \n\n Deserialized: id: ${cmdSET_TYPE_MEASURE.id} " +
                "type: ${cmdSET_TYPE_MEASURE.type}"
    )

    val serializedSET_TYPE_MEASURE = serialize<SET_TYPE_MEASURE>(cmdSET_TYPE_MEASURE)
    println(
        "Serialized: $serializedSET_TYPE_MEASURE\n\n" +
                " ---------------------------"
    )


    val xmlSET_TYPE_PULL = """<CMD id="SET_TYPE_PULL">
                                    <TYPE>PULL_NORMAL</TYPE>
                              </CMD>"""
    val cmdSET_TYPE_PULL: SET_TYPE_PULL = deserialize<SET_TYPE_PULL>(xmlSET_TYPE_PULL)
    println(
        "$xmlSET_TYPE_PULL \n\n Deserialized: id: ${cmdSET_TYPE_PULL.id} " +
                "type: ${cmdSET_TYPE_PULL.type}"
    )

    val serializedSET_TYPE_PULL = serialize<SET_TYPE_PULL>(cmdSET_TYPE_PULL)
    println(
        "Serialized: $serializedSET_TYPE_PULL\n\n" +
                " ---------------------------"
    )


    // -------------------------------------------------------------------------- test for SS to APP
    val xmlSET_VERSION = """<CMD id="SET_VERSION">
                                <DSC_VERSION>2.0.0</DSC_VERSION>
                                <MPP_VERSION>DS - 2.5.4 - 1.1</MPP_VERSION>
                                <ENC_VERSION>EE - 0.4.0 - 6.2</ENC_VERSION>
                            </CMD>"""
    val cmdSET_VERSION: SET_VERSION = deserialize<SET_VERSION>(xmlSET_VERSION)
    println(
        "$xmlSET_VERSION \n\n Deserialized: ${cmdSET_VERSION.id} ${cmdSET_VERSION.dscVersion} " +
                "${cmdSET_VERSION.mppVersion} ${cmdSET_VERSION.encVersion}"
    )

    val serializedSET_VERSION = serialize<SET_VERSION>(cmdSET_VERSION)
    println(
        "Serialized: $serializedSET_VERSION\n\n" +
                " ---------------------------"
    )


    val xmlSET_MESS = """<CMD id="SET_MESS">
                                <OP>reset</OP>
                                <ID_MESS>mess</ID_MESS>
                             </CMD>"""
    val cmdSET_MESS: SET_MESS = deserialize<SET_MESS>(xmlSET_MESS)
    println("$xmlSET_MESS \n\n Deserialized: ${cmdSET_MESS.id} ${cmdSET_MESS.op} ${cmdSET_MESS.idMess}")

    val serializedSET_MESS = serialize<SET_MESS>(cmdSET_MESS)
    println(
        "Serialized: $serializedSET_MESS\n\n" +
                " ---------------------------"
    )


    val xmlSTATE_AUTOMA = """<CMD id="STATE_AUTOMA">
                                    <STATE>ST_MEASURE</STATE>
                              </CMD>"""
    val cmdSTATE_AUTOMA: STATE_AUTOMA = deserialize<STATE_AUTOMA>(xmlSTATE_AUTOMA)
    println("$xmlSTATE_AUTOMA \n\n Deserialized: ${cmdSTATE_AUTOMA.id} ${cmdSTATE_AUTOMA.state}")

    val serializedSTATE_AUTOMA = serialize<STATE_AUTOMA>(cmdSTATE_AUTOMA)
    println(
        "Serialized: $serializedSTATE_AUTOMA\n\n" +
                " ---------------------------"
    )


    val xmlGET_3ENC = """<CMD id="GET_3ENC">
                            <PULS_START>ril</PULS_START>
                            <CLIP>larg</CLIP>                         
                            <CLIP_DIAGNO>larg</CLIP_DIAGNO>
                            
                            <ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>
                            <ROTELLA_LAT>nonUsata</ROTELLA_LAT>
                            
                            <ENC_ZONA2>0</ENC_ZONA2>
                            <ENC_ZONA3>0</ENC_ZONA3>
                            <ENC_DIFF>0</ENC_DIFF>
                            
                            <CELLA>assente</CELLA>
                            </CMD>"""
    val cmdGET_3ENC: GET_3ENC = deserialize<GET_3ENC>(xmlGET_3ENC)
    println(
        "$xmlGET_3ENC \n\n Deserialized: ${cmdGET_3ENC.id} ${cmdGET_3ENC.pulsStart} " +
                "${cmdGET_3ENC.clip} ${cmdGET_3ENC.clipDiagno} ${cmdGET_3ENC.rotellaPrinc} " +
                "${cmdGET_3ENC.rotellaLat} ${cmdGET_3ENC.encZona2} ${cmdGET_3ENC.encZona3} " +
                "${cmdGET_3ENC.encDiff} ${cmdGET_3ENC.cella}"
    )

    val serializedGET_3ENC = serialize<GET_3ENC>(cmdGET_3ENC)
    println(
        "Serialized: $serializedGET_3ENC\n\n" +
                " ---------------------------"
    )


    val xmlGET_MPP = """<CMD id="GET_MPP">
                                <ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA>
                                <BATTERY_LEVEL>POWERSUPPLY</BATTERY_LEVEL>
                                <PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET>
                              </CMD>"""
    val cmdGET_MPP: GET_MPP = deserialize<GET_MPP>(xmlGET_MPP)
    println(
        "$xmlGET_MPP \n\n Deserialized: ${cmdGET_MPP.id} ${cmdGET_MPP.adcCalibrazCella} " +
                "${cmdGET_MPP.batteryLevel} ${cmdGET_MPP.pressCella} ${cmdGET_MPP.offset}"
    )

    val serializedGET_MPP = serialize<GET_MPP>(cmdGET_MPP)
    println(
        "Serialized: $serializedGET_MPP\n\n" +
                " ---------------------------"
    )


    val xmlGET_IO = """<CMD id="GET_IO">
                                <MC>LONATI</MC>
                                <COSTA>on</COSTA>
                            </CMD>"""
    val cmdGET_IO: GET_IO = deserialize<GET_IO>(xmlGET_IO)
    println("$xmlGET_IO \n\n Deserialized: ${cmdGET_IO.id} ${cmdGET_IO.mc} ${cmdGET_IO.costa}")

    val serializedGET_IO = serialize<GET_IO>(cmdGET_IO)
    println(
        "Serialized: $serializedGET_IO\n\n" +
                " ---------------------------"
    )


    val xmlGET_MEASURE = """<CMD id="GET_MEASURE">
                                        <MIS>307</MIS>
                                        <MIS2>632</MIS2>
                                        <PESO>502</PESO>
                                        <TIPO>larg</TIPO>
                                </CMD>"""
    val cmdGET_MEASURE: GET_MEASURE = deserialize<GET_MEASURE>(xmlGET_MEASURE)
    println(
        "$xmlGET_MEASURE \n\n Deserialized: ${cmdGET_MEASURE.id} ${cmdGET_MEASURE.mis} " +
                "${cmdGET_MEASURE.mis2} ${cmdGET_MEASURE.peso} ${cmdGET_MEASURE.tipo}"
    )

    val serializedGET_MEASURE = serialize<GET_MEASURE>(cmdGET_MEASURE)
    println(
        "Serialized: $serializedGET_MEASURE\n\n" +
                " ---------------------------"
    )


    val xmlGET_STORICO = """<CMD id="GET_STORICO">               
                                <MIS>1</MIS>                                
                                </CMD>"""
    val cmdGET_STORICO: GET_STORICO = deserialize<GET_STORICO>(xmlGET_STORICO)
    println("$xmlGET_STORICO \n\n Deserialized: ${cmdGET_STORICO.id} ${cmdGET_STORICO.mis}")

    val serializedGET_STORICO = serialize<GET_STORICO>(cmdGET_STORICO)
    println(
        "Serialized: $serializedGET_STORICO\n\n" +
                " ---------------------------"
    )


    val xmlSAVE_USB = """<CMD id="SAVE_USB">
                                 <TYPE>SAVEUSB_MANUAL</TYPE>
                                </CMD>"""
    val cmdSAVE_USB: SAVE_USB = deserialize<SAVE_USB>(xmlSAVE_USB)
    println("$xmlSAVE_USB \n\n Deserialized: ${cmdSAVE_USB.id} ${cmdSAVE_USB.type}")

    val serializedSAVE_USB = serialize<SAVE_USB>(cmdSAVE_USB)
    println(
        "Serialized: $serializedSAVE_USB\n\n" +
                " ---------------------------"
    )


    val xmlSAVE_CALIBRATION = """<CMD id="SAVE_CALIBRATION">
                                        <ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA>
                                  </CMD>"""
    val cmdSAVE_CALIBRATION: SAVE_CALIBRATION = deserialize<SAVE_CALIBRATION>(xmlSAVE_CALIBRATION)
    println(
        "$xmlSAVE_CALIBRATION \n\n Deserialized: ${cmdSAVE_CALIBRATION.id} " +
                "${cmdSAVE_CALIBRATION.adcCalibrazCella}"
    )

    val serializedSAVE_CALIBRATION = serialize<SAVE_CALIBRATION>(cmdSAVE_CALIBRATION)
    println(
        "Serialized: $serializedSAVE_CALIBRATION\n\n" +
                " ---------------------------"
    )

    // --------------------------------------------------------------- test for APP to SS to APP


    val xmlSTATE_MEASURE = """<CMD id="STATE_MEASURE">
                                    <STATE>MEASURE_OFF</STATE>
                                    </CMD>"""
    val cmdSTATE_MEASURE: STATE_MEASURE = deserialize<STATE_MEASURE>(xmlSTATE_MEASURE)
    println(
        "$xmlSTATE_MEASURE \n\n Deserialized: ${cmdSTATE_MEASURE.id} " +
                "${cmdSTATE_MEASURE.state}"
    )


    val serializedSTATE_MEASURE = serialize<STATE_MEASURE>(cmdSTATE_MEASURE)
    println(
        "Serialized: $serializedSTATE_MEASURE\n\n" +
                " ---------------------------"
    )


    val xmlSTRESS_COUNTER = """<CMD id="STRESS_COUNTER">
                                    <MIN>0</MIN>
                                    <MAX>3</MAX>
                                    </CMD>"""
    val cmdSTRESS_COUNTER: STRESS_COUNTER = deserialize<STRESS_COUNTER>(xmlSTRESS_COUNTER)
    println(
        "$xmlSTRESS_COUNTER \n\n Deserialized: ${cmdSTRESS_COUNTER.id} " +
                "${cmdSTRESS_COUNTER.min} ${cmdSTRESS_COUNTER.max}"
    )

    val serializedSTRESS_COUNTER = serialize<STRESS_COUNTER>(cmdSTRESS_COUNTER)
    println(
        "Serialized: $serializedSTRESS_COUNTER\n\n" +
                " ---------------------------"
    )

}


fun testingValidateGET_3ENC() {
    val testCommands = listOf(
        """
        <CMD id="GET_3ENC">
        <PULS_START>ril</PULS_START>
        <CLIP>larg</CLIP>
        <CLIP_DIAGNO>larg</CLIP_DIAGNO>
        <ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>
        <ROTELLA_LAT>nonUsata</ROTELLA_LAT>
        <ENC_ZONA2>0</ENC_ZONA2>
        <ENC_ZONA3>0</ENC_ZONA3>
        <ENC_DIFF>0</ENC_DIFF>
        <CELLA>assente</CELLA>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="GET_3ENC"><PULS_START>ril</PULS_START><CLIP>larg</CLIP><CLIP_DIAGNO>larg</CLIP_DIAGNO><ROTELLA_PRINC>nonUsata</ROTELLA_PRINC><ROTELLA_LAT>nonUsata</ROTELLA_LAT><ENC_ZONA2>0</ENC_ZONA2><ENC_ZONA3>0</ENC_ZONA3><ENC_DIFF>0</ENC_DIFF><CELLA>assente</CELLA></CMD>
    """.trimIndent(),

    """
        <CMD id="GET_3ENC">
        <PULS_START>ril</PULS_START>
        <CLIP>larg</CLIP>
        <CLIP_DIAGNO>larg</CLIP_DIAGNO>
        <ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>
        <ROTELLA_LAT>nonUsata</ROTELLA_LAT>
        <ENC_ZONA2>0</ENC_ZONA2>
        <ENC_ZONA3>0</ENC_ZONA3>
        <ENC_DIFF>0</ENC_DIFF>
        <CELLA>asd</CELLA>
        </CMD>
    """.trimIndent(),

    """
        <CMD id="GET_3ENC">
        <PULS_START>ril</PULS_START>
        <CLIP>larg</CLIP>
        <CLIP_DIAGNO>larg</CLIP_DIAGNO>
        <ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>
        <ROTELLA_LAT>nonUsata</ROTELLA_LAT>
        <ENC_ZONA2>0</ENC_ZONA2>
        <ENC_ZONA3>0</ENC_ZONA3>
        <ENC_DIFF>0</ENC_DIFF>
        
        </CMD>
    """.trimIndent(),


     """
        <CMD id="GET_3ENC">
        <PULS_START>ril</PULS_START>
        <CLIP>larg</CLIP>
        <CLIP_DIAGNO>larg</CLIP_DIAGNO>
        <ROTELLA_PRINC>nonUsata</ROTELLA_PRINC>
        <ROTELLA_LAT>nonUsata</ROTELLA_LAT>
        <ENC_ZONA2>0</ENC_ZONA2>
        <ENC_ZONA3>a</ENC_ZONA3>
        <ENC_DIFF>0</ENC_DIFF>
        <CELLA>assente</CELLA>
        </CMD>
    """.trimIndent()
    )

    testCommands.forEach { command ->
        if (GET_3ENC().validateCommand(command)) {
            println("Il comando ${command} è valido.\n\n")
        } else {
            println("Il comando  ${command} NON è valido.\n\n")
        }
    }
}




fun testingGET_IO() {
    val testCommands = listOf(
        """
            <CMD id="GET_IO">
            <MC>LONATI</MC>
            <COSTA>on</COSTA>
            </CMD>
        """.trimIndent(),

        """
            <CMD id="GET_IO"><MC>SANTONI</MC><COSTA>off</COSTA></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_IO">
            <MC>SANTONI</MC>
            <COSTA>off</COSTA>
            </CMD>
        """.trimIndent(),


        """
            <CMD id="GET_IO">
            <MC>PIPPO</MC>
            <COSTA>off</COSTA>
            </CMD>
        """.trimIndent(),


        """
            <CMD id="GET_IO">
            <MC>SANTONI</MC>
            <COSTA>ddd</COSTA>
            </CMD>
        """.trimIndent()
    )

    testCommands.forEach { command ->
        if (GET_IO().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}



fun testingGET_MEASURE() {
    val testCommands = listOf(
        """
            <CMD id="GET_MEASURE">
            <MIS>307</MIS>
            <MIS2>632</MIS2>
            <PESO>502</PESO>
            <TIPO>larg</TIPO>
            </CMD>
        """.trimIndent(),

        """
            <CMD id="GET_MEASURE"><MIS>307</MIS><MIS2>632</MIS2><PESO>502</PESO><TIPO>larg</TIPO></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_MEASURE"><MIS>307</MIS><MIS2>a</MIS2><PESO>502</PESO><TIPO>larg</TIPO></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_MEASURE">
            <MIS>307</MIS>
            <MIS2>a</MIS2>
            <PESO>502</PESO>
            <TIPO>larg</TIPO>
            </CMD>
        """.trimIndent(),


        """
            <CMD id="GET_MEASURE">
            <MIS>307</MIS>
            <MIS2>632</MIS2>
            <PESO>502</PESO>
            <TIPO>aa</TIPO>
            </CMD>
        """.trimIndent(),

    )

    testCommands.forEach { command ->
        if (GET_MEASURE().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}


fun testingGET_MPP() {
    val testCommands = listOf(
        """
            <CMD id="GET_MPP">
            <ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA>
            <BATTERY_LEVEL>POWERSUPPLY</BATTERY_LEVEL>
            <PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET>
            </CMD>
        """.trimIndent(),

        """
            <CMD id="GET_MPP"><ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA><BATTERY_LEVEL>POWERSUPPLY</BATTERY_LEVEL><PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_MPP"><ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA><BATTERY_LEVEL>dsfsdfs</BATTERY_LEVEL><PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_MPP">
            <ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA>
            <BATTERY_LEVEL>dsfsdfs</BATTERY_LEVEL>
            <PRESS_CELLA>0</PRESS_CELLA><OFFSET>0</OFFSET>
            </CMD>
        """.trimIndent(),


        """
            <CMD id="GET_MPP">
            <ADC_CALIBRAZ_CELLA>0</ADC_CALIBRAZ_CELLA>
            <BATTERY_LEVEL>POWERSUPPLY</BATTERY_LEVEL>
            <PRESS_CELLA>asde</PRESS_CELLA><OFFSET>0</OFFSET>
            </CMD>
        """.trimIndent(),

        )

    testCommands.forEach { command ->
        if (GET_MPP().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}



fun testingGET_STORICO() {
    val testCommands = listOf(
        """
            <CMD id="GET_STORICO">           
            <MIS>1</MIS>           
            </CMD>
        """.trimIndent(),

        """
            <CMD id="GET_STORICO"><MIS>1</MIS></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_STORICO"><MIS>1</MIS>
            </CMD>
        """.trimIndent(),

        """
            <CMD id="GET_STORICO">
            
            <MIS>1</MIS>
            
            
            </CMD>
        """.trimIndent(),

        """
            <CMD id="GET_STORICO"><MIS>1
            </MIS></CMD>
        """.trimIndent(),

        """
            <CMD id="GET_STORICO"><MIS>sfsf</MIS></CMD>
        """.trimIndent(),

        )

    testCommands.forEach { command ->
        if (GET_STORICO().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}




fun testingSAVE_CALIBRATION() {
    val testCommands = listOf(
        """
            <CMD id="SAVE_CALIBRATION">            
            <ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA>           
            </CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_CALIBRATION"><ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA></CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_CALIBRATION">
            
            <ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA></CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_CALIBRATION">
            
            <ADC_CALIBRAZ_CELLA>450</ADC_CALIBRAZ_CELLA>
            
            </CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_CALIBRATION">            
            <ADC_CALIBRAZ_CELLA>sdfwef</ADC_CALIBRAZ_CELLA>           
            </CMD>
        """.trimIndent(),

        )

    testCommands.forEach { command ->
        if (SAVE_CALIBRATION().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}


fun testingSAVE_USB() {
    val testCommands = listOf(
        """
            <CMD id="SAVE_USB">          
            <TYPE>SAVEUSB_MANUAL</TYPE>
            </CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_USB"><TYPE>SAVEUSB_MANUAL</TYPE></CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_USB"><TYPE>SAVEUSB_MANUAL</TYPE>           
            </CMD>
        """.trimIndent(),

        """
            <CMD id="SAVE_USB"><TYPE>ddwe fdw</TYPE>           
            </CMD>
        """.trimIndent()

        )

    testCommands.forEach { command ->
        if (SAVE_USB().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}

fun testingSET_MESS() {
    val testCommands = listOf(
        """
        <CMD id="SET_MESS">
        <OP>set</OP>
        <ID_MESS>DSC_noErr</ID_MESS>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="SET_MESS"><OP>set</OP><ID_MESS>DSC_noErr</ID_MESS></CMD>
    """.trimIndent(),

        """
        <CMD id="SET_MESS"><OP>set</OP>        
        <ID_MESS>DSC_noErr</ID_MESS></CMD>
    """.trimIndent(),

        """
        <CMD id="SET_MESS">
        <OP>set</OP>
        <ID_MESS>InvalidValue</ID_MESS>
        </CMD>
    """.trimIndent(),

        """
            <CMD id="SET_MESS"><OP>sdfsfd</OP>          
            <ID_MESS>DSC_noErr</ID_MESS></CMD>
        """.trimIndent(),


        )

    testCommands.forEach { command ->
        if (SET_MESS().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}


fun testingSET_VERSION() {
    val testCommands = listOf(
        """
        <CMD id="SET_VERSION">
        <DSC_VERSION>2.0.0</DSC_VERSION>
        <MPP_VERSION>DS - 2.5.4 - 1.1</MPP_VERSION>
        <ENC_VERSION>EE - 0.4.0 - 6.2</ENC_VERSION>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="SET_VERSION"><DSC_VERSION>2.0.0</DSC_VERSION><MPP_VERSION>DS - 2.5.4 - 1.1</MPP_VERSION><ENC_VERSION>EE - 0.4.0 - 6.2</ENC_VERSION></CMD>
    """.trimIndent(),

        """
        <CMD id="SET_VERSION">
        <DSC_VERSION>Any String</DSC_VERSION>
        <MPP_VERSION>Another String</MPP_VERSION>
        <ENC_VERSION>Yet Another String</ENC_VERSION>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="SET_VERSION">
        <DSC_VERSION>2</DSC_VERSION>
        <MPP_VERSION>DS - 2.5.4 - 1.1</MPP_VERSION>
        <ENC_VERSION>EE - 0.4.0 - 6.2</ENC_VERSION>
        </CMD>
    """.trimIndent(),

        )

    testCommands.forEach { command ->
        if (SET_VERSION().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}



fun testingSTATE_AUTOMA() {
    val testCommands = listOf(
        """
        <CMD id="STATE_AUTOMA">
        <STATE>ST_MEASURE</STATE>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="STATE_AUTOMA"><STATE>ST_MEASURE</STATE></CMD>
    """.trimIndent(),

        """<CMD id="STATE_AUTOMA">
        <STATE>sdfsf</STATE>
        </CMD>
    """.trimIndent(),


        """<CMD id="STATE_AUTOMA"><STATE>sdfsf</STATE>
        </CMD>
    """.trimIndent(),

        )

    testCommands.forEach { command ->
        if (STATE_AUTOMA().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}



fun testingSTOP_MEASURE() {
    val testCommands = listOf(
        """
        <CMD id="STOP_MEASURE">ended</CMD>
    """.trimIndent(),

        """
        <CMD id="STOP_MEASURE">ended
        </CMD>
    """.trimIndent(),

        """
        <CMD id="STOP_MEASURE">
        ended</CMD>
    """.trimIndent(),


        )

    testCommands.forEach { command ->
        if (STOP_MEASURE().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}



fun testingHOMING() {
    val testCommands = listOf(
        """
        <CMD id="HOMING">inHoming</CMD>
    """.trimIndent(),

        """
        <CMD id="HOMING">inHoming
        </CMD>
    """.trimIndent(),

        """
        <CMD id="HOMING">dfas</CMD>
    """.trimIndent(),


        )

    testCommands.forEach { command ->
        if (HOMING().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}


fun testingSTATE_MEASURE() {
    val testCommands = listOf(
        """
        <CMD id="STATE_MEASURE">
        <STATE>MEASURE_OFF</STATE>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="STATE_MEASURE"><STATE>MEASURE_OFF</STATE></CMD>
    """.trimIndent(),

        """
        <CMD id="STATE_MEASURE">
        <STATE>sadfs</STATE>
        </CMD>
    """.trimIndent(),


        )

    testCommands.forEach { command ->
        if (STATE_MEASURE().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}



fun testingSTRESS_COUNTER() {
    val testCommands = listOf(
        """
        <CMD id="STRESS_COUNTER">
        <MIN>0</MIN>
        <MAX>3</MAX>
        </CMD>
    """.trimIndent(),

        """
        <CMD id="STRESS_COUNTER"><MIN>0</MIN><MAX>3</MAX></CMD>
    """.trimIndent(),

        """
        <CMD id="STRESS_COUNTER">
        <MIN>sdf</MIN>
        <MAX>3</MAX>
        </CMD>
    """.trimIndent(),
    )

    testCommands.forEach { command ->
        if (STRESS_COUNTER().validateCommand(command)) {
            println("Il comando ${command} è valido.\n" +
                    "\n")
        } else {
            println("Il comando ${command} non è valido.\n" +
                    "\n")
        }
    }
}
