package com.charging.stations

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChargingStationsV1Application

fun main(args: Array<String>) {
    runApplication<ChargingStationsV1Application>(*args)
}
