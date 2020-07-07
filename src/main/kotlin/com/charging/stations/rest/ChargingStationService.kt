package com.charging.stations.rest

interface ChargingStationService {
    fun getChargingStationDetails(city : String): String?
}