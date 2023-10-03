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
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {

    lateinit var v3:String
    private val v1 = "dfdfdf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.main_activity)


            ///testus

            ///testus2


            var v2 = 4.5f

            v2 = 4.5f

            //val v4 = sum(c =5.6, a = 4.5 )
            val v5 = myOuterFun(4, ::myInnerFun)
            val v6 = myOuterFun(3, {
                //dfdfd
                it
                return@myOuterFun "fgfgf"
            })
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