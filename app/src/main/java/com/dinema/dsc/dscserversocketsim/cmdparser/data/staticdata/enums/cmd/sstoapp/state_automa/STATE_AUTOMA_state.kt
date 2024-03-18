package com.dinema.dsc.blackedition.cmdparser.data.staticdata.enums.cmd.sstoapp.state_automa

enum class STATE_AUTOMA_state(val paramName: String) {
    ST_STARTUP("ST_STARTUP"),
    ST_STARTUP2("ST_STARTUP2"),
    ST_OPERATIVE("ST_OPERATIVE"),
    ST_MEASURE("ST_MEASURE"),
    ST_SECONDMEASURE("ST_SECONDMEASURE"),
    ST_ERROR("ST_ERROR"),
    ST_LINK("ST_LINK"),
    ST_LINKED("ST_LINKED"),
    ST_CALIBRATION("ST_CALIBRATION"),
    ST_DIAGNOSE("ST_DIAGNOSE"),
    ST_OUTOFORDER("ST_OUTOFORDER"),
    ST_UPDATE("ST_UPDATE")
}