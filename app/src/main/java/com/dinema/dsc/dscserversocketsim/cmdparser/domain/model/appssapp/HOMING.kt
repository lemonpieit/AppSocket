package com.dinema.dsc.blackedition.cmdparser.domain.model.appssapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.SIMPLE_CMD
import org.simpleframework.xml.Root

/*
<CMD id="HOMING">\s*
    (inHoming|Home)\s*
</CMD>

 */
@Root(name = "CMD")
class HOMING @JvmOverloads constructor(
    id: String = "HOMING"
): SIMPLE_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
        <CMD id="HOMING">\s*(inHoming|Home)\s*</CMD>
    """.trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())}
}