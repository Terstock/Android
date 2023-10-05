package com.example.test.ui.theme

data class Figure(val width: Int, val height: Int){
    var area: Int = 0
        private set(value) {
            field = value
        }
        get() = width * height
    }




