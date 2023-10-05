package com.example.test.ui.theme

    class Fish(name: String, age: Int, weight: Int): Animal(name, age, weight), Swimable, Growing{

    val maxDuration = 30
    private val maxSwimDuration =  120
    private val maxWeight = 4
    private val loudness = 3
    override fun move(duration: Int): Boolean {
        return duration <= maxDuration
    }

        override fun swim(duration: Int): Boolean {
            return duration < maxSwimDuration
        }

        override fun grow(duration: Int): Boolean {
            return duration == maxWeight
        }


    }
