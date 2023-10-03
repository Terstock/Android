package com.example.test.ui.theme

class Duck(name: String, age: Int): Animal(name, age), Flyable, Swimable {

    val maxDuration = 30
    private val maxFlyDuration =  20
    private val maxSwimDuration =  20
    override fun move(duration: Int): Boolean {
        return duration <= maxDuration
    }

    override fun fly(duration: Int): Boolean {
        return duration <= maxFlyDuration
    }

    override fun swim(duration: Int): Boolean {
        return duration < maxSwimDuration
    }

    fun eat():Int? {
    return null
    }
}