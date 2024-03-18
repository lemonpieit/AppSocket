package com.dinema.dsc.blackedition.cmdparser.domain.model.apptoss

import com.dinema.dsc.blackedition.cmdparser.domain.model.SIMPLE_CMD
import org.simpleframework.xml.Root


@Root(name = "CMD")
class RESET_STORICO @JvmOverloads constructor(
    id: String = "RESET_STORICO"
): SIMPLE_CMD(id)