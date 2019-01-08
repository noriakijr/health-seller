package com.noriakijr.healthseller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.stereotype.Service

@RestController
class HelloController(val service: com.noriakijr.healthseller.controller.Service) {

    @GetMapping("hello")
    fun hello(@RequestParam name: String) = service.getPersonalizedHello(name)

}

@Service
class Service {
    fun getPersonalizedHello(name: String): String = "Hello, ${name.capitalize()}!"
}
