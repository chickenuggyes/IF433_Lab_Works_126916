package OOP_126916_CarolineSandraChen.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== Mematikan semua perangkat yang bisa dimatikan ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}