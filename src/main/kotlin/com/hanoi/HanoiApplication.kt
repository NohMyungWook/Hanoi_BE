package com.hanoi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HanoiApplication

fun main(args: Array<String>) {
    runApplication<HanoiApplication>(*args)
}