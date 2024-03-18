package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root


/*
<CMD id="GET_MPP">\s*
    <ADC_CALIBRAZ_CELLA>\d+</ADC_CALIBRAZ_CELLA>\s*
    <BATTERY_LEVEL>(POWERSUPPLY_LOAD|POWERSUPPLY|BATTERY_FULL1|BATTERY_FULL2|BATTERY_FULL3|BATTERY_FULL4|BATTERY_FULL5|BATTERY_MED1|BATTERY_MED2|BATTERY_MED3|BATTERY_MED4|BATTERY_LOW)</BATTERY_LEVEL>\s*
    <PRESS_CELLA>\d+</PRESS_CELLA>\s*<OFFSET>\d+</OFFSET>\s*
</CMD>
 */
@Root(name = "CMD")
@Order(elements = ["ADC_CALIBRAZ_CELLA", "BATTERY_LEVEL", "PRESS_CELLA", "OFFSET"])
class GET_MPP @JvmOverloads constructor(
    id: String = "GET_MPP",

    @field:Element(name = "ADC_CALIBRAZ_CELLA")
    var adcCalibrazCella: Int = 0,

    @field:Element(name = "BATTERY_LEVEL")
    var batteryLevel: String = "",

    @field:Element(name = "PRESS_CELLA")
    var pressCella: Int = 0,

    @field:Element(name = "OFFSET")
    var offset: Int = 0
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
                    <CMD id="GET_MPP">\s*<ADC_CALIBRAZ_CELLA>\d+</ADC_CALIBRAZ_CELLA>\s*<BATTERY_LEVEL>(POWERSUPPLY_LOAD|POWERSUPPLY|BATTERY_FULL1|BATTERY_FULL2|BATTERY_FULL3|BATTERY_FULL4|BATTERY_FULL5|BATTERY_MED1|BATTERY_MED2|BATTERY_MED3|BATTERY_MED4|BATTERY_LOW)</BATTERY_LEVEL>\s*<PRESS_CELLA>\d+</PRESS_CELLA>\s*<OFFSET>\d+</OFFSET>\s*</CMD>
                """.trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }

}