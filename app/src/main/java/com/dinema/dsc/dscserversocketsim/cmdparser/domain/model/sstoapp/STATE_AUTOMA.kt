package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp


import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/*
<CMD id="STATE_AUTOMA">\s*
    <STATE>ST_STARTUP|ST_STARTUP2|ST_OPERATIVE|ST_MEASURE|ST_SECONDMEASURE|ST_ERROR|ST_LINK|ST_LINKED|ST_CALIBRATION|ST_DIAGNOSE|ST_OUTOFORDER|ST_UPDATE</STATE>\s*
</CMD>
 */
@Root(name = "CMD")
class STATE_AUTOMA @JvmOverloads constructor(
    id: String = "STATE_AUTOMA",

    @field:Element(name = "STATE")
    var state: String = ""
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val validStateValues = listOf(
            "ST_STARTUP", "ST_STARTUP2", "ST_OPERATIVE", "ST_MEASURE", "ST_SECONDMEASURE",
            "ST_ERROR", "ST_LINK", "ST_LINKED", "ST_CALIBRATION", "ST_DIAGNOSE", "ST_OUTOFORDER", "ST_UPDATE"
        ).joinToString("|")

        val commandPattern = """
        <CMD id="STATE_AUTOMA">\s*<STATE>($validStateValues)</STATE>\s*</CMD>
    """.trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}