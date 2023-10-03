package com.example.test.ui.theme

    class Fish(name: String, age: Int): Animal(name, age), Swimable {

    private val maxSwimDuration =  120

    override fun swim(duration: Int): Boolean {
        return duration < maxSwimDuration
    }

    fun eat():Int? {
        return null
    }
}