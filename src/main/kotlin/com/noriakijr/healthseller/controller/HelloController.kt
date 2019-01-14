package com.noriakijr.healthseller.controller

import com.noriakijr.healthseller.entity.Message
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val service: com.noriakijr.healthseller.controller.Service) {

    @GetMapping("hello")
    fun hello(@RequestParam name: String) = service.getPersonalizedHello(name)

}

@Service
class Service {

    @Autowired
    lateinit var helloRepository: HelloRepository

    fun getPersonalizedHello(name: String): String {
        val message = "Hello, ${name.capitalize()}!"
        helloRepository.save(
            Message(
                id = null,
                title = "Hi!",
                description = message
            )
        )

        return message
    }

}

interface HelloRepository : CrudRepository<Message, Long>
