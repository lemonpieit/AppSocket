package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "CMD")
class SET_IO @JvmOverloads constructor(
    id: String = "SET_IO",

    @field:Element(name = "LIGHT")
    var light: String = ""
) : STANDARD_CMD(id)