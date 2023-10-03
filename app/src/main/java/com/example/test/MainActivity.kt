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
import com.example.test.ui.theme.Dog
import com.example.test.ui.theme.Duck
import com.example.test.ui.theme.Flyable
import com.example.test.ui.theme.Swimable
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {

    lateinit var v3:String
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
        duck.maxDuration
        val isSwim = duck.swim(43)
    }

    fun myOuterFun(number:Int, innerFun:(myString: String) -> String):Int{
        //something
        val call = innerFun("Some string")
        return number + number
    }

    fun myInnerFun(myString: String): String{
        //dfdfd
        return "sdsdsd"
    }
    //fun sum(a:Double, b:Double = 0.0, c:Double=-1.0): Double{}
}