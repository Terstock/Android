package com.example.test.ui.theme

import kotlin.contracts.Returns
import kotlin.time.Duration

class Dog(name: String, age: Int, weight: Int): Animal(name,age, weight), Swimable, Growing, Voicing {

    val maxDuration = 30
    private val maxSwimDuration =  60
    private val maxWeight = 12
    override fun move(duration: Int): Boolean {
        return duration <= maxDuration
    }

    override fun swim(duration: Int): Boolean {
        return duration < maxSwimDuration
    }
    override fun grow(duration: Int): Boolean {
        return duration == maxWeight

    }

    override fun loudvoice() {
        println("loud")
    }

    override fun quietvoice() {
        println("quiet")
    }




}