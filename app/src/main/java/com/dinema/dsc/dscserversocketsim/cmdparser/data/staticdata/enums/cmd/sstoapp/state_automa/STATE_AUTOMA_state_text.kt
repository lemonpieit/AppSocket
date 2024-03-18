package com.dinema.dsc.blackedition.cmdparser.data.staticdata.enums.cmd.sstoapp.state_automa

enum class STATE_AUTOMA_state_text(val paramName: String) {
    ST_STARTUP("prima fase di avvio DSC"),
    ST_STARTUP2("seconda fase di avvio DSC per acquisizione info mpp"),
    ST_OPERATIVE("DSC operativo in attesa di comandi"),
    ST_MEASURE("DSC in misurazione"),
    ST_SECONDMEASURE("DSC in seconda misurazione"),
    ST_ERROR("DSC in errore"),
    ST_LINK("DSC in connessione alla macchina"),
    ST_LINKED("DSC connesso alla macchina"),
    ST_CALIBRATION("DSC in calibrazione"),
    ST_DIAGNOSE("DSC in diagnostica"),
    ST_OUTOFORDER("DSC fuori servizio"),
    ST_UPDATE("DSC in aggiornamento")
}