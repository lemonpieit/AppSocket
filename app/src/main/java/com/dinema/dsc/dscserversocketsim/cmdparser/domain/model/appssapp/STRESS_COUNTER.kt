package com.dinema.dsc.blackedition.cmdparser.domain.model.appssapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root

/*
<CMD id="STRESS_COUNTER">\s*
    <MIN>\d+</MIN>\s*
    <MAX>\d+</MAX>\s*
</CMD>
 */
@Root(name = "CMD")
@Order(elements = ["MIN", "MAX"])
class STRESS_COUNTER @JvmOverloads constructor(
    id: String = "STRESS_COUNTER",

    @field:Element(name = "MIN")
    var min: Int = 0,

    @field:Element(name = "MAX")
    var max: Int = 0
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
        <CMD id="STRESS_COUNTER">\s*<MIN>\d+</MIN>\s*<MAX>\d+</MAX>\s*</CMD>
    """.trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}