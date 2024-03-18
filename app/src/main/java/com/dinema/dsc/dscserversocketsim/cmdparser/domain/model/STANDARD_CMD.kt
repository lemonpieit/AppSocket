package com.dinema.dsc.blackedition.cmdparser.domain.model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root


@Root(name = "CMD")
open class STANDARD_CMD(
    @field:Attribute(name = "id")
    open var id: String = ""
){
    open fun validateCommand(command: String): Boolean{return true}
}
