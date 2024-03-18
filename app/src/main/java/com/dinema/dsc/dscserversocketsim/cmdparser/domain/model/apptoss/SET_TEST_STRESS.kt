package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root

@Root(name = "CMD")
@Order(elements = ["ACTIVE", "MIN_TYPE", "MAX_TYPE", "W_MIN", "W_MAX", "L_MIN", "L_MAX", "DURATION", "NUM"])
class SET_TEST_STRESS @JvmOverloads constructor(
    id: String = "SET_TEST_STRESS",

    @field:Element(name = "ACTIVE")
    var active: String = "",

    @field:Element(name = "MIN_TYPE")
    var minType: String = "",

    @field:Element(name = "MAX_TYPE")
    var maxType: String = "",

    @field:Element(name = "W_MIN")
    var wMin: Int = 0,

    @field:Element(name = "W_MAX")
    var wMax: Int = 0,

    @field:Element(name = "L_MIN")
    var lMin: Int = 0,

    @field:Element(name = "L_MAX")
    var lMax: Int = 0,

    @field:Element(name = "DURATION")
    var duration: String = "",

    @field:Element(name = "NUM")
    var num: Int = 0
) : STANDARD_CMD(id)