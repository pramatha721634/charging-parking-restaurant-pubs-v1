package com.charging.stations.response

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
class AggregatedResponse {

    lateinit var charging_stations  : ChargingStationsResponse
    lateinit var parking_facility   : ChargingStationsResponse
    lateinit var eat_drink          : ChargingStationsResponse

    constructor()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AggregatedResponse

        if (charging_stations != other.charging_stations) return false
        if (parking_facility != other.parking_facility) return false
        if (eat_drink != other.eat_drink) return false

        return true
    }

    override fun hashCode(): Int {
        var result = charging_stations.hashCode()
        result = 31 * result + parking_facility.hashCode()
        result = 31 * result + eat_drink.hashCode()
        return result
    }
}