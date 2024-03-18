package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp



import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/*
<CMD id="SAVE_CALIBRATION">\s*
    <ADC_CALIBRAZ_CELLA>\d+
    </ADC_CALIBRAZ_CELLA>\s*
</CMD>
 */
@Root(name = "CMD")
class SAVE_CALIBRATION @JvmOverloads constructor(
    id: String = "SAVE_CALIBRATION",

    @field:Element(name = "ADC_CALIBRAZ_CELLA")
    var adcCalibrazCella: Int = 0
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """<CMD id="SAVE_CALIBRATION">\s*<ADC_CALIBRAZ_CELLA>\d+</ADC_CALIBRAZ_CELLA>\s*</CMD>""".trimIndent()
        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}