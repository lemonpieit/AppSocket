package com.dinema.dsc.blackedition.cmdparser.domain.model.sstoapp

import com.dinema.dsc.blackedition.cmdparser.domain.model.SIMPLE_CMD
import org.simpleframework.xml.Root

@Root(name = "CMD")
class STOP_MEASURE @JvmOverloads constructor(
    id: String = "STOP_MEASURE"
): SIMPLE_CMD(id)
