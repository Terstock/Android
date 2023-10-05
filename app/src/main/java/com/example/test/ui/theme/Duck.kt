package com.example.test.ui.theme

class Duck(name: String, age: Int, weight: Int): Animal(name, age, weight), Flyable, Swimable, Growing, Voicing {

    val maxDuration = 30
    private val maxFlyDuration =  20
    private val maxSwimDuration =  20
    private val maxWeight = 5
    override fun move(duration: Int): Boolean {
        return duration <= maxDuration
    }

    override fun fly(duration: Int): Boolean {
        return duration <= maxFlyDuration
    }

    override fun swim(duration: Int): Boolean {
        return duration < maxSwimDuration
    }

    override fun grow(duration: Int): Boolean {
        return duration == maxWeight
    }

    override fun quietvoice() {
        super.quietvoice()
    }


    fun eat(): Int? {
    return null
    }
}