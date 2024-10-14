package com.aiconnect.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class HavitEurekaApplication

fun main(args: Array<String>) {
	runApplication<HavitEurekaApplication>(*args)
}
