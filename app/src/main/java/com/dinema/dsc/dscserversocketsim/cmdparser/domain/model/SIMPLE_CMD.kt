package com.dinema.dsc.blackedition.cmdparser.domain.model

import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

@Root(name = "CMD", strict = false)
open class SIMPLE_CMD(
    id: String = "",

    @field:Text(required = false)
    var content: String = ""
): STANDARD_CMD(id)
