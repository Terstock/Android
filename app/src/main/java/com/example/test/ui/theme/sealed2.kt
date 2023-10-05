package com.example.test.ui.theme

//class Shape
sealed class sealed2 {
    class Rectangle(val width: Int, val height: Int) : sealed2()
    class Oval(val radiusX: Int, val radiusY: Int) : sealed2()
    class Line(val length: Int) : sealed2()

}
