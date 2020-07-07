package com.charging.stations.controller

import com.charging.stations.rest.ChargingStationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ChargingStationController {

    @Autowired
    lateinit var chargingStationService: ChargingStationService

    @GetMapping("/charging_stations/{city}")
    fun getChargingStation(@PathVariable city: String): String? {
        return chargingStationService.getChargingStationDetails(city)
    }
}