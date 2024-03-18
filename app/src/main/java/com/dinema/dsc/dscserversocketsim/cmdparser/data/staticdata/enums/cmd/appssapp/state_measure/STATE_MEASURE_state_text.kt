package com.dinema.dsc.blackedition.cmdparser.data.staticdata.enums.cmd.appssapp.state_measure

enum class STATE_MEASURE_state_text(val paramName: String) {
    MEASURE_OFF("fuori misurazione"),
    MEASURE_STARTED("avvio misurazione"),
    MEASURE_RUN("misurazione in esecuzione"),
    MEASURE_STOPPED("misurazione interrotta"),
    MEASURE_SECOND("attesa seconda misurazione"),
    MEASURE_FINISHED("fine misurazione"),
    MEASURE_END("quote misurazione disponibili")
}