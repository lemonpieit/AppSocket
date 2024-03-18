package com.dinema.dsc.blackedition.cmdparser.data.staticdata.enums.cmd.sstoapp.save_usb

enum class SAVE_USB_type_text(val paramName: String) {
    SAVEUSB_NO("i risultati non devono essere salvati"),
    SAVEUSB_MANUAL("i risultati vengono salvati nel file delle misurazioni manuali"),
    SAVEUSB_AUTOMATIC("i risultati vengono salvati nel file delle misurazioni automatiche"),
    SAVEUSB_MANUAL_AVANZATA("i risultati vengono salvati nel file delle misurazioni manuali avanzate")
}