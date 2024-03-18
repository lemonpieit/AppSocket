package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root

/*
<CMD id="SET_MESS">\s*
    <OP>(set|reset)</OP>\s*
    <ID_MESS>($validIdMessValues)</ID_MESS>\s*
</CMD>
 */
@Root(name = "CMD")
@Order(elements = ["OP", "ID_MESS"])
class SET_MESS @JvmOverloads constructor(
    id: String = "SET_MESS",

    @field:Element(name = "OP")
    var op: String = "",

    @field:Element(name = "ID_MESS")
    var idMess: String = ""
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val validIdMessValues = listOf(
            "DSC_noErr", "DSC_homing", "DSC_waitStartup", "DSC_outOfOrder", "DSC_MOTOR_COMMUNICATION",
            "DSC_CAN_BUFFER_FULL", "DSC_MPP_TOOMANY", "DSC_VERSION_MPP_MOTOR_DRIVER", "DSC_MPP_NOT_IDENTIFY",
            "DSC_3ENC_TOOMANY", "DSC_VERSION_3ENC_MOTOR_DRIVER", "DSC_3ENC_NOT_IDENTIFY", "DSC_CONFIGURATION",
            "DSC_UPDATE_FAILED", "DSC_TURN_OFF", "DSC_MISSING_LOAD_CELL", "DSC_MPP_VCC_HIGH", "DSC_MPP_OVERCURRENT",
            "DSC_MPP_TEMPERATURE", "DSC_MPP_HW_UNKNOWN", "DSC_MPP_PHZ", "DSC_MPP_RESET_1", "DSC_MPP_RESET_2",
            "DSC_MPP_ID_CAN", "DSC_CORRUPTED_SETUP", "DSC_LINK_FAILED", "DSC_USB_NOT_PRESENT", "DSC_WRITE_DATA",
            "DSC_FILE_NOT_FOUND", "DSC_CARTER_OPEN", "DSC_FILTER_NOT_ACTIVE", "DSC_LOW_BATTERY", "DSC_SIZE_FILE_IN_RAM",
            "DSC_MPP_CAN_TX", "DSC_MPP_CAN_RX", "DSC_MPP_PARAMETER", "DSC_ADC_OFSET", "DSC_ADC_CALIBRATION",
            "DSC_ADC_TIMEOUT", "DSC_MPP_FREE1", "DSC_MPP_FREE2", "DSC_MPP_SW_OVERRUN", "DSC_MPP_CKSUM_PAGE",
            "DSC_MPP_LENGTH_PAGE", "DSC_MPP_WRITE_FLASH", "DSC_MPP_NUMBER_PAGE", "DSC_MPP_ENCODER_TOLLERANCE",
            "DSC_MPP_VCC_LOW", "DSC_MPP_HOMING", "DSC_MAX_QUOTE_CARRIAGE", "DSC_MIN_QUOTE_CARRIAGE", "DSC_MPP_OVER_LOAD_DAG",
            "DSC_MPP_FREE5", "DSC_MPP_OVERLOAD_CARRIAGE", "DSC_MPP_OVERLOADED_CARRIAGE", "DSC_MPP_FREE7", "DSC_MPP_FREE8",
            "DSC_SetupCalibrazioneAcq", "DSC_saveSetup", "DSC_UPDATE_inProgress", "DSC_cancStorico", "DSC_saveStorico",
            "DSC_waitLink", "DSC_cancFiltri", "DSC_saveAbout", "DSC_fineAutostart", "DSC_UPDATE_ok", "DSC_PARAMETERS_ERROR",
            "DSC_StressTest_fine", "DSC_Max_Tension", "DSC_EmergencyStop"
        ).joinToString("|")

        val commandPattern = """
        <CMD id="SET_MESS">\s*<OP>(set|reset)</OP>\s*<ID_MESS>($validIdMessValues)</ID_MESS>\s*</CMD>
    """.trimIndent()
        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}