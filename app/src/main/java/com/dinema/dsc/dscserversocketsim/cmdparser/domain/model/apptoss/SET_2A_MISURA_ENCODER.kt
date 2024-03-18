package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.SIMPLE_CMD
import org.simpleframework.xml.Root

@Root(name = "CMD")
class SET_2A_MISURA_ENCODER @JvmOverloads constructor(
    id: String = "SET_2A_MISURA_ENCODER"
): SIMPLE_CMD(id)