package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.SIMPLE_CMD
import org.simpleframework.xml.Root



@Root(name = "CMD")
class FACTORY_SETUP @JvmOverloads constructor(
    id: String = "FACTORY_SETUP"
): SIMPLE_CMD(id)