package com.dinema.dsc.blackedition.cmdparser.domain.model.appssapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


/*
<CMD id="STATE_MEASURE">\s*
    <STATE>MEASURE_OFF|MEASURE_STARTED|MEASURE_RUN|MEASURE_STOPPED|MEASURE_SECOND|MEASURE_FINISHED|MEASURE_END</STATE>\s*
</CMD>
 */
@Root(name = "CMD")
class STATE_MEASURE @JvmOverloads constructor(
    id: String = "STATE_MEASURE",

    @field:Element(name = "STATE")
    var state: String = ""
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val validStateValues = listOf(
            "MEASURE_OFF", "MEASURE_STARTED", "MEASURE_RUN", "MEASURE_STOPPED",
            "MEASURE_SECOND", "MEASURE_FINISHED", "MEASURE_END"
        ).joinToString("|") { it }

        val commandPattern = """<CMD id="STATE_MEASURE">\s*<STATE>($validStateValues)</STATE>\s*</CMD>
    """.trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }

}