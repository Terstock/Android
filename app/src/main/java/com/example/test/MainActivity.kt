package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.ui.theme.Animal
import com.example.test.ui.theme.AuthError
import com.example.test.ui.theme.Direction
import com.example.test.ui.theme.Dog
import com.example.test.ui.theme.Duck
import com.example.test.ui.theme.Figure
import com.example.test.ui.theme.Fish
import com.example.test.ui.theme.Flyable
import com.example.test.ui.theme.Person
import com.example.test.ui.theme.Swimable
import com.example.test.ui.theme.TestTheme
import com.example.test.ui.theme.UserModel
import com.example.test.ui.theme.sealed2

class MainActivity : ComponentActivity() {

    lateinit var v3: String
    private val v1 = "dfdfdf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.main_activity)

        var v1: String? = "fgfg"
        v1 = null
        ///testus

        ///testus2

        //val v4 = sum(c =5.6, a = 4.5 )
        val v5 = myOuterFun(4, ::myInnerFun)
        val v6 = myOuterFun(3) {
            //dfdfd
            it
            return@myOuterFun "fgfgf"
        }

        val duck: Duck = Duck("Tom", 3, 4)
        val dog: Dog = Dog("Andreq", 1, 8)
        duck.maxDuration
        val isSwim = duck.swim(43)

        val animals = listOf<Animal>(dog, duck)
        val list = arrayListOf<Animal>(dog, duck)

        animals[0]
        animals.get(1)

        list.add(Dog("Rex", 5, 12))
        list.addAll(animals)

        list.forEach { a ->
            a.name
        }

        list.forEachIndexed { index, animal ->

        }

        val list2 = list.filter {
            it.age > 4
        }

        val v7 = list.firstOrNull {
            it.age > 4
        }

        val names: List<Dog> = list.map {
            val d = Dog(
                it.name,
                it.age,
                it.weight
            )
            d
        }

        val fish: Fish = Fish("Yoko", 1, 2)


        val user = UserModel(
            name = "Rex",
            email = "fgfg",
            age = 23
        )

        //val user = Pair("asasas",4)

        val dir = getDirection()
        when (dir) {
            Direction.NORTH -> myInnerFun("asa")
            Direction.SOUTH -> {
                //sdsd
            }

            Direction.WEST -> {
                //sasas
            }

            Direction.EAST -> myInnerFun("assa")
        }

        val error = getError()

        when (error) {
            AuthError.LoginError -> TODO()
            AuthError.PasswordError -> TODO()
            is AuthError.UnknownError -> {


            }
        }

        fun exercise() {

            //Цикл While:
            var i = 12
            while (i <= 5) {
                println("Повторення $i")
                i++

                //Цикл do-while:
                var i = 1
                do {
                    println("Повторення $i")
                    i++
                } while (i <= 5)
            }
        }


        // Створення екземпляра класу Person
        fun people() {
            val pers: Person = Person("Іван", 30)

            // Виклик функції представитися() для екземпляра особи
            pers.represent()
        }


        val figures = listOf(
            Figure(50, 100),
            Figure(2, 7),
            Figure(3, 3)
        )

        // Рахуємо загальну суму полів area в циклі
        var totalArea = 0
        for (figure in figures) {
         totalArea += figure.area
         }
        //  println("Загальна площа усіх фігур: $totalArea")




        //працюємо з sealed class Shape
        val shapes = listOf(
            sealed2.Rectangle(3, 5),
            sealed2.Oval(4, 6),
            sealed2.Line(10),
            sealed2.Rectangle(2, 4),
            sealed2.Line(7),
            sealed2.Oval(3, 3)
        )
        val rectanglesCount = shapes.filterIsInstance<sealed2.Rectangle>().size
        val ovalsCount = shapes.filterIsInstance<sealed2.Oval>().size
        val linesCount = shapes.filterIsInstance<sealed2.Line>().size

        //   println("Кількість Rectangle: $rectanglesCount")
        //   println("Кількість Oval: $ovalsCount")
        //   println("Кількість Line: $linesCount")

        var rectanglesCountWhen = 0
        var ovalsCountWhen = 0
        var linesCountWhen = 0

        for (shape in shapes) {
            when (shape) {
                is sealed2.Rectangle -> rectanglesCountWhen++
                is sealed2.Oval -> ovalsCountWhen++
                is sealed2.Line -> linesCountWhen++
            }

            //   println("Кількість Rectangle (з використанням when): $rectanglesCountWhen")
            //   println("Кількість Oval (з використанням when): $ovalsCountWhen")
            //   println("Кількість Line (з використанням when): $linesCountWhen")

        }
    }






        fun getDirection(): Direction {
            return Direction.NORTH
        }















    fun getError(): AuthError {
            val v = 1

            if (v > 3) {
                return AuthError.LoginError
            } else return AuthError.UnknownError("asasa")
        }

        fun myOuterFun(number: Int, innerFun: (myString: String) -> String): Int {
            //something
            val call = innerFun("Some string")
            return number + number
        }

        fun myInnerFun(myString: String): String {
            //dfdfd
            return "sdsdsd"
        }
        //fun sum(a:Double, b:Double = 0.0, c:Double=-1.0): Double{}
    }

