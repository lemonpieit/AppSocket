package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root

/*
command pattern:
<CMD id="GET_3ENC">\s*
        <PULS_START>(press|ril)</PULS_START>\s*
        <CLIP>(larg|lung)</CLIP>\s*
        <CLIP_DIAGNO>(larg|lung)</CLIP_DIAGNO>\s*
        <ROTELLA_PRINC>(inUso|nonUsata)</ROTELLA_PRINC>\s*
        <ROTELLA_LAT>(inUso|nonUsata)</ROTELLA_LAT>\s*
        <ENC_ZONA2>\d+</ENC_ZONA2>\s*
        <ENC_ZONA3>\d+</ENC_ZONA3>\s*
        <ENC_DIFF>\d+</ENC_DIFF>\s*
        <CELLA>(presente|assente)</CELLA>\s*
</CMD>
 */

@Root(name = "CMD")
@Order(elements = ["PULS_START", "CLIP", "CLIP_DIAGNO", "ROTELLA_PRINC", "ROTELLA_LAT", "ENC_ZONA2", "ENC_ZONA3", "ENC_DIFF", "CELLA"])
class GET_3ENC @JvmOverloads constructor(
    id: String = "GET_3ENC",

    @field:Element(name = "PULS_START")
    var pulsStart: String = "",

    @field:Element(name = "CLIP")
    var clip: String = "",

    @field:Element(name = "CLIP_DIAGNO")
    var clipDiagno: String = "",

    @field:Element(name = "ROTELLA_PRINC")
    var rotellaPrinc: String = "",

    @field:Element(name = "ROTELLA_LAT")
    var rotellaLat: String = "",

    @field:Element(name = "ENC_ZONA2")
    var encZona2: Int = 0,

    @field:Element(name = "ENC_ZONA3")
    var encZona3: Int = 0,

    @field:Element(name = "ENC_DIFF")
    var encDiff: Int = 0,

    @field:Element(name = "CELLA")
    var cella: String = ""
) : STANDARD_CMD(id) {


    override fun validateCommand(command: String): Boolean {
        val commandPattern = """
        <CMD id="GET_3ENC">\s*<PULS_START>(press|ril)</PULS_START>\s*<CLIP>(larg|lung)</CLIP>\s*<CLIP_DIAGNO>(larg|lung)</CLIP_DIAGNO>\s*<ROTELLA_PRINC>(inUso|nonUsata)</ROTELLA_PRINC>\s*<ROTELLA_LAT>(inUso|nonUsata)</ROTELLA_LAT>\s*<ENC_ZONA2>\d+</ENC_ZONA2>\s*<ENC_ZONA3>\d+</ENC_ZONA3>\s*<ENC_DIFF>\d+</ENC_DIFF>\s*<CELLA>(presente|assente)</CELLA>\s*</CMD>""".trimIndent()

        val regex =
            Regex(commandPattern, setOf(RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE))
        return regex.matches(command.trim())
    }
}