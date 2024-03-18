package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root

/*
<CMD id="SET_VERSION">\s*
    <DSC_VERSION>.+?</DSC_VERSION>\s*
    <MPP_VERSION>.+?</MPP_VERSION>\s*
    <ENC_VERSION>.+?</ENC_VERSION>\s*
</CMD>
*/
@Root(name = "CMD")
@Order(elements = ["DSC_VERSION", "MPP_VERSION", "ENC_VERSION"])
class SET_VERSION @JvmOverloads constructor(
    id: String = "SET_VERSION",

    @field:Element(name = "DSC_VERSION", required = false)
    var dscVersion: String = "",

    @field:Element(name = "MPP_VERSION", required = false)
    var mppVersion: String = "",

    @field:Element(name = "ENC_VERSION", required = false)
    var encVersion: String = ""
): STANDARD_CMD(id){

    override fun validateCommand(command: String): Boolean {

        val commandPattern = """<CMD id="SET_VERSION">\s*<DSC_VERSION>.+?</DSC_VERSION>\s*<MPP_VERSION>.+?</MPP_VERSION>\s*<ENC_VERSION>.+?</ENC_VERSION>\s*</CMD>""".trimIndent()

        val regex = Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}


