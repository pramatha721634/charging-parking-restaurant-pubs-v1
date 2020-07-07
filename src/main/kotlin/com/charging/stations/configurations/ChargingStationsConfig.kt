package com.charging.stations.configurations

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class ChargingStationsConfig {

    @Value("\${endpoint.url}")
    lateinit var baseUrl: String

    @Value("\${endpoint.cat}")
    lateinit var cat: String

    @Value("\${endpoint.at}")
    lateinit var at: String

    @Value("\${endpoint.apikey}")
    lateinit var apiKey: String

    @Bean
    fun getRestTemplate() : RestTemplate {
        return RestTemplate()
    }
}