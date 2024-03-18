package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root


@Root(name = "CMD")
@Order(elements = ["PULL_W", "PULL_L", "UNIT"])
class SET_SETUP_LIGHT @JvmOverloads constructor(
    id: String = "SET_SETUP_LIGHT",

    @field:Element(name = "PULL_W")
    var pullW: Int = 0,

    @field:Element(name = "PULL_L")
    var pullL: Int = 0,

    @field:Element(name = "UNIT")
    var unit: String = ""
) : STANDARD_CMD(id)