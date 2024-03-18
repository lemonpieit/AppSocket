package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


/*
<CMD id="GET_STORICO">\s*
    <MIS>\d+</MIS>\s*
</CMD>
 */
@Root(name = "CMD")
class GET_STORICO @JvmOverloads constructor(
    id: String = "GET_STORICO",

    @field:Element(name = "MIS")
    var mis: Int = 0
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
                <CMD id="GET_STORICO">\s*<MIS>\d+</MIS>\s*</CMD>
            """.trimIndent()
        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}