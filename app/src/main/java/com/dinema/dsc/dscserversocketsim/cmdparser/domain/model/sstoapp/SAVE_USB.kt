package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


/*
<CMD id="SAVE_USB">\s*
    <TYPE>SAVEUSB_MANUAL</TYPE>\s*
</CMD>
 */
@Root(name = "CMD")
class SAVE_USB @JvmOverloads constructor(
    id: String = "SAVE_USB",

    @field:Element(name = "TYPE")
    var type: String = ""
) : STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {
        val commandPattern = """<CMD id="SAVE_USB">\s*<TYPE>SAVEUSB_MANUAL</TYPE>\s*</CMD>""".trimIndent()
        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}