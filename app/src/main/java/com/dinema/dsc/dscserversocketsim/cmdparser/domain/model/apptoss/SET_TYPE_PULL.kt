package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "CMD")
class SET_TYPE_PULL @JvmOverloads constructor(
    id: String = "SET_TYPE_PULL",

    @field:Element(name = "TYPE")
    var type: String = ""
) : STANDARD_CMD(id)