package ru.vood.example.avro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AvroApplication

fun main(args: Array<String>) {
    runApplication<AvroApplication>(*args)
}
