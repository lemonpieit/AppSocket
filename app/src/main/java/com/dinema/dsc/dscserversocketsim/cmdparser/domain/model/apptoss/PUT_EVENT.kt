package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "CMD")
class PUT_EVENT @JvmOverloads constructor(
    id: String = "PUT_EVENT",

    @field:Element(name = "EV")
    var ev: String = ""
) : STANDARD_CMD(id)


