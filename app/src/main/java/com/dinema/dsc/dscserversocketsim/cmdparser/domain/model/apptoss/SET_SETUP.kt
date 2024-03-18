package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root


@Root(name = "CMD")
@Order(elements = ["PULL_W", "PULL_SPECIAL_W1", "PULL_SPECIAL_W2", "PULL_L", "PULL_SPECIAL_L1", "PULL_SPECIAL_L2", "UNIT"])
class SET_SETUP @JvmOverloads constructor(
    id: String = "SET_SETUP",

    @field:Element(name = "PULL_W")
    var pullW: Int = 0,

    @field:Element(name = "PULL_SPECIAL_W1")
    var pullSpecialW1: Int = 0,

    @field:Element(name = "PULL_SPECIAL_W2")
    var pullSpecialW2: Int = 0,

    @field:Element(name = "PULL_L")
    var pullL: Int = 0,

    @field:Element(name = "PULL_SPECIAL_L1")
    var pullSpecialL1: Int = 0,

    @field:Element(name = "PULL_SPECIAL_L2")
    var pullSpecialL2: Int = 0,

    @field:Element(name = "UNIT")
    var unit: String = ""
) : STANDARD_CMD(id)