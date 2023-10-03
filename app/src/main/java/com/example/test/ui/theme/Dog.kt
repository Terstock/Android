package com.example.test.ui.theme

import kotlin.contracts.Returns
import kotlin.time.Duration

class Dog(name: String, age: Int): Animal(name,age){

    val maxDuration = 30
    override fun move(duration: Int): Boolean {
    return duration <= maxDuration
    }
}