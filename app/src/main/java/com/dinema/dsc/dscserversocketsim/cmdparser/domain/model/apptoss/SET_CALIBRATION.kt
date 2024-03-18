package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Order
import org.simpleframework.xml.Root


@Root(name = "CMD")
@Order(elements = ["SPEED", "BUTTON_UP", "BUTTON_DOWN", "BUTTON_ACQ"])
class SET_CALIBRATION @JvmOverloads constructor(
    id: String = "SET_CALIBRATION",

    @field:Element(name = "SPEED")
    var speed: String = "",

    @field:Element(name = "BUTTON_UP")
    var buttonUp: String = "",

    @field:Element(name = "BUTTON_DOWN")
    var buttonDown: String = "",

    @field:Element(name = "BUTTON_ACQ")
    var buttonAcq: String = ""
) : STANDARD_CMD(id)