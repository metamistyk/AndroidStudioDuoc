package com.example.proyectobase.utils

// se cambia de class a object
object OperacionesMatematicas {

    // funcion sumar
    fun sumarNumeros(valor1: Int, valor2: Int) : Int{
        val resultado = valor1 + valor2
        return resultado
    }

    fun dividirNumeros(valor1: Int, valor2: Int): Int{
        try {
            val resultado = valor1 / valor2
            return resultado
        }catch(e: ArithmeticException) {
            println("Se ha controlado el error división 0.")
        }finally {
            println("Se ha reiniciado.")
        }
        return  0
    }

}