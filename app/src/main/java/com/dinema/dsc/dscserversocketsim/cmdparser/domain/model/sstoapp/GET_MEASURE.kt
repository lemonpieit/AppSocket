package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root

/*
<CMD id="GET_MEASURE">\s*
        <MIS>\d+</MIS>\s*
        <MIS2>\d+</MIS2>\s*
        <PESO>\d+</PESO>\s*
        <TIPO>(larg|lung)</TIPO>\s*
</CMD>
 */
@Root(name = "CMD")
@Order(elements = ["MIS", "MIS2", "PESO", "TIPO"])
class GET_MEASURE @JvmOverloads constructor(
    id: String = "GET_MEASURE",

    @field:Element(name = "MIS")
    var mis: Int = 0,

    @field:Element(name = "MIS2")
    var mis2: Int = 0,

    @field:Element(name = "PESO")
    var peso: Int = 0,

    @field:Element(name = "TIPO")
    var tipo: String = ""
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
        <CMD id="GET_MEASURE">\s*<MIS>\d+</MIS>\s*<MIS2>\d+</MIS2>\s*<PESO>\d+</PESO>\s*<TIPO>(larg|lung)</TIPO>\s*</CMD>
    """.trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}