package com.crincongtz.myapp_03funciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var numero1 = 50
    var numero2 = 33

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        sumarDosNumeros(numero1, numero2)

        val numero3 = sumarDosNumeros2(numero1, numero2)
        Log.i("CursoKotlin", "El resultado de la suma del numero $numero1 y $numero2 es: $numero3")

        val numero4 = sumarDosNumeros3(numero1, numero2)
        Log.w("CursoKotlin", "El resultado de la suma del numero $numero1 y $numero2 es: $numero4")
    }

    fun sumarDosNumeros(n1: Int, n2: Int) {
        val resultado = n1 + n2
        Log.d("CursoKotlin", "El resultado de la suma del numero $numero1 y $numero2 es: $resultado")
    }

    fun sumarDosNumeros2(n1: Int, n2: Int) : Int {
        return n1 + n2
    }

    fun sumarDosNumeros3(n1: Int, n2: Int) = n1 + n2



}