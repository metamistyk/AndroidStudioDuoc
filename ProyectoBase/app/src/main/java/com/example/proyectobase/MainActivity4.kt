package com.example.proyectobase

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.utils.OperacionesMatematicas

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val recibeNumero : EditText = findViewById(R.id.ed_number)
        val recibeNumero2 : EditText = findViewById(R.id.ed_number2)
        val spnCalculadora : Spinner = findViewById(R.id.spCalculadora)
        val btnCalcular : Button = findViewById(R.id.btn_calcular)
        val tvResultado : TextView = findViewById(R.id.tv_resultado)

        // array para el elementos del spinner
        val menuOpciones = arrayOf("Sumar", "Restar", "Multiplicar", "Dividir")
        // adaptador para asignarle al spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menuOpciones)
        // asignamos al spinner
        spnCalculadora.adapter = adapter

        btnCalcular.setOnClickListener{
            var valorNumero: Int = recibeNumero.text.toString().toIntOrNull() ?:0
            var valorNumero2: Int = recibeNumero2.text.toString().toIntOrNull() ?:0

            var resultado = OperacionesMatematicas.sumarNumeros(valorNumero, valorNumero2)
            tvResultado.text = resultado.toString()

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}