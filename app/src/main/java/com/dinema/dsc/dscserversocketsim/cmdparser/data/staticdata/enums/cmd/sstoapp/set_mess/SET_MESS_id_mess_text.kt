package com.dinema.dsc.blackedition.cmdparser.data.staticdata.enums.cmd.sstoapp.set_mess

enum class SET_MESS_id_mess_text(val paramName: String) {
    DSC_noErr("ad uso s_dscCmd_ResetMess per qualsiasi messaggio"),
    DSC_homing("AZZERAMENTO"),
    DSC_waitStartup("ATTESA AVVIO"),
    DSC_outOfOrder("FUORI SERVIZIO"),
    DSC_MOTOR_COMMUNICATION("Comunicazione motore"),
    DSC_CAN_BUFFER_FULL("Buffer CAN pieno"),
    DSC_MPP_TOOMANY("Troppi MPP"),
    DSC_VERSION_MPP_MOTOR_DRIVER("Versione driver motore"),
    DSC_MPP_NOT_IDENTIFY("MPP non identificata"),
    DSC_3ENC_TOOMANY("Troppe 3ENC"),
    DSC_VERSION_3ENC_MOTOR_DRIVER("Versione 3ENC"),
    DSC_3ENC_NOT_IDENTIFY("3ENC non identificata"),
    DSC_CONFIGURATION("Configurazione"),
    DSC_UPDATE_FAILED("Aggiornamento fallito"),
    DSC_TURN_OFF("Spegnere"),
    DSC_MISSING_LOAD_CELL("CELLA DI CARICO MANCANTE"),
    DSC_MPP_VCC_HIGH("VCC MPP alta"),
    DSC_MPP_OVERCURRENT("MPP sovracorrente"),
    DSC_MPP_TEMPERATURE("MPP Temperatura"),
    DSC_MPP_HW_UNKNOWN("MPP HW non riconosciuto"),
    DSC_MPP_PHZ("MPP PHZ"),
    DSC_MPP_RESET_1("MPP RESET_1"),
    DSC_MPP_RESET_2("MPP RESET_2"),
    DSC_MPP_ID_CAN("MPP ID CAN"),
    DSC_CORRUPTED_SETUP("Setup corrotto"),
    DSC_LINK_FAILED("Collegamento fallito"),
    DSC_USB_NOT_PRESENT("USB non presente"),
    DSC_WRITE_DATA("Scrittura dati"),
    DSC_FILE_NOT_FOUND("File non trovato"),
    DSC_CARTER_OPEN("Carter aperto"),
    DSC_FILTER_NOT_ACTIVE("Filtro non attivo"),
    DSC_LOW_BATTERY("Batteria scarica"),
    DSC_SIZE_FILE_IN_RAM("Dimensione file in RAM"),
    DSC_MPP_CAN_TX("MPP CAN TX"),
    DSC_MPP_CAN_RX("MPP CAN RX"),
    DSC_MPP_PARAMETER("MPP Parametri"),
    DSC_ADC_OFSET("ADC OFFSET"),
    DSC_ADC_CALIBRATION("ADC Calibrazione"),
    DSC_ADC_TIMEOUT("ADC Timeout"),
    DSC_MPP_FREE1("MPP FREE1"),
    DSC_MPP_FREE2("MPP FREE2"),
    DSC_MPP_SW_OVERRUN("MPP SW OVERRUN"),
    DSC_MPP_CKSUM_PAGE("MPP CKSUM PAGE"),
    DSC_MPP_LENGTH_PAGE("MPP LENGTH PAGE"),
    DSC_MPP_WRITE_FLASH("MPP WRITE_FLASH"),
    DSC_MPP_NUMBER_PAGE("MPP NUMBER PAGE"),
    DSC_MPP_ENCODER_TOLLERANCE("MPP Tolleranza encoder"),
    DSC_MPP_VCC_LOW("MPP VCC LOW"),
    DSC_MPP_HOMING("MPP HOMING"),
    DSC_MAX_QUOTE_CARRIAGE("MASSIMA QUOTA CARRELLO"),
    DSC_MIN_QUOTE_CARRIAGE("MINIMA QUOTA CARRELLO"),
    DSC_MPP_OVER_LOAD_DAG("MPP OVER LOAD DAG"),
    DSC_MPP_FREE5("MPP FREE5"),
    DSC_MPP_OVERLOAD_CARRIAGE("MPP PROTEZIONE"),
    DSC_MPP_OVERLOADED_CARRIAGE("MPP MOTO OSTACOLATO"),
    DSC_MPP_FREE7("MPP FREE7"),
    DSC_MPP_FREE8("MPP FREE8"),
    DSC_SetupCalibrazioneAcq("Acquisizione fondo scala cella di carico"),
    DSC_saveSetup("Salvataggio parametri"),
    DSC_UPDATE_inProgress("Aggiornamento in corso"),
    DSC_cancStorico("Cancellazione storico"),
    DSC_saveStorico("Salvataggio storico"),
    DSC_waitLink("Attesa link a macchina (premi X per interrompere)"),
    DSC_cancFiltri("Cancellazione filtri"),
    DSC_saveAbout("Salvataggio informazioni"),
    DSC_fineAutostart("terminata esecuzione autostart.sh"),
    DSC_UPDATE_ok("Aggiornamento terminato correttamente"),
    DSC_PARAMETERS_ERROR("Errore nei parametri settati (per ora solo strss test)"),
    DSC_StressTest_fine("Aggiornamento terminato correttamente"),
    DSC_Max_Tension("Raggiunta grammatura massima (normalmente 10Kg)"),
    DSC_EmergencyStop("Blocco carro per pressione costa (sensore di sicurezza)");
}