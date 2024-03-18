package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.SIMPLE_CMD
import org.simpleframework.xml.Root


@Root(name = "CMD")
class SET_AUTOMATIC_MEASURE @JvmOverloads constructor(
    id: String = "SET_AUTOMATIC_MEASURE"
): SIMPLE_CMD(id)