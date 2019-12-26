package com.sandbox

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class Health {

    @GetMapping
    fun health() = mapOf("status" to true)
}