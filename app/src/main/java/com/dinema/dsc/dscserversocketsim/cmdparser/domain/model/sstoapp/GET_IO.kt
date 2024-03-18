package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root


/*
<CMD id="GET_IO">\s*
        <MC>(LONATI|SANTONI|MATEC)</MC>\s*
        <COSTA>(on|off)</COSTA>\s*
</CMD>
 */
@Root(name = "CMD")
@Order(elements = ["MC", "COSTA"])
class GET_IO @JvmOverloads constructor(
    id: String = "GET_IO",

    @field:Element(name = "MC")
    var mc: String = "",

    @field:Element(name = "COSTA")
    var costa: String = ""
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
        <CMD id="GET_IO">\s*<MC>(LONATI|SANTONI|MATEC)</MC>\s*<COSTA>(on|off)</COSTA>\s*</CMD>""".trimIndent()
        val regex =
            Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }

}