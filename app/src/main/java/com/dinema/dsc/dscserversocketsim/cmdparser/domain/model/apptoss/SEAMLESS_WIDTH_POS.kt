package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss


import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root


@Root(name = "CMD")
class SEAMLESS_WIDTH_POS @JvmOverloads constructor(
    id: String = "SEAMLESS_WIDTH_POS",

    @field:Element(name = "POS")
    var pos: String = ""
) : STANDARD_CMD(id)