package com.charging.stations.controller

import com.charging.stations.response.AggregatedResponse
import com.charging.stations.response.ChargingStationsResponse
import com.charging.stations.rest.ChargingStationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ChargingStationController {

    @Autowired
    lateinit var chargingStationService: ChargingStationService

    @GetMapping("/api_details/{city}")
    fun getChargingStation(@PathVariable city: String): AggregatedResponse? {
        return chargingStationService.getChargingStationDetails(city)
    }
}