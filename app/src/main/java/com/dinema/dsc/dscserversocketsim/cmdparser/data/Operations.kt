package com.dinema.dsc.blackedition.cmdparser.data

import com.dinema.dsc.blackedition.cmdparser.domain.model.STANDARD_CMD
import org.simpleframework.xml.core.Persister
import java.io.StringReader
import java.io.StringWriter

inline fun <reified T : STANDARD_CMD> serialize(cmd: T): String {
    val serializer = Persister()
    val writer = StringWriter()
    serializer.write(cmd, writer)
    return writer.toString()
}

inline fun <reified T : STANDARD_CMD> deserialize(xml: String): T {
    val serializer = Persister()
    return serializer.read(T::class.java, StringReader(xml))
}
