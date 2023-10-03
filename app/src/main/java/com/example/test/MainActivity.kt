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
import com.example.test.ui.theme.Flyable
import com.example.test.ui.theme.Swimable
import com.example.test.ui.theme.TestTheme
import com.example.test.ui.theme.UserModel

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

        val duck: Duck = Duck("Tom", 3)
        val dog: Dog = Dog("Andreq", 1)
        duck.maxDuration
        val isSwim = duck.swim(43)

        val animals = listOf<Animal>(dog, duck)
        val list = arrayListOf<Animal>(dog, duck)

        animals[0]
        animals.get(1)

        list.add(Dog("Rex", 5))
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
                it.age
            )
            d
        }


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

            Direction.EAST -> {
                //fffws
            }
        }

        val error = getError()

        when (error) {
            AuthError.LoginError -> TODO()
            AuthError.PasswordError -> TODO()
            is AuthError.UnknownError -> {


            }
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

